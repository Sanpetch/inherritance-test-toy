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
public class Animal {
    private String name;

    public Animal() {
        System.out.println("Constructor of Animal");
    }
    public void eat(){
        System.out.println("Animal eat");
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    
}
