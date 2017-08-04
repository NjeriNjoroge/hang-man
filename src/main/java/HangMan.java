import java.util.*;
import java.util.Random;

public class HangMan{

public String[] displayArray(){
  //Random random = new Random();
  //ArrayList<String> words = new ArrayList<String>();
String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
  // int select = random.nextInt(suits.length);
  // String myIndex = suits[select];
  // return myIndex;
  return suits;
}

public String randomArray(){
  Random random = new Random();
  String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
  int select = random.nextInt(suits.length);
  String myIndex = suits[select];
  return myIndex;
}

}
