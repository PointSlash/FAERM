/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeArt;   

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author GadgetZone
 */
public class StringUtils {

    public static List<String> splitString(String str, int maxLength) {
        List<String> lines = new ArrayList<>();
        int length = str.length();
        for (int i = 0; i < length; i += maxLength) {
            lines.add(str.substring(i, Math.min(length, i + maxLength)));
        }
        return lines;
    } 
}
