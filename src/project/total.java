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
class total extends Showroom {
    public  void chooseShowroom(){}
    public  void Showroom(){}
    public int i;
    
    
    fillData fd = new fillData();
    
    carInfo cI = new carInfo();
    carColour cCo = new carColour();
    
///////////////////////////////////////////////////////////////////////////////    
    
    total() {
    System.out.println("=========================================");
    System.out.println("**************** RECEIPT ****************");
    System.out.println("=========================================");
    this.total(select);
    }
    

    
    public void total(int select) {
        if( select == 1){
            fd.info();
            cI.carInfo();
            cCo.carColour();
            
            totalPorsche(select1);
            System.out.println();
            fd.Deposition();
             
            
        }else if(select == 2){
            fd.info(); 
            cI.carInfo();
            cCo.carColour();
            
            totalFerrari(select1);
            System.out.println();
            fd.Deposition();
           
            
        }else if(select == 3){
            fd.info(); 
            cI.carInfo();
            cCo.carColour();
            
            totalAudi(select1);
            System.out.println();
            fd.Deposition();
            
            
        }else if(select == 4){
            fd.info(); 
            cI.carInfo();
            cCo.carColour();
            
            totalFord(select1);
            System.out.println();
            fd.Deposition();
            
        } 
    }
    
 ///////////////////////////////////////////////////////////////////////////////
    
    public void totalPorsche(int select1) {
        i = select1;
    
        if(i== 1){
            System.out.println("Cayman S");
            System.out.println("Price : 10 million THB");
            
        }else if(i== 2){
            System.out.println("Cayman R");
            System.out.println("Price : 10 million THB");
            
        }else if(i== 3){
            System.out.println("Boxster S");
            System.out.println("Price : 20  million THB");
        }
    }
    
    
    public void totalFerrari(int select1) {
        if(select1 == 1){
            System.out.println("Ferrari 458 Special");
            System.out.println("Price : 30 million THB");
            
        }else if(select1 == 2){
            System.out.println("Ferrari F612 SCALIETTI");
            System.out.println("Price : 30 million THB");
            
        }else if(select1 == 3){
            System.out.println("Ferrari 599 GTO");
            System.out.println("Price : 40 million THB");
        }
    }
    
    
    public void totalAudi(int select1) {
        if(select1 == 1){
            System.out.println("R8 quattro 2017");
            System.out.println("Price : 20 million THB");
            
        }else if(select1 == 2){
            System.out.println("TTS quattro 2016");
            System.out.println("Price : 50 million THB");
            
        }else if(select1 == 3){
            System.out.println("A8 quattro Prestige");
            System.out.println("Price : 80 million THB");
        }
    }
    
    
    public void totalFord(int select1) {
        if(select1 == 1){
            System.out.println("Shelby GT350R 2017");
            System.out.println("Price : 20 million THB");
            
        }else if(select1 == 2){
            System.out.println("Mustang GT Premium 2017");
            System.out.println("Price : 10 million THB");
            
        }else if(select1 == 3){
            System.out.println("Mustang Ecoboost 2018");
            System.out.println("Price : 40 million THB");
        }
 
    }

}

