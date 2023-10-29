package com.example.proplem_solving;

import java.util.Scanner;

public class RevisionOfLoops {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        char PaasClass;
        double bagWeight;
        double extraWeight = 0;
        double charge = 1;
        int NumOfPassenger = 0, NumberOfGroup;

        System.out.println("Please Enter Number of Group");
        NumberOfGroup = read.nextInt();

        for (int groupcunter = 1; groupcunter <= NumberOfGroup; groupcunter++) {

            System.out.println("Enter numbers of passengers  fot Group number " +groupcunter);
            NumOfPassenger = read.nextInt();

            for (int i = 1; i <= NumOfPassenger; i++) {

                System.out.println("Enter Passengers class for passenger " + i);
                PaasClass = read.next().charAt(0);

                System.out.println("Enter your  Bag Weight");
                bagWeight = read.nextInt();
                switch (PaasClass) {
                    case 'F':
                    case 'f':
                        if (bagWeight > 30)
                            extraWeight = bagWeight - 30;
                        charge = extraWeight * 10;
                        break;
                    case 'B':
                    case 'b':

                        if (bagWeight > 25)
                            extraWeight = bagWeight - 25;
                        charge = extraWeight * 10;
                        break;
                    case 'E':
                    case 'e':

                        if (bagWeight > 20)
                            extraWeight = bagWeight - 20;
                        charge = extraWeight * 10;

                    default:
                        System.out.println("Invalid class");
                }
                System.out.println("you Have to Bay Charge Equal :  " + charge);
            }
        }
    }
}