/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstprojectgoogler;

import static firstprojectgoogler.TherdLecture.prln;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class PascalTriangle {
    static Scanner My_Scanner=new Scanner(System.in);
    public static void main(String args[]){
       prln("give -1 to exit");
		prl("Give the length of pascal's triangle's length: ");
		int userInput=My_Scanner.nextInt();
		while (userInput!=-1) {
			if (userInput<-1||userInput>20) {
				prln("please enter something between -1~20");
				userInput=My_Scanner.nextInt();
				continue;
            }
            printPascalTriangle(userInput);
			prln("\n\n");
			prln("please enter something between -1~20");
			userInput=My_Scanner.nextInt();

        }
        
    }
    static void printPascalTriangle(int length){
        int [][] pascal=new int [length][length];
        for (int i = 0; i < length; i++) {
			pascal[0][i]=1;
			pascal[i][0]=1;
		}
        for (int row = 1; row < length; row++) {
			for (int column = 1; column < length-row; column++) {
				pascal[row][column]=pascal[row][column-1]+pascal[row-1][column];
			}
        }
         for (int row = 0; row < length; row++) {
			for (int column = 0; column < length-row; column++) {
				prl(pascal[row][column]+"\t");
			}
			prln("\n");
			
		
		
        }
    }
    
    static void prln(Object Any_Object){
        System.out.println(Any_Object);
    }
    
    static void prl(Object Any_Object){
        System.out.print(Any_Object);
}
  }
