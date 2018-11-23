/**
 *Kenny Lin
 *Sir Winston Churchill Secondary School
 */

//Java library needed for input
import java.io.*;

public class Quarters 
{
    public static void main(String[] args)throws IOException 
    {
        //Objects needed for input
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in)); 
        
        //Variables 
        int roundNum = 1, quarters, aRounds, bRounds, cRounds, aCheck, bCheck, cCheck;
        boolean ownQuarter = true;
        
        //Gets input from user
        System.out.print("How many Quarters: ");
        quarters = Integer.parseInt(input.readLine());
        System.out.print("Rounds since A won: ");
        aRounds = Integer.parseInt(input.readLine());        
        System.out.print("Rounds since B won: ");
        bRounds = Integer.parseInt(input.readLine());        
        System.out.print("Rounds since C won: ");
        cRounds = Integer.parseInt(input.readLine());        
        System.out.println("\n\n\n");
        
        //Loops as long as you have quarters
        while(ownQuarter)
        {  
            System.out.println("Round " + roundNum);
            roundNum++;
            
            //Playing Machine A
            quarters--;
            aRounds++;
            aCheck = aRounds % 35;
            if(aCheck == 0) //If win A
            {
                quarters = quarters + 30;
                System.out.println("Played A: Won 30 quarters, but lost original, now have " + quarters + " quarters left.");
            }
            else if ( (aCheck != 0) && (quarters >= 0) ) //If lose A
            {
                System.out.println("Played A: Lost my quarter, now have " + quarters + " quarters left.");
            }
            
            //Playing Machine B
            quarters--;
            bRounds++;
            bCheck = bRounds % 100;
            if (bCheck == 0) //If win B
            {
                quarters = quarters + 60;
                System.out.println("Played B: Won 60 quarters, but lost original, now have " + quarters + " quarters left.");
            }
            else if ( (bCheck != 0) && (quarters >= 0) ) //If lose B
            {
                System.out.println("Played B: Lost my quarter, now have " + quarters + " quarters left.");
            }              
            
            //Playing Machine C
            quarters--;
            cRounds++;
            cCheck = cRounds % 10;
            if (cCheck == 0) //If win C
            {
                quarters = quarters + 9;
                System.out.println("Played C: Won 9 quarters, but lost original, now have " + quarters + " quarters left.\n");
            }
            else if ( (cCheck != 0) && (quarters >= 0) ) //If lose C
            {
                System.out.println("Played C: Lost my quarter, now have " + quarters + " quarters left.\n");
            }
            
            if(quarters <= 0) //If lose all quarters
            {
                System.out.println("Uh oh, I gambled all my money away :(");
                ownQuarter = false;
            }
                                           
        }       
    }    
}