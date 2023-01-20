package class8Homework;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class J_06_StarPattern {
    public static void main(String[] args) {
        /*
        Print the following pattern:
         *

         *

         *
         **
         *
         **
         *

    */
        /*


        /*
         *
         **
         ***
         ****
         ***
         **
         *

*/
        for (int i = 1; i < 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

            for (int k = 4; k >= 1; k--) {
                for (int l = 0; l < k; l++) {
                    System.out.print("*");
                }
                System.out.println();



        }

    }
}
