package org.example;
import java.util.Scanner;

class School{
//    #The name of the kids
    String kid;
//    #If the kid is present or not
    boolean present;

    School(String kid, boolean present){
        this.kid = kid;
        this.present = present;
    }
}

//#The main class
public class Main{
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        School [] kidnames = {
//                #All of the kid names
                new School ("Gabbi", false),
                new School ("Cannon", false),
                new School ("Cooper", false),
                new School ("Isaiah", false),

        };

//      #The main question
        System.out.println("Does your child go to school here? Yes or No? ");
        String child = scan.nextLine();

//       #If the user says yes
        if (child.equals("Yes")) {
            System.out.println("Which child?: Gabbi, Cannon, Cooper, Isaiah, or quit");
            String kid = scan.nextLine();

            //       #If the user wants to quit the program
            if (kid.equals("quit")) {
                System.out.println("You have stopped this process. Your progress is lost, you will have to start over the check out process!");
            }

            //#Start of my for loop
            for (School i : kidnames) {
                if (kid.equals(i.kid)) {
                    i.present = true;
                    System.out.println(i.kid + " is checked out! Have a nice day!");
                }
            }
        }
//        #If the user says no
        else{
            System.out.println("Have a good day!");
        }
    }
}