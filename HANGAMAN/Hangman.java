import java.util.Scanner;
public class Hangman{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int guessesRemaining = 8;
        int wordLength;
        int charPosition;
        String targetWord;
        String wordAfterThisGuess = "";
        String wordAfterLastGuess = "";
        String guessHistory = "_";
        String guessWord;
        char guess;

        System.out.println("Player One, enter a word:");
        targetWord = sc.nextLine();
        wordLength = targetWord.length();
        for(int i=0 ; i<wordLength ; i++){
            wordAfterLastGuess += "_";
        }

        while(true){
            System.out.println(wordAfterLastGuess);
            System.out.println("Player Two, you have " + guessesRemaining + " guesses left. Enter a guess:");
            guessWord = sc.nextLine();
            if(guessWord.length() > 1){
                if(guessWord.equals(targetWord)){
                    System.out.println("Game over. Player Two wins!");
                    break;
                }else{
                    for(int i=0 ; i<guessWord.length() ; i++){
                        if(guessHistory.indexOf(guessWord.charAt(i)) == -1){
                            guessHistory += guessWord.charAt(i);
                            if(targetWord.indexOf(guessWord.charAt(i)) == -1){
                                guessesRemaining -= 1;
                            }
                            wordAfterThisGuess = "";
                            for(int j=0 ; j<wordLength ; j++){
                                if(targetWord.charAt(j) == guessWord.charAt(i)){
                                    wordAfterThisGuess += guessWord.charAt(i);
                                }else{
                                    wordAfterThisGuess += wordAfterLastGuess.charAt(j);
                                }
                            }
                            wordAfterLastGuess = wordAfterThisGuess;
                        }
                    }
                    wordAfterLastGuess = wordAfterThisGuess;
                }
            }else{
                wordAfterThisGuess = "";
                guess = guessWord.charAt(0);
                if(guessHistory.indexOf(guess) != -1){
                    System.out.println("You have already guessed '" + guess + "'.");
                    continue;
                }
                guessHistory += guess;
                if(targetWord.indexOf(guess) == -1){
                    guessesRemaining -= 1;
                }
                for(int i=0 ; i<wordLength ; i++){
                    if(targetWord.charAt(i) == guess){
                        wordAfterThisGuess += guess;
                    }else{
                        wordAfterThisGuess += wordAfterLastGuess.charAt(i);
                    }
                }
                wordAfterLastGuess = wordAfterThisGuess;
            }
            if (wordAfterLastGuess.indexOf('_') == -1){
                System.out.println(wordAfterLastGuess);
                System.out.println("Game over. Player Two wins!");
                break;
            }else if(guessesRemaining <= 0){
                 System.out.println("Game over. Player One wins! The word was: " + targetWord);
                 break;
            }
        }
        sc.close();
    }
}
