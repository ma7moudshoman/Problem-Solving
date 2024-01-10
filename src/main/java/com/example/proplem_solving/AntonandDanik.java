package com.example.proplem_solving;

import java.util.Scanner;

public class AntonandDanik {
<<<<<<< HEAD
    public static void main(String[] args) {
        Scanner input = new Scanner((System.in));

        int size;
        System.out.println(" please, Enter your size " );

        String value;

        size = input.nextInt();
        value = input.next();

        int anton = 0;
        int danik = 0;

        for (int i = 0; i < size; i++) {
                if (value.charAt(i) == 'a') {
                    anton++;
                } else {
                    danik++;
                }
            }
            if (anton > danik) {
                System.out.println("anton");
            } else if (danik > anton) {
                System.out.println("danik");

            } else {
                System.out.println("friendship");
            }
        }
    }
=======
    public static void main(String[]args){
        Scanner input=new Scanner((System.in));

        int size;
        String value;

        size=input.nextInt();
        value=input.next();

        int anton=0;
        int danik=0;

        for (int i=0;i<size; i++){
            if (value.charAt(i)=='a'){
                anton++;
            }else {
                danik++;
            }
        }
        if (anton>danik){
            System.out.println("anton");
        } else if (danik>anton) {
            System.out.println("danik");

        }else {
            System.out.println("friendship");
        }
    }
}
>>>>>>> origin/master
