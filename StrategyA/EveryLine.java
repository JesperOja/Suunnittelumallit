package StrategyA;

import java.util.List;
import java.util.ListIterator;

public class EveryLine implements ListConverter{

    @Override
    public void listToString(List<String> list) {
        ListIterator<String> itera = list.listIterator();
        String merkkijono = "";
        while(itera.hasNext()){
            merkkijono += itera.next() + "/n";
        }
        System.out.println(merkkijono);
    }
    
}
