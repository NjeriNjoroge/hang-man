import java.util.*;
import java.util.Random;

public class HangMan{

public String[] displayArray(){
  String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
  return suits;
}

public String randomArray(){
  Random random = new Random();
  String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
  int select = random.nextInt(suits.length);
  String myIndex = suits[select];
  return myIndex;
}

public String[] splitRandom( String myIndex){
  String[] wordSplit = myIndex.split("");
  return wordSplit;

}

}
