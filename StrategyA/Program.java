package StrategyA;


import java.util.*;

public class Program {
    public static void main(String[] args){
        List<String> lista = new ArrayList<String>();

        lista.add("Tämä on ensimmäinen lause tässä tehtävässä");
        lista.add("Toinen samanmoinen!");
        lista.add("Kolmas sitä parempi");
        lista.add("Neljäs senkin voittaa!");
        lista.add("Viides kiveen hakkaa");
        lista.add("Kuudes kuusen kaataa");
        lista.add("Seitsemäs veljistä komein");
        lista.add("Kahdeksan pientä on ihmisen näköistä");
        lista.add("Yhdenksäs se yhteen laittaa");
        lista.add("Kymmenes se kaikentietää!");

        ListConverter jokainen = new EveryLine();
        ListConverter toinen = new SecondLine();
        ListConverter kolmas = new ThirdLine();

        jokainen.listToString(lista);
        toinen.listToString(lista);
        kolmas.listToString(lista);
    }
}
