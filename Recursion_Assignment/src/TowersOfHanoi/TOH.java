/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TowersOfHanoi;

import java.util.Scanner;

/**
 *
 * @author john
 */
public class TOH {
    public static void towerOfHanoi(int n, String a, String b, String c){     
	//base case
        if (n==1){ 
            //move the top n disk from A to C;
            System.out.println("Move disk 1 from peg "+a+" to peg "+c);
            return;
        }
        //first move the n-1 disks to peg 2
	towerOfHanoi(n-1, a, c, b);
        System.out.println("Move disk "+n+" from peg "+a+" to peg "+c);
        //move the n-1 disk from B to C;
        towerOfHanoi(n-1, b, a, c);
    }

     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("How many disks: ");
         int disk = sc.nextInt();
         //A is the starting peg, B is the peg in the middle, C is the destination.
         String a="A", b="B", c="C";
         towerOfHanoi(disk, a, b, c);
         
     }
}
