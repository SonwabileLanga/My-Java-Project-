import java.util.Scanner;
public class RockPaperScissors{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        boolean turn = true;
        String playerOneChoice = "rock";
        String playerTwoChoice = "rock";
        int playerOneScore = 0;
        int playerTwoScore = 0;
        int choice;

        loop: while(true){
            if(turn){
                System.out.println("Player One: Choose your weapon!");
                choice = sc.nextInt();
            } else{
                System.out.println("Player Two: Choose your weapon!");
                choice = sc.nextInt();
            }
            switch(choice) {
            case 1 :
                System.out.println("Good choice!");
                if(turn){
                    playerOneChoice = "rock";
                } else{
                    playerTwoChoice = "rock";
                    System.out.println("Player One chose: " + playerOneChoice);
                    System.out.println("Player Two chose: " + playerTwoChoice);
                    if(playerOneChoice.equals("scissors")){
                        System.out.println("Player Two Wins!");
                        playerTwoScore ++;
                    } else if (playerOneChoice.equals("paper")){
                        System.out.println("Player One Wins!");
                        playerOneScore ++;
                    } else {
                        System.out.println("It's a draw!");
                    }
                    System.out.println("The score is now: " + playerOneScore + " - " + playerTwoScore);
                }
                turn = !turn;
                break;
            case 2 :
                System.out.println("Good choice!");
                if(turn){
                    playerOneChoice = "paper";
                } else{
                    playerTwoChoice = "paper";
                    System.out.println("Player One chose: " + playerOneChoice);
                    System.out.println("Player Two chose: " + playerTwoChoice);
                    if(playerOneChoice.equals("rock")){
                        System.out.println("Player Two Wins!");
                        playerTwoScore ++;
                    } else if (playerOneChoice.equals("scissors")){
                        System.out.println("Player One Wins!");
                        playerOneScore ++;
                    } else {
                        System.out.println("It's a draw!");
                    }
                    System.out.println("The score is now: " + playerOneScore + " - " + playerTwoScore);
                }
                turn = !turn;
                break;
            case 3 :
                System.out.println("Good choice!");
                if(turn){
                    playerOneChoice = "scissors";
                }else{
                    playerTwoChoice = "scissors";
                    System.out.println("Player One chose: " + playerOneChoice);
                    System.out.println("Player Two chose: " + playerTwoChoice);
                    if(playerOneChoice.equals("paper")){
                        System.out.println("Player Two Wins!");
                        playerTwoScore ++;
                    } else if (playerOneChoice.equals("rock")){
                        System.out.println("Player One Wins!");
                        playerOneScore ++;

                    } else {
                        System.out.println("It's a draw!");
                    }
                    System.out.println("The score is now: " + playerOneScore + " - " + playerTwoScore);
                }
                turn = !turn;
                break;
            case 4 :
                if(playerOneScore > playerTwoScore){
                    System.out.println("The winner is Player One with " + playerOneScore + " points.");
                } else if(playerTwoScore > playerOneScore){
                    System.out.println("The winner is Player Two with " + playerTwoScore + " points.");
                } else{
                    System.out.println("Player One and Player Two are tied with " + playerOneScore + " points.");
                }
                System.out.println("Quitting");
                sc.close();
                break loop;
            default :
                System.out.println("Invalid choice!");
            }
        }
    }
}