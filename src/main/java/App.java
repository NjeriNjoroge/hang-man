import java.io.Console;
import java.util.Random;


public class App{
  public static void main(String[] args) {
    Console myConsole = System.console();
    HangMan testGame = new HangMan();
    String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
    Random random = new Random();
    String secretWord = suits[random.nextInt(suits.length)];
    char [] displayArray = new char[secretWord.length()];
   for(int i=0; i < suits[0].length();i++){
     displayArray[i] += '_';
   }
   System.out.println(displayArray);
  }
}




// String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
// Random random = new Random();
// int secretWord =  random.nextInt(suits.length);
// char [] displayArray = new char[secretWord.length];
// for (int i=0; i<suits[0].length();i++ ) {
//   displayArray[i] += '-';
// }
// System.out.println(suits[secretWord]);
//System.out.println("Enter a letter:");
//String userInput = myConsole.readLine();
