/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

abstract class abstractTest {
    static int a = 5;
    public  void test1(){}
    
}
class Main extends abstractTest{
    public static void main(String[] args) {
        System.out.println("aaaaa"+a);
    }
} 