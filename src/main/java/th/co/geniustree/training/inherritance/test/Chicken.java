/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package th.co.geniustree.training.inherritance.test;

/**
 *
 * @author TOY
 */
public class Chicken extends Animal{
    public Chicken(){
        //System.out.println("Chicken");
        this.setName("Chicken");
    }
    @Override
    public void eat(){
        System.out.println("Chicken Eat");
    }
    
}
