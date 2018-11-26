/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LDL;

import java.util.Scanner;

/**
 *
 * @author Stanley Kwok 187100835
 */
public class Q2 {
    public static void main(String[] args) {
        double[] input = {0,0,0};
        String[] name = {"TC", "HDLC", "TG"};
        double LDLC;
        
        Scanner insert;
        
        for (int i = 0; i < 3; i++) {
            while (input[i] == 0) {
                System.out.println("Input " + name[i] + ": ");
                try {
                    insert = new Scanner(System.in);
                    input[i] = insert.nextDouble();
                } catch (Exception e) {
                    System.out.println("Exception");
                }
            }
        }
        
        // Calcalating the formaula LDLC=TC-HDLC-TG/5
        LDLC = input[0] - input[1] - (input[2] / 5);

        System.out.println("");
        System.out.println("Result:");
        
        //Print the result
        for (int i = 0; i < 3; i++) {
            System.out.println(name[i] + ": " + input[i]);
        }
        
        //The result of LDLC
        System.out.println("LDLC" + LDLC);

    }

}

