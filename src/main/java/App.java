import java.io.Console;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class App{
  public static void main(String[] args) {
    Console myConsole = System.console();
    Scanner keyboard = new Scanner(System.in);
    HangMan testGame = new HangMan();

    System.out.println("Welcome to a game of Hangman. Try guessing the word:");

    String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
    Random random = new Random();
    //generates random word and loops through it to display a star for each word
    String suit = suits[(int) (Math.random() * suits.length)];
    String secretWord = new String(new char[suit.length()]).replace("\0", "*");
    int count = 0;
    while(count < 7 && secretWord.contains("*")){
    System.out.println(secretWord);

  //allows player to guess a letter
  String guess = keyboard.next();



		String replaceWord = "";
		for (int i = 0; i < suit.length(); i++) {
			if (suit.charAt(i) == guess.charAt(0)) {
				replaceWord += guess.charAt(0);
			} else if (secretWord.charAt(i) != '*') {
				replaceWord += suit.charAt(i);
			} else {
				replaceWord += "*";
			}
		}

		if (secretWord.equals(replaceWord)) {
			count++;
		} else {
			secretWord = replaceWord;
		}
		if (secretWord.equals(suit)) {
			System.out.println("Correct! You win! The word was " + suit);
		}
}
      }
      }
