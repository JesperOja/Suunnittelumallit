package Facade;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CPU {
    
    public void Freeze(){
        System.out.println("Tietokone käynnistyy, kone kuitenkin vielä jäässä, kestää hetken..");
    }
    public void Jump(Map memoryMap ){
        Set set = memoryMap.entrySet();

        Iterator itr = set.iterator();

        while(itr.hasNext()){
            Map.Entry entry = (Map.Entry)itr.next();
            System.out.println("Jumping to position " + entry.getKey() + "... Data: " +entry.getValue());
        }
        
    }
    public void Execute(){
        System.out.println("Executing program!");
    }
}
