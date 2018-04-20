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
import java.util.Scanner;
import java.util.ArrayList;

public class Login  {
    private String id ;
    private String q;
    private String pass ;
    static ArrayList str = new ArrayList();
    static ArrayList st = new ArrayList();
     
    
    void boss(){
        str.add("cola");
        st.add("1234");
    }
    
    
    public void enter(){
        
        System.out.println("Are you a member?");
        
       
            Scanner e= new Scanner(System.in);
            System.out.print("Y/N : ");
            q = e.nextLine();
        
        
        if(q.equals("N")||q.equals("n")){
            this.Register();
        }
         
        else if(q.equals("Y")||q.equals("y")){
            this.Login();
        }
        
    }
    
    
    public void Login(){
        System.out.println("");
        System.out.println("=========================================");
        System.out.println("***************** LOG IN ****************");
        System.out.println("=========================================");  
                
                
        Scanner a = new Scanner(System.in);
        System.out.print("Username : ");
        this.id = a.nextLine();
        
        Scanner b = new Scanner(System.in);
        System.out.print("Password : ");
        this.pass = b.nextLine();
                
        for (int i=0 ; i < str.size(); i++) {
               
            if(this.id.equals(str.get(i)) && this.pass.equals(st.get(i))){
                System.out.println("Login successfully"); 
//                            
                            
            }else{
                if(i==str.size()-1){
                    System.out.println("Invalid login, please try again");
                    System.out.println("");
                    enter();
                }
                            
            }
                        
        }     
    }
     

            
    public void Register(){
        
        System.out.println("=========================================");
        System.out.println("***************  Register ***************");
        System.out.println("=========================================");
        
               
        Scanner a = new Scanner(System.in);
        System.out.print("Username : ");
        this.id = a.nextLine();
        
        
        for ( int i=0 ; i < str.size(); i++) {
            if(this.id.equals(str.get(i)) ){
                System.out.println("Invalid register, please try again");
                System.out.println("");
                Register();
            }   
        }
        
        
        
        
        Scanner b = new Scanner(System.in);
        System.out.print("Password : ");
        this.pass = b.nextLine();
        
        st.add(pass);
        str.add(id);

        System.out.println("Register successfully \n");
        enter();
                
       
    } 

}
