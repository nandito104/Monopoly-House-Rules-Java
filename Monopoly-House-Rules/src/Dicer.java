import java.util.Random;

public class Dicer {

   public int firstDice(){
        int faces;
        Random generator = new Random();
        faces = generator.nextInt(6) + 1;

        return faces;
   }
   
   public int secondDice(){
       int faces;
       Random generator = new Random();
       faces = generator.nextInt(6) + 1;

       return faces;
  }


}
