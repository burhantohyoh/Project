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
public abstract class Showroom { // 1 abstract class
    static int select,select1;
    public abstract void Showroom();
    public abstract void chooseShowroom();
        //Scanner a = new Scanner(System.in);
        //System.out.print("Select Showroom : ");
        //select = a.nextInt();
    
 
}

/////////////////////////////////////cola
// 4 interface

interface first{
    public void Porsche();
}

interface second{
    public void Ferrari();
}

interface third{
    public void Audi();
}

interface forth{
    public void Ford();
}

////////////////////////////////////////////////////////////////

class Car extends Showroom implements first,second,third,forth{ 
    
    public void Showroom(){
        System.out.println("=========================================");
        System.out.println("**************** SHOWROOM ***************");
        System.out.println("=========================================");
        System.out.println("1 : Porsche");
        System.out.println("2 : Ferrari");
        System.out.println("3 : Audi");
        System.out.println("4 : Ford");     
    }

    @Override
    public void Porsche() {
        System.out.println("=========================================");
        System.out.println("**************** PORSCHE ****************");
        System.out.println("=========================================");
        System.out.println("1 : Cayman S                10 million THB");
        System.out.println("2 : Cayman R                10 million THB");
        System.out.println("3 : Boxster S               20 million THB");
        this.chooseCar();
    }

    @Override
    public void Ferrari() {
        System.out.println("=========================================");
        System.out.println("**************** FERRARI ****************");
        System.out.println("=========================================");
        System.out.println("1 : Ferrari 458 Special     30 million THB");
        System.out.println("2 : Ferrari F612 SCALIETTI  30 million THB");
        System.out.println("3 : Ferrari 599 GTO         40 million THB");
        this.chooseCar();
        
    }

    @Override
    public void Audi() {
        System.out.println("=========================================");
        System.out.println("****************** AUDI *****************");
        System.out.println("=========================================");
        System.out.println("1 : R8 quattro 2017         20 million THB");
        System.out.println("3 : TTS quattro 2016        50 million THB");
        System.out.println("2 : A8 quattro Prestige     80 million THB");
        this.chooseCar();
    }

    @Override
    public void Ford() {
        System.out.println("=========================================");
        System.out.println("****************** FORD *****************");
        System.out.println("=========================================");
        System.out.println("1 : Shelby GT350R 2017       20 million THB");
        System.out.println("2 : Mustang GT Premium 2017  10 million THB");
        System.out.println("3 : Mustang Ecoboost 2018    40 million THB"); 
        this.chooseCar();
    }
  
    @Override
    public void chooseShowroom() {
        
    
        do{
            Scanner a = new Scanner(System.in);
            System.out.print("Select Showroom : ");
            select = a.nextInt();
        }while(!(select <= 4));
        
        
        if(select == 1){
            Porsche();
        }else if(select == 2){
            Ferrari();
        }else if(select == 3){
            Audi();
        }else if(select == 4){
            Ford();
        }
    }
    
    ////////////////////////////////////////cola
    
    public void chooseCar() {
        do{ 
            Scanner cC = new Scanner(System.in);
            System.out.print("Select Car : ");
            select1 = cC.nextInt();
        }while(!(select1<=3));
    }
    
    void print() {
        chooseShowroom();
    } 
} 
    
////////////////////////////////////////////cola

class Print extends selectColor {
    void print1() {
        super.colour();
        super.chooseColor();
    } 
}