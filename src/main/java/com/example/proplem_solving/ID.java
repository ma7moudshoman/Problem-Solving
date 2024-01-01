package com.example.proplem_solving;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ID {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] CodeInputs = new String[8];
        CodeInputs[0] = "code_511";
        CodeInputs[1] = "code_512";
        CodeInputs[2] = "code_513";
        CodeInputs[3] = "code_514";
        CodeInputs[4] = "code_515";
        CodeInputs[5] = "code_516";
        CodeInputs[6] = "code_517";
        CodeInputs[7] = "code_518";

        Set<String>mahmoud=new HashSet<>();
       for (int i=0;i<CodeInputs.length;i++){
           if (mahmoud.add(CodeInputs[i])==false){
               System.out.println("sorry i cant add this element  " +CodeInputs[i]);
               return;
           }

       }
        System.out.println("Success");



       /* String codeSystem[] = {"", "", "", "", "", "", "", ""};
        for (int i = 0; i < CodeInputs.length; i++) {
            String code = CodeInputs[i];

            for (int f = 0; f < CodeInputs.length; f++) {
                if (codeSystem[f].equals(code)) {
                    System.out.println("sorry i cant add it   " + code);
                    return;

                }
            }
            codeSystem[i] = code;

        }
        System.out.println("success!");
    */    }
}