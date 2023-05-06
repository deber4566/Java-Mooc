/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wilson
 */
public class Item {
    private String name;
    private int kg;
    
    public Item(String name, int weight){
        this.name=name;
        this.kg=weight;
    }
    
    public String getName(){
        return name;
    }
    
    public int getWeight(){
        return kg;
    }
    
    public String toString(){
        return name+"("+kg+" kg)";
    }
}
