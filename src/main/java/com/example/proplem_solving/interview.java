package com.example.proplem_solving;

import java.util.Scanner;

public class interview {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int [] arr={4,3,4,2,1,0};
         int sum=0;
        for (int i=0;i<6;i++){
            sum+=arr[i];
        }
        int res=4*(4+1)/2;
        System.out.println(sum-res);
    }
}