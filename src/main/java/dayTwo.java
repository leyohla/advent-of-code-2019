import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
Day 2: opcode

1,0,0,3, //add
1,1,2,3, //add
1,3,4,3, // add
1,5,0,3, // add
2,9,1,19, //multiply
1,19,5,23, // add
1,23,6,27, // add
2,9,27,31, //multiply
1,5,31,35, // add
1,35,10,39, // add
1,39,10,43, // add
2,43,9,47, //multiply
1,6,47,51, // add
2,51,6,55, //multiply
1,5,55,59, // add
2,59,10,63, //multiply
1,9,63,67, // add
1,9,67,71, // add
2,71,6,75, //multiply
1,5,75,79, // add
1,5,79,83, // add
1,9,83,87, // add
2,87,10,91, //multiply
2,10,91,95, //multiply
1,95,9,99, // add
2,99,9,103, //multiply
2,10,103,107, //multiply
2,9,107,111, //multiply
1,111,5,115, // add
1,115,2,119, // add
1,119,6,0,99, // add
2,0,14,0 //multiply
 */
public class dayTwo {
    public static void main(String args[]){
        int[] intcode = {1,0,0,3, 1, 1,2,3,1,3,4,3,1,5,0,3,2,9,1,19,1,19,5,23,1,23,6,27,2,9,27,31,1,5,31,35,1,35,10,39,1,39,10,43,2,43,9,47,1,6,47,51,2,51,6,55,1,5,55,59,2,59,10,63,1,9,63,67,1,9,67,71,2,71,6,75,1,5,75,79,1,5,79,83,1,9,83,87,2,87,10,91,2,10,91,95,1,95,9,99,2,99,9,103,2,10,103,107,2,9,107,111,1,111,5,115,1,115,2,119,1,119,6,0,99,2,0,14,0};

        int i;
        int sum =0;

        for(i=0; i<intcode.length; i+=4){
            //if(intcode[i] == 99){
                //break;
            //}
            if (intcode[i] == 1) {
                intcode[i + 3] = intcode[i + 1] + intcode[i + 2];
            }
            else if(intcode[i] == 2){
                intcode[i+3] = intcode[i + 1] * intcode[i + 2];
            }
            System.out.println(intcode[i]);
        }

    }

}

//print values of all indexes
//ignore 99 - DONE
//for every 4 characters, if index is 1, go three positions after 1st int.. Position 4 = result of values in positions 2 and 3.