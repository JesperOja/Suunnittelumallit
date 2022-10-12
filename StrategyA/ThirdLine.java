package StrategyA;


import java.util.List;

public class ThirdLine implements ListConverter{
    
    @Override
    public void listToString(List<String> list) {
        String merkkijono = "";
        for(int i = 1; i<list.size()+1; i++){
            if(i % 3 == 0){
                merkkijono += list.get(i-1) + "/n";
            }else{
                merkkijono += list.get(i-1);
            }
        }

        System.out.println(merkkijono);
    }
    
}
