import java.util.Scanner;
import java.util.Random;  //Java class for random number generaotor.

public class StonePaperScissor {

public static void CalculateScore(int PlayerScore, int ComputerScore){   // Net Score and Winner calculator.
    if (PlayerScore == ComputerScore) {
        System.out.println("Match Draw.....");
    }
    else if(PlayerScore>ComputerScore){
        System.out.println("Player is the winner.......");
    }
    else{
        System.out.println("Computer is the winner");
    }
}

    public static void main(String[] args) {
        
        Random random = new Random();    //Creating a Random class objecgt by name "random".
          
        int ComputerScore=0, PlayerScore =0; 
      Scanner Input = new Scanner(System.in);
      
      System.out.println("......Choose 0 for Stone -- 1 for Paper -- 2 for Scissor -- 3 for exit...... ");
     
      while (true) {
        int ComputerInput = random.nextInt(3);   //Random number genrated will be of limit 0 to 3.
         System.out.print("enter your choice: ");
        int UserInput = Input.nextInt();              //Taking user input.
        if (UserInput==3) {
            CalculateScore(PlayerScore, ComputerScore);
            System.out.println("Player Score: " + PlayerScore + " ||| Computer Score: "+ ComputerScore);
            break;
        }
        else if(ComputerInput == UserInput){
          System.out.println("Player choice: "+ UserInput+ " || Computer choice: "+ ComputerInput );
        }
        else if(ComputerInput==0 && UserInput==1|| ComputerInput==1 && UserInput ==2 || ComputerInput == 2 && UserInput == 0){
            System.out.println("Player choice: "+ UserInput+ " || Computer choice: "+ ComputerInput );
            PlayerScore++;

        }
        
        else{
            System.out.println("Player choice: "+ UserInput+ " || Computer choice: "+ ComputerInput );
            ComputerScore++;
        }

      }
      
        
    

    }
}