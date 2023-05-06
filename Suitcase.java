/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wilson
 */

import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxweight;
    
    public Suitcase(int maxweight){
        this.items=new ArrayList<>();
        this.maxweight=maxweight;
    }
    
    public Item heaviestItem(){
        if (items.isEmpty()){
            return null;
        }
        
        Item heaviest=items.get(0);
        
        for (Item pointer:items){
            if (heaviest.getWeight()<pointer.getWeight()){
                heaviest=pointer;
            }
        }
        
        return heaviest;
    }
    
    public void addItem(Item item){
        
        this.maxweight=this.maxweight-item.getWeight();
        if (this.maxweight>=0){
            items.add(item);
        }
        
    }
    
    public int totalWeight(){
        int w=0;
        
        for (Item i:this.items){
            w+=i.getWeight();
        }
        
        return w;
    }
    
    public void printItems(){
        for (Item item: items){
            System.out.println(item);
        }
    }
            
            
            
    public String toString(){
        
        if (items.size()==0){
            return "no items (0 kg)";
        }
        
        if (items.size()==1){
            return "1 item ("+this.totalWeight()+" kg)";
        }
        
        return items.size() + " items ("+ this.totalWeight() + "kg)";
    }
}
