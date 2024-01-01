package com.example.proplem_solving;


public class Random {

    public static void main(String[] args) {
        System.out.println(myRandom());
    }
public static int myRandom(){
        boolean res=random() || random();
        if (res == true){
            return 1;
        }else
            return 0;
}
    public static boolean random() {

        int num = (int) (Math.random() * 10);
        if (num % 2 == 0) {
            return true;
        }else {
            return false;
        }


    }
}
