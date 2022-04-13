/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;

import java.util.Scanner;

/**
 *
 * @author Irsyad
 */
public class Latihan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
        int ang1;
        int ang2;
        
        int maks;
        
        System.out.println("Cth input A :" );
        ang1 = input.nextInt();
        System.out.println("Cth input B  :");
        ang2 = input.nextInt();
        
        maks = Math.max(ang1, ang2);
        
        if (ang2 > maks){
            maks = ang2;
        }
        
        System.out.println("Output="+maks);
        
    }
    
}
