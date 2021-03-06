import java.util.Scanner;

/*
--- Day 1: The Tyranny of the Rocket Equation ---
Calculate the fuel needed for the mass of each module - for each input individually, then add them
Get the mass (input), divide by 3, round down, and subtract 2 for the fuel amount.

--PART 1 AND PART 2 --
*/
public class dayOne {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        float[] numbers = new float[100];
        float result = 0;
        float total = 0;
        float values = 0;

        for (int i = 0; i < numbers.length; i++) {
            values = input.nextFloat();
            result = (float) Math.floor(values / 3) - 2;
            total += result;
            while(result != 0) {
                result = (float) Math.floor(result / 3) - 2;
                if(result <= 0) result = 0;
                total += result;
            }
        }
        System.out.printf("Total altogether: %f \n ", total);
    }
}

//solved