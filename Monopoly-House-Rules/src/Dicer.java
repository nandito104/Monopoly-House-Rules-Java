import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Dicer {

   public int firstDice(){
	   int dice;
	   Random generator = new Random();
	   dice = generator.nextInt(6) + 1;
       return dice;
  }
   
  public int secondDice(){
	  int dice;
      Random generator = new Random();
      dice = generator.nextInt(6) + 1;
      return dice;
  }
  
  //Method to roll both dices at once in the case of landing in a Utility
  public int bothDice(){
	  int dices = ThreadLocalRandom.current().nextInt(2, 12 + 1); //the first number in the .nextInt(x, y+1) is the min while the second is the upper limit (you have to +1 it to have the desired limit)
	  return dices;
  }
   
  
  //Method to check whether the dice roll is or isn't a double
  public boolean doubleDices(int first, int second) {
	  if (first == second) return true;
	  else return false;
  }
   

}