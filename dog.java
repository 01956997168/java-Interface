/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionoflist.Interface;

/**
 *
 * @author Shiplu L
 */
public class dog implements animal{

    @Override
    public void sound() {
        System.out.println(" Dog is baw baw");  
    }

    @Override
    public void eat() {
        System.out.println("Dog eat everything");
    }
    
}
