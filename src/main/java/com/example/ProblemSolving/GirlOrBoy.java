package src.main.java.com.example.ProblemSolving;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GirlOrBoy {
    public static void main(String[]args){

        Scanner input =new Scanner(System.in);
             // deskenting letter ====> اخذ الحروف بدون تكرارا
        //  xiaodao ===> xiaod ===> Odd ====> Boy
        // wjmzbmr ===> wjmzbr ===> even ====> Girl

        String name;
name=input.next();
        Set<Character> letters=new HashSet<>();
        for (Character v:name.toCharArray()){
            letters.add(v);
        }
        if (letters.size()%2==0){
            System.out.println("CHAT WITH HER");
        }else {
            System.out.println("IGNORE HIM");
        }
    }
}
