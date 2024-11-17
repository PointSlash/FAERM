#include <SPI.h>
#include <MFRC522.h>
#include <Adafruit_Fingerprint.h>
//rfid
#define RST_PIN         5          // Configurable, see typical pin layout above
#define SS_1_PIN        10         // Configurable, take a unused pin, only HIGH/LOW required, must be different to SS 2
#define SS_2_PIN        8          // Configurable, take a unused pin, only HIGH/LOW required, must be different to SS 1

#define NR_OF_READERS   2

//adafruit
#if (defined(__AVR__) || defined(ESP8266)) && !defined(__AVR_ATmega2560__)
#include <SoftwareSerial.h>
SoftwareSerial mySerial(2, 3);
#else
#define mySerial Serial1
#endif

Adafruit_Fingerprint finger = Adafruit_Fingerprint(&mySerial);

//rfid
byte ssPins[] = {SS_1_PIN, SS_2_PIN};

MFRC522 mfrc522[NR_OF_READERS];   // Create MFRC522 instance.


//adafruit
int getFingerprintIDez();
uint8_t id;



void setup() {
  // put your setup code here, to run once:

  Serial.begin(9600); // Initialize serial communications with the PC
//  while (!Serial);    // Do nothing if no serial port is opened (added for Arduinos based on ATMEGA32U4)___// For Yun/Leo/Micro/Zero/...
  delay(100);

  //rfid
  SPI.begin();        // Init SPI bus
  //adafruit
  finger.begin(57600);
//  finger.begin(57600);

    for (uint8_t reader = 0; reader < NR_OF_READERS; reader++) {
    mfrc522[reader].PCD_Init(ssPins[reader], RST_PIN); // Init each MFRC522 card
//    Serial.print(F("Reader "));
//    Serial.print(reader);
//    Serial.print(F(": "));
    mfrc522[reader].PCD_DumpVersionToSerial();
  }
  
}

void loop() {
  // put your main code here, to run repeatedly:

          //___________________________
          for (uint8_t reader = 0; reader < NR_OF_READERS; reader++) {
          // Look for new cards
        
          if (mfrc522[reader].PICC_IsNewCardPresent() && mfrc522[reader].PICC_ReadCardSerial()) {
//            Serial.print(F("Reader "));
//            Serial.print(reader);
            // Show some details of the PICC (that is: the tag/card)
            Serial.println(F("yyyyyyyy"));
            dump_byte_array(mfrc522[reader].uid.uidByte, mfrc522[reader].uid.size);
//            Serial.println();
//            Serial.print(F("PICC type: "));
            MFRC522::PICC_Type piccType = mfrc522[reader].PICC_GetType(mfrc522[reader].uid.sak);
//            Serial.println(mfrc522[reader].PICC_GetTypeName(piccType));

        
            // Halt PICC
            mfrc522[reader].PICC_HaltA();
            // Stop encryption on PCD
            mfrc522[reader].PCD_StopCrypto1();
          } //if (mfrc522[reader].PICC_IsNewC
        } //for(uint8_t reader

  //___________
  
    // Vérifier si des données sont disponibles sur la liaison série
  if (Serial.available()) {
    // Lire la commande reçue
    char command = Serial.read();


    if (command == '1') {
          Serial.println("333");//Ready to enroll a fingerprint!
          Serial.println("444");//Please type in the ID # (from 1 to 127) you want to save this finger as...
        //  id = readnumber();
            id = 24;
          if (id == 0) { // ID #0 not allowed, try again!
             return;
          }
        //  Serial.print("Enrolling ID #");
        //  Serial.println(id);
        
          while (! getFingerprintEnroll() );
      
    }
  }

}
 
/**
 * Helper routine to dump a byte array as hex values to Serial.
 */
void dump_byte_array(byte *buffer, byte bufferSize) {
  for (byte i = 0; i < bufferSize; i++) {
    Serial.print(buffer[i] < 0x10 ? " 0" : " ");
    Serial.print(buffer[i], HEX);
  }
}

uint8_t getFingerprintEnroll() {
  int p = -1;
  Serial.print("555qq"); //Serial.println(id);//Waiting for valid finger to enroll as #
  while (p != FINGERPRINT_OK) {
    p = finger.getImage();
    switch (p) {
    case FINGERPRINT_OK:
      Serial.println("661qq");//Image taken
      break;
    case FINGERPRINT_NOFINGER:
//      Serial.print("1");//.
      break;
    case FINGERPRINT_PACKETRECIEVEERR:
      Serial.println("\n777qq");//Communication error
      break;
    case FINGERPRINT_IMAGEFAIL:
      Serial.println("\n888qq");//Imaging error
      break;
    default:
      Serial.println("\n8888qq");//Unknown error
      break;
    }
  }

  // OK success!

  p = finger.image2Tz(1);
  switch (p) {
    case FINGERPRINT_OK:
      Serial.println("\n1111zz");//Image converted
      break;
    case FINGERPRINT_IMAGEMESS:
      Serial.println("\n6222zz");//Image too messy
      return p;
    case FINGERPRINT_PACKETRECIEVEERR:
      Serial.println("\n3333zz");//Communication error
      return p;
//    case FINGERPRINT_FEATUREFAIL:
//      Serial.println("Could not find fingerprint features");
//      return p;
//    case FINGERPRINT_INVALIDIMAGE:
//      Serial.println("Could not find fingerprint features");
//      return p;
    default:
      Serial.println("\n8888zz");//Unknown error
      return p;
  }

  Serial.println("\n4444ww");//Remove finger
  delay(2000);
  p = 0;
  while (p != FINGERPRINT_NOFINGER) {
    p = finger.getImage();
  }
//  Serial.print("ID "); Serial.println(id);
  p = -1;
  Serial.println("\n5555ww");//Place same finger again
  while (p != FINGERPRINT_OK) {
    p = finger.getImage();
    switch (p) {
    case FINGERPRINT_OK:
      Serial.println("\n6666ww");//Image taken
      break;
    case FINGERPRINT_NOFINGER:
//      Serial.print("1");//.
      break;
    case FINGERPRINT_PACKETRECIEVEERR:
      Serial.println("\n3333ww");//Communication error
      break;
//    case FINGERPRINT_IMAGEFAIL:
//      Serial.println("Imaging error");
//      break;
    default:
      Serial.println("\n8888ww");//Unknown error
      break;
    }
  }

  // OK success!

  p = finger.image2Tz(2);
  switch (p) {
    case FINGERPRINT_OK:
      Serial.println("\n1111ee");
      break;
    case FINGERPRINT_IMAGEMESS:
      Serial.println("\n6222ee");
      return p;
    case FINGERPRINT_PACKETRECIEVEERR:
      Serial.println("\n7777ee");
      return p;
//    case FINGERPRINT_FEATUREFAIL:
//      Serial.println("Could not find fingerprint features");
//      return p;
//    case FINGERPRINT_INVALIDIMAGE:
//      Serial.println("Could not find fingerprint features");
//      return p;
    default:
      Serial.println("\n8888ee");
      return p;
  }

  // OK converted!
//  Serial.print(id);  //Serial.println("#");// Creating model for #

  p = finger.createModel();
  if (p == FINGERPRINT_OK) {
    Serial.println("\n660rr");//Prints matched!
  } else if (p == FINGERPRINT_PACKETRECIEVEERR) {
    Serial.println("\n3333rr");
    return p;
  } else if (p == FINGERPRINT_ENROLLMISMATCH) {
    Serial.println("\n662rr");//Fingerprints did not match
    return p;
  } else {
    Serial.println("\n8888rr");
    return p;
  }

//  Serial.println(id);  //Serial.print("ID ");
  p = finger.storeModel(id);
  if (p == FINGERPRINT_OK) {
    Serial.println("\n9999rr");//Stored!
  } else if (p == FINGERPRINT_PACKETRECIEVEERR) {
    Serial.println("\n3333rr");
    return p;
  } else if (p == FINGERPRINT_BADLOCATION) {
    Serial.println("\n663rr");//Could not store in that location
    return p;
  } else if (p == FINGERPRINT_FLASHERR) {
    Serial.println("\n664rr");//Error writing to flash
    return p;
  } else {
    Serial.println("\n8888rr");
    return p;
  }

  downloadFingerprintTemplate(id);

  return true;
}

uint8_t downloadFingerprintTemplate(uint16_t id) {
//  Serial.println("------------------------------------");
  Serial.print(id); // Serial.println(id); //Tentative de chargement de #
  uint8_t pp = finger.loadModel(id);

  if (pp != FINGERPRINT_OK) {
    Serial.println("\n666tt");//Échec du chargement du modèle
    return pp;
  }

  Serial.println(id); // Serial.print("Tentative de récupération de #");
  pp = finger.getModel();

  if (pp != FINGERPRINT_OK) {
    Serial.println("\n667tt");//Échec de la récupération du modèle
    return pp;
  }

  // Un paquet de données est de 267 octets. Dans un paquet de données, 11 octets sont 'inutiles'
  uint8_t bytesReceived[534]; // Deux paquets de données
  memset(bytesReceived, 0xff, sizeof(bytesReceived));

  uint32_t starttime = millis();
  int i = 0;
  while (i < 534 && (millis() - starttime) < 20000) {
    if (mySerial.available()) {
      bytesReceived[i++] = mySerial.read();
    }
  }

  Serial.print(i); //Serial.println(" octets lus.");
  Serial.println("xxxxxxxx");

  uint8_t fingerTemplate[512]; // Le modèle réel
  memset(fingerTemplate, 0xff, sizeof(fingerTemplate));

  // Filtrage uniquement des paquets de données
  int uindx = 9, index = 0;
  memcpy(fingerTemplate + index, bytesReceived + uindx, 256);   // Premiers 256 octets
  uindx += 256;       // Sauter les données
  uindx += 2;         // Sauter le checksum
  uindx += 9;         // Sauter l'en-tête suivant
  index += 256;       // Avancer le pointeur
  memcpy(fingerTemplate + index, bytesReceived + uindx, 256);   // Seconds 256 octets

  for (int i = 0; i < 512; ++i) {
    printHex(fingerTemplate[i], 2);
  }
  Serial.println("\n11111");// terminé

  return pp;
}

void printHex(int num, int precision) {
  char tmp[16];
  char format[128];

  sprintf(format, "%%.%dX", precision);

  sprintf(tmp, format, num);
  Serial.print(tmp);
}
