/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;



/**
 *
 * @author Administrator
 */
public class Main   {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("****** WELCOME TO KINSMAN SUPERCAR ******");
        System.out.println("=========================================");
//        System.out.println("");
//        System.out.println("[ LOG IN ] ");
        
        ////////////////////////////////////////////////////////////////////////
        
        Login a = new Login();
        a.boss();
        a.enter();
        
        ////////////////////////////////////////////////////////////////////////
        
        Car b = new Car();
        b.Showroom();
        b.print();
        
        ///////////////////////////////////////////////////////////////////////
       
        Print p = new Print();
        p.print1();
        
        ////////////////////////////////////////////////////////////////////////
        
        fillData fd = new fillData();
        fd.Fill();
        ////////////////////////////////////////////////////////////////////////
        
    
        
        total s = new total();    
        
        Main o =new Main();
        o.Account();
    }
    
    public void Account(){
        fillData fd = new fillData();
        System.out.println();
        System.out.println("ACCOUNT");
        System.out.println("Account Name : " + fd.re()+ " SUPERCAR ");
        System.out.println("Account No. : 8000-055-5101-90");
        System.out.println("Call Center : 1700-671626");
        System.out.println();
        System.out.println("=========================================");
        System.out.println("*************** THANK YOU ***************");
        System.out.println("=========================================");

    }

}
