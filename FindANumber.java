/**
 *Kenny Lin
 *Sir Winston Churchill Secondary School
 */

//Java library needed for input
import java.io.*;

public class FindANumber 
{
    public static void main(String[] args)throws IOException
    {
        //Objects needed for Input
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        //Variables
        int x, m, n, check = 0;
        boolean nExistence = false;
        
        //Gets input from user
        System.out.println("Enter the two numbers, both must be integers.");
        x = Integer.parseInt(input.readLine());
        m = Integer.parseInt(input.readLine());
        
        //Checks if x is more than m
        if(x > m)
        {
            System.out.print("There is no such n that meets the criteria.");
        }       
        else 
        { 
            for(int i = 2; i < m; i++)
            {            
                //Check if i meets the criteria for being n
                check = x * i % m;
                if(check == 1)  
                {
                    nExistence = true;
                    n = i; 
                    System.out.println(x + "*" + n + "/" + m + " has a remainder of 1, so the number is " + n + ".");
                }
            }
            //If there is no number that meets the criteria
            if(nExistence != true)
            {
                System.out.println("There is no such n that meets the criteria.");
            }                                
         }
        
    }                      
}   