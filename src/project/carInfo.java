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
class carInfo extends Showroom {
    public  void chooseShowroom(){}
    public  void Showroom(){}
    
    void carInfo(){
        if(select == 1){
            System.out.println("Showroom : Porsche");   
        }else if(select == 2){
            System.out.println("Showroom : Ferrari");
        }else if(select == 3){
            System.out.println("Showroom : Audi");
        }else if(select == 4){
            System.out.println("Showroom : Ford");
        }  
    }

}

class carColour extends selectColor{
    @Override
    public void chooseColor() {}
    
    void carColour(){
        if(select2 == 1){
            System.out.println("Color : Red");   
        }else if(select2 == 2){
            System.out.println("Color : Black");
        }else if(select2 == 3){
            System.out.println("Color : White");
        }else if(select2 == 4){
            System.out.println("Color : Grey");
        }else if(select2 == 5){
            System.out.println("Color : Yellow");
            
        }else if(select2 == 6){
            System.out.println("Color : Gold Limited Edition");
        }
        
        System.out.print("Model : "); 
    }
}
