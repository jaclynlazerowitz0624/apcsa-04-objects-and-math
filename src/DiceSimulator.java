import java.util.Random;

public class DiceSimulator {
    public static void main(String[] args) {
        // Roll one die: an int from 1 to 6.
        Random random = new Random();
        int die1 = random.nextInt(1,7);  // random #s 1-6
        int die2 = random.nextInt(1, 7);
        System.out.println("Die 1: " + die1);
        System.out.println("Die 2: " + die2);
        System.out.println("Total: " + (die1+die2));

        if (die1==die2){
            System.out.println("You rolled doubles");
        } else {
            System.out.println(" ");
        }

        int n = random.nextInt(1, 21);
        int die3 = random.nextInt(6);

        System.out.println(random.nextInt(50,76));
    }
}
