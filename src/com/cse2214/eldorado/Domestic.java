package com.cse2214.eldorado;
//Takrim

import java.util.Scanner;

public class Domestic {

    void domestic()
    {
        LogoAndUI logo = new LogoAndUI();
        logo.Logo();

        String currentlocation,destination, transportationtype;  


        System.out.println("\n\n\t\t\t\t\t\t==========================================================");
        System.out.println("\n\t\t\t\t\t\t|                  Welcome To EL-DORADO                  |");
        System.out.println("\n\t\t\t\t\t\t|                    Domestic Travel                     |");
        System.out.println("\n\t\t\t\t\t\t==========================================================");
        System.out.println("\n\t\t\t\t\t\t**********************************************************");
        System.out.println("\n\t\t\t\t\t\t|        Please Provide the Recquired Information        |");
        System.out.println("\n\t\t\t\t\t\t**********************************************************");
        

        Scanner scan = new Scanner(System.in);
        System.out.print("\t\t\t\t\t\tEnter Your Current Location: ");
        currentlocation = scan.nextLine();

        System.out.print("\t\t\t\t\t\tEnter Your Destination: ");
        destination = scan.nextLine();

        System.out.print("\t\t\t\t\t\tEnter Your Transportayiontype: 1.Bus  2.Train. 3.Domestic flight");
        transportationtype = scan.nextLine();


        


        



        
           


    }
    
    
}
