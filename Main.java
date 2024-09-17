import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Random rand= new Random();
        int x= rand.nextInt(100);
        
        Scanner scan = new Scanner(System.in);
        int guess;
        int count=0;
        

         //if guess is less than x
         //if guess is more than x 
            //count how many guesses
            //if count is less than 7, you print a very good response 
            //exit condition - guess = x;


        
        do {
            System.out.println("Enter your first guess:");
            guess = scan.nextInt();
            count++;

            if(guess>x){
                System.out.println("too high");
            }else if (guess<x){
                System.out.println("too low");
            
            

            }

            
         
         } while (guess !=x && count <7);

         if (guess==x){
            if (count<= 7){
                System.out.println("You got an impossible score");
            }else if(count<= 10){
                System.out.println("You did a good job");
            }else {
                System.out.println("Try the divide and conquer strategy next time!");
            }
         }else {
            System.out.println("You've exceeded the maximum number of guesses.Better luck next time!");
         }
            }
         
       
        



            // if guess is less than x


    }

    
