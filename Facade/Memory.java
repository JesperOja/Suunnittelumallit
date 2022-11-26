package Facade;

import java.util.HashMap;
import java.util.Map;

public class Memory {
    private Map memoryMap = new HashMap();

    public void Load(long position, String data){
        memoryMap.put(position, data);
        System.out.println("Loading from memory position " + position + " data: " +data);
    }

    public Map getMap(){
        return memoryMap;
    }
}
