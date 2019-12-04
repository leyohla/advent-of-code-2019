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
        float[] numbers = new float[3];
        float result = 0;
        float total = 0;
        int i;
        double fuel=0;
        double sum=0;
        double refuel=0;

        float values = 0;
        for (i = 0; i < numbers.length; i++) {
            values = input.nextFloat();
            result = (float) Math.floor(values /3) - 2;
            values += result;
            total += result;
            for (int j = 0; j < values; j++) {
                if((fuel = Math.floor(result /3) - 2) >0){
                    refuel = Math.floor(fuel /3) - 2;
                }
            }
            System.out.printf("fuel: %f", refuel);
            //each fuel is the result of each input of input (so the equation applied twice to the input)
        }
        System.out.printf("Total altogether: %f \n ", total);
        //total altogether = the values inputted /3 - 2. (equation applied once to each input then totalled)

        //sum = total + totalFuel;
        //System.out.printf("SUM: %f", sum);
    }
}