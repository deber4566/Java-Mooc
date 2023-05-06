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

public class Hold {
    private ArrayList<Suitcase> holder;
    private int maxweight;
    
    public Hold(int maximumweight){
        maxweight=maximumweight;
        holder= new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase){
        
        this.maxweight=this.maxweight-suitcase.totalWeight();
        if (this.maxweight>=0){
             holder.add(suitcase);
        }
       
    }
    
    public int totalHoldWeight(){
        int hw=0;
        
        for (Suitcase s:this.holder){
            hw+=s.totalWeight();
        }
        
        return hw;
    }
            
    public String toString(){
        return holder.size()+ " suitcases ("+this.totalHoldWeight()+" kg)";
    }        
    
    public void printItems(){
         for (Suitcase s:holder){
             s.printItems();
        }
    }
    
}
