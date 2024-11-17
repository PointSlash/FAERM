///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package calculEmpreinte;
//
//import java.util.Arrays;
//
///**
// *
// * @author GadgetZone
// */
//
//    public class calculEmpreinte {
//    
//
//    public static void main(String[] args) {
//        String hexString = "0303550D080129017C0000000000000000000000000000000000000000000000000000000000000000000000000000000A0000006D000000C30C33CCCFFFFFEFFBBAEEEA99AAAA6699559955455151110401010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101011083EF01FFFFFFFF02008248899F5E1A8CDEFE1C1407BE6327553E25A9061E340B477F5F14D39F541B69FF621E675F5228AC7C4D2AD9FC508F25B9510D1FD7000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000014DEEF01FFFFFFFF02008200000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000084EF01FFFFFFFF0200820303590D000120017D0000000000000000000000000000000000000000000000000000000000000000000000000000000B0000006D000000C330CF333FFFFFBFBEEBBBAA66AAA99A65566555154544410400000000000000000000000000000000000000000000000000";
//        String hexString1 = "03035912000120017F0000000000000000000000000000000000000000000000000000000000000000000000000000000800000065000000000333333FFFFFBFBBEFBAABAA95A99996665555554444000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000D7BEF01FFFFFFFF0200823F84891E5006607E430A1F9E5B10E4BE2A151E1E5197199E5B1914FE3FA09A5E33AA5BFE2485C81F359DC41F5C23689F50292B9C378F471D540CE17A508FDE7A31115EBA54A6569B0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001C52EF01FFFFFFFF02008200000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000084EF01FFFFFFFF02008203035910000120017F0000000000000000000000000000000000000000000000000000000000000000000000000000000800010065000003033033CFFFFFEFFBBFBABA9AA956AA5599595554511104000000000000000000000000000000000000000000000000000000";
//
//        byte[][] empreinte1 = hexTo16x32Array(hexString);
//        byte[][] empreinte2 = hexTo16x32Array(hexString1);
//
//        double similariteHamming = 1 - hammingSimilarity(empreinte1, empreinte2);
//        double pourcentageRessemblance = similariteHamming * 100;
//
//        System.out.println("Similarité de Hamming entre les deux empreintes: " + similariteHamming);
//        System.out.println("Pourcentage de ressemblance: " + pourcentageRessemblance);
//    }
//
//    public static byte[][] hexTo16x32Array(String hexString) {
//        if (hexString.length() != 1024) {
//            throw new IllegalArgumentException("La séquence hexadécimale doit avoir une longueur de 1024 caractères.");
//        }
//
//        byte[] byteArray = hexStringToByteArray(hexString);
//        byte[][] array = new byte[16][32];
//
//        for (int i = 0; i < 16; i++) {
//            System.arraycopy(byteArray, i * 32, array[i], 0, 32);
//        }
//
//        return array;
//    }
//
//    public static byte[] hexStringToByteArray(String s) {
//        int len = s.length();
//        byte[] data = new byte[len / 2];
//        for (int i = 0; i < len; i += 2) {
//            data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
//                                 + Character.digit(s.charAt(i+1), 16));
//        }
//        return data;
//    }
//
//    public static double hammingSimilarity(byte[][] empreinte1, byte[][] empreinte2) {
//        int differingBits = 0;
//        int totalBits = empreinte1.length * empreinte1[0].length;
//
//        for (int i = 0; i < empreinte1.length; i++) {
//            for (int j = 0; j < empreinte1[i].length; j++) {
//                if (empreinte1[i][j] != empreinte2[i][j]) {
//                    differingBits++;
//                }
//            }
//        }
//
//        return (double) differingBits / totalBits;
//    }
//}
//
//

package calculEmpreinte;

public class calculEmpreinte {

    public static byte[][] hexTo16x32Array(String hexString) {
        if (hexString.length() != 1024) {
            throw new IllegalArgumentException("La séquence hexadécimale doit avoir une longueur de 1024 caractères.");
        }

        byte[] byteArray = hexStringToByteArray(hexString);
        byte[][] array = new byte[16][32];

        for (int i = 0; i < 16; i++) {
            System.arraycopy(byteArray, i * 32, array[i], 0, 32);
        }

        return array;
    }

    public static byte[] hexStringToByteArray(String s) {
        int len = s.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
                                 + Character.digit(s.charAt(i+1), 16));
        }
        return data;
    }

    public static double hammingSimilarity(byte[][] empreinte1, byte[][] empreinte2) {
        int differingBits = 0;
        int totalBits = empreinte1.length * empreinte1[0].length;

        for (int i = 0; i < empreinte1.length; i++) {
            for (int j = 0; j < empreinte1[i].length; j++) {
                if (empreinte1[i][j] != empreinte2[i][j]) {
                    differingBits++;
                }
            }
        }

        return (double) differingBits / totalBits;
    }
}
