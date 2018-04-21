/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class fillData extends Showroom{
    
    public static String n,s;
    static int d,m;
    int sum=0;

    LocalDate dday = LocalDate.now();
    LocalDate sday = dday.plus(d, ChronoUnit.DAYS);
    
    public void Fill(){
        System.out.println("=========================================");
        System.out.println("*************** FILL DATA ***************");
        System.out.println("=========================================");
        
        
        Scanner name = new Scanner(System.in);
        System.out.print("Name : ");
        n = name.nextLine();
        
        Scanner surname = new Scanner(System.in);
        System.out.print("Surname : ");
        s = surname.nextLine();
        
        Scanner mobile = new Scanner(System.in);
        System.out.print("Mobile No. : ");
        m = mobile.nextInt();
        
        
        Scanner day = new Scanner(System.in);
        System.out.println();
        do{
        System.out.println("Time to Required (Up to 20 days)");
        System.out.print("How many days : ");
        d = day.nextInt();
        }while(!(d<=20));
    } 

    void info() {
        System.out.println("Name : " + n);
        System.out.println("Surname : " + s);
        System.out.println("Mobile No. : " + m);
        System.out.println();
        
        System.out.println("Time to Required");
        System.out.println("Another " + d + " days");
        System.out.println("yy/mm/dd : "+ sday);
        System.out.println();
    }
    

    @Override
    public void Showroom() {}

    @Override
    public void chooseShowroom() {}
    
    
    public void Deposition(){
        if(d <= 10){
            System.out.println("DEPOSITION 30%");
           
            if(select == 1){
                if(select1 == 1){
                    int caymanS = 10;
                    sum = (30*caymanS)/100;
                    System.out.println("Amount  : " + sum + " million THB");
                    System.out.println("Balance : " + (10 - sum) + " million THB");
                    
                }else if(select1 == 2){
                    int caymanR = 10;
                    sum = (30*caymanR)/100;
                    System.out.println("Amount  : " + sum + " million THB");
                    System.out.println("Balance : " + (10 - sum) + " million THB");
                    
                }else if(select1 == 3){
                    int boxterS = 20;
                    sum = (30*boxterS)/100;
                    System.out.println("Amount  : " + sum + " million THB");  
                    System.out.println("Balance : " + (20 - sum) + " million THB");
                }
        
        ////////////////////////////////////////////////////////////////////////        
                
            }else if(select == 2){
                if(select1 == 1){
                    int F485 = 30;
                    sum = (30*F485)/100;
                    System.out.println("Amount  : " + sum + " million THB");
                    System.out.println("Balance : " + (30 - sum) + " million THB");
                    
                }else if(select1 == 2){
                    int F612 = 30;
                    sum = (30*F612)/100;
                    System.out.println("Amount  : " + sum + " million THB");
                    System.out.println("Balance : " + (30 - sum) + " million THB");
                    
                }else if(select1 == 3){
                    int F599 = 40;
                    sum = (30*F599)/100;
                    System.out.println("Amount  : " + sum + " million THB"); 
                    System.out.println("Balance : " + (40 - sum) + " million THB");
                }
                
        ////////////////////////////////////////////////////////////////////////        
                
            }else if(select == 3){
                if(select1 == 1){
                    int R8 = 20;
                    sum = (30*R8)/100;
                    System.out.println("Amount  : " + sum + " million THB");
                    System.out.println("Balance : " + (20 - sum) + " million THB");
                    
                }else if(select1 == 2){
                    int TTS = 50;
                    sum = (30*TTS)/100;
                    System.out.println("Amount  : " + sum + " million THB");
                    System.out.println("Balance : " + (50 - sum) + " million THB");
                    
                }else if(select1 == 3){
                    int A8 = 80;
                    sum = (30*A8)/100;
                    System.out.println("Amount  : " + sum + " million THB");    
                    System.out.println("Balance : " + (80 - sum) + " million THB");
                }
                
        //////////////////////////////////////////////////////////////////////        
            
            }else if(select == 4){
                if(select1 == 1){
                    int shelby = 20;
                    sum = (30*shelby)/100;
                    System.out.println("Amount  : " + sum + " million THB");
                    System.out.println("Balance : " + (20 - sum) + " million THB");
                    
                }else if(select1 == 2){
                    int mGT = 10;
                    sum = (30*mGT)/100;
                    System.out.println("Amount  : " + sum + " million THB");
                    System.out.println("Balance : " + (10 - sum) + " million THB");
                    
                }else if(select1 == 3){
                    int mEco = 40;
                    sum = (30*mEco)/100;
                    System.out.println("Amount  : " + sum + " million THB"); 
                    System.out.println("Balance : " + (40 - sum) + " million THB");
                }
        ////////////////////////////////////////////////////////////////////////
        
            }
        }else if(d >= 11 && d<=20){
            System.out.println("DEPOSITION 50%");   
            
            if(select == 1){
                if(select1 == 1){
                    int caymanS = 10;
                    sum = (50*caymanS)/100;
                    System.out.println("Amount  : " + sum + " million THB");
                    System.out.println("Balance : " + (10 - sum) + " million THB");
                    
                }else if(select1 == 2){
                    int caymanR = 10;
                    sum = (50*caymanR)/100;
                    System.out.println("Amount  : " + sum + " million THB");
                    System.out.println("Balance : " + (10 - sum) + " million THB");
                    
                }else if(select1 == 3){
                    int boxterS = 20;
                    sum = (50*boxterS)/100;
                    System.out.println("Amount  : " + sum + " million THB"); 
                    System.out.println("Balance : " + (20 - sum) + " million THB");
                }
                
    ////////////////////////////////////////////////////////////////////////////
            }else if(select == 2){
                if(select1 == 1){
                    int F485 = 30;
                    sum = (50*F485)/100;
                    System.out.println("Amount  : " + sum + " million THB");
                    System.out.println("Balance : " + (30 - sum) + " million THB");
                    
                }else if(select1 == 2){
                    int F612 = 30;
                    sum = (50*F612)/100;
                    System.out.println("Amount  : " + sum + " million THB");
                    System.out.println("Balance : " + (30 - sum) + " million THB");
                    
                }else if(select1 == 3){
                    int F599 = 40;
                    sum = (50*F599)/100;
                    System.out.println("Amount  : " + sum + " million THB"); 
                    System.out.println("Balance : " + (40 - sum) + " million THB");
                }
                
        //////////////////////////////////////////////////////////////////////// 
            }else if(select == 3){
                if(select1 == 1){
                    int R8 = 20;
                    sum = (50*R8)/100;
                    System.out.println("Amount  : " + sum + " million THB");
                    System.out.println("Balance : " + (20 - sum) + " million THB");
                    
                }else if(select1 == 2){
                    int TTS = 50;
                    sum = (50*TTS)/100;
                    System.out.println("Amount  : " + sum + " million THB");
                    System.out.println("Balance : " + (50 - sum) + " million THB");
                    
                }else if(select1 == 3){
                    int A8 = 80;
                    sum = (50*A8)/100;
                    System.out.println("Amount  : " + sum + " million THB"); 
                    System.out.println("Balance : " + (80 - sum) + " million THB");
                }
                
        //////////////////////////////////////////////////////////////////////  
            }else if(select == 4){
                if(select1 == 1){
                    int shelby = 20;
                    sum = (50*shelby)/100;
                    System.out.println("Amount  : " + sum + " million THB");
                    System.out.println("Balance : " + (20 - sum) + " million THB");
                    
                }else if(select1 == 2){
                    int mGT = 10;
                    sum = (50*mGT)/100;
                    System.out.println("Amount  : " + sum + " million THB");
                    System.out.println("Balance : " + (10 - sum) + " million THB");
                    
                }else if(select1 == 3){
                    int mEco = 40;
                    sum = (50*mEco)/100;
                    System.out.println("Amount  : " + sum + " million THB"); 
                    System.out.println("Balance : " + (40 - sum) + " million THB");
                }
        ////////////////////////////////////////////////////////////////////////
            }
        
        
        }
        
    }
    
    public String re(){
        String t = null;
        if(select == 1){
            t = "PORSCHE";
        }else if(select == 2){
            t= "FERRARI";
        }else if(select == 3){
            t ="AUDI";
        }else if(select == 4){
            t = "FORD";
        }
        return t;
    }
}
////////////////////////////////////////////////////////////////////////////////



    


