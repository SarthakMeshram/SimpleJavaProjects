import java.util.Random;
import java.util.Scanner;
public class RockPapersScissors {
    public static void main(String[] args) {
        String[] rps =  {"r", "p", "s"};
        String computerMove = rps[new Random().nextInt(rps.length)];

        try (Scanner scanner = new Scanner(System.in)) {
            String playerMove;
            while (true) {
                System.out.println("Enter ur move: ");
                playerMove = scanner.nextLine();
                if(playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s"));
                break;
            }

            System.out.println("Computer played: "+ computerMove);

   if(playerMove.equals(computerMove)) {
            System.out.println("The game was a tie!");
   }
   else if (playerMove.equals("r")) {
            if (computerMove.equals("p")) {
            System.out.println("You lose");
            }
            else if(computerMove.equals("s")) {
                System.out.println("WINNER!!!");
            }
   }
            
   else if (playerMove.equals("p")) {
            if (computerMove.equals("s")) {
            System.out.println("You lose");
            }
            else if(computerMove.equals("r")) {
                System.out.println("WINNER!!!");
            }  
   }

   else if (playerMove.equals("s")) {
            if (computerMove.equals("r")) {
            System.out.println("You lose");
            }
            else if(computerMove.equals("p")) {
                System.out.println("WINNER!!!");
            }  

            }
        }


    }
}