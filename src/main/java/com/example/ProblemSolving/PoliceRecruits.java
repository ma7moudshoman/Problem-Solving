package src.main.java.com.example.ProblemSolving;

import java.util.Scanner;

public class PoliceRecruits {

    public static void main(String []args) {


        Scanner input = new Scanner(System.in);

        int events;
        int issue=0;
        int police=0;
        int event;
        events=input.nextInt();

        /*
       3
       -1  -1  1
         */
        for (int i=0;i<events ;i++) {
            event=input.nextInt();
            if (event == -1){
               if (police==0){
                   issue++;
               }else {
                   police--;
               }
            }else{
                police+=event;
            }
        }
        System.out.println(issue);
    }
}
