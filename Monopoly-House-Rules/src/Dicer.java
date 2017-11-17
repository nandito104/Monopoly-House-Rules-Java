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
   public int bothDice(){
	   int dices = ThreadLocalRandom.current().nextInt(2, 12 + 1);
	   return dices;
   }

}