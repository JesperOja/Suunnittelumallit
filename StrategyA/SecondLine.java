package StrategyA;

import java.util.List;

public class SecondLine implements ListConverter {

    @Override
    public void listToString(List<String> list) {
        String[] array = new String[list.size()];
        list.toArray(array);
        
        String merkkijono = "";
        for(int i = 1; i < array.length+1 ; i++){
            if(i % 2 == 0){
                merkkijono += array[i-1] + "/n";
            }else{
                merkkijono += array[i-1];
            }
        }
        System.out.println(merkkijono);
    }
}
