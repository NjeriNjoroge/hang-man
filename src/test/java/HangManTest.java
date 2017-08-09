import org.junit.*;
import static org.junit.Assert.*;
import java.util.Random;

public class HangManTest{
  //Test to display the created String
  @Test
  public void diplayArray_showArray_ArrayList(){
    HangMan testGame = new HangMan();
    //ArrayList<String> words = new ArrayList<String>();
    String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
    assertEquals(suits, testGame.displayArray());
  }
  //Test to generate random word
  @Test
  public void randomArray_showRandom_ArrayList(){
    HangMan testGame = new HangMan();
    //Random random = new Random();
    assertEquals("Clubs", testGame.randomArray());
  }
//Test to split the random word
  @Test
  public void splitRandom_splitTheRandomWord_ArrayList(){
    HangMan testGame = new HangMan();
    String[] splitWord = {"C", "l", "u", "b", "s"};
    assertEquals(splitWord, testGame.splitRandom("Clubs"));
    //assertEquals(true, testGame instanceOf HangMan);
  }

}
