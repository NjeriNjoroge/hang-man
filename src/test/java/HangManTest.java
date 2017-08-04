import org.junit.*;
import static org.junit.Assert.*;
import java.util.Random;

public class HangManTest{
  @Test
  public void diplayArray_showArray_ArrayList(){
    HangMan testGame = new HangMan();
    //ArrayList<String> words = new ArrayList<String>();
    String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
    assertEquals(suits, testGame.displayArray());
  }

  @Test
  public void randomArray_showRandom_ArrayList(){
    HangMan testGame = new HangMan();
    //Random random = new Random();

    assertEquals("Clubs", testGame.randomArray());


  }
}
