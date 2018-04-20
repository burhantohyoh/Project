/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */

public abstract class Colour { //1 abstract class
    
    public abstract void chooseColor();
}

class selectColor  {
    static int select2;
    public void colour(){
        System.out.println("=========================================");
        System.out.println("**************** COLOUR *****************");
        System.out.println("=========================================");
        System.out.println("1 : Red");
        System.out.println("2 : Black");
        System.out.println("3 : White");
        System.out.println("4 : Grey");
        System.out.println("5 : Yellow");
        System.out.println("6 : Gold Limited Edition");
    }
    
    public void chooseColor() {
        
       do{ 
           Scanner ch = new Scanner(System.in);
        System.out.print("Select Colour : ");
        select2 = ch.nextInt();
       }while(!(select2<=6));
    }
}