package com.daviinacio.sysmi.avaliacao;

import java.util.ArrayList;
import java.util.List;

/**
 * @author daviinacio
 */
public class TrainComposition {
    private final List<Integer> wagons;
    
    public TrainComposition(){
        this.wagons = new ArrayList<>();
    }
    
    public void dockWagonRight(int wagon){
        wagons.add(wagon);
    }
    
    public void dockWagonLeft(int wagon){
        wagons.add(0, wagon);
    }
    
    public int undockWagonRight(){
        if(wagons.isEmpty()){
            System.err.print("The Train Composition is empty");
            return 0;
        }
        
        int lastWagonPosition = wagons.size() -1;
        int wagon = wagons.get(lastWagonPosition);
        wagons.remove(lastWagonPosition);
        
        return wagon;
    }
    
    public int undockWagonLeft(){
        if(wagons.isEmpty()){
            System.err.print("The Train Composition is empty");
            return 0;
        }
        
        int wagon = wagons.get(0);
        wagons.remove(0);
        
        return wagon;
    }

    @Override
    public String toString() {
        if(wagons.isEmpty())
            return "O trem esta vazio";
        else
            return String.format("O trem e composto pelos vagoes: %s", wagons);
    }
}
