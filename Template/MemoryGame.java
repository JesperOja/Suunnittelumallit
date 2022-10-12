package Template;

import java.util.ArrayList;
import java.util.Random;

public class MemoryGame extends Game {

    private ArrayList<Integer> pairs = new ArrayList<>();
    private int playerOnePairs = 0;
    private int playerTwoPairs = 0;
    private int playerThreePairs = 0;
    Random random = new Random();

    @Override
    void initializeGame() {
       System.out.println("Lets play memory game! There is 10 pairs, who finds most, will win!");
       System.out.println();
    }

    @Override
    void makePlay(int player) {
         
         int a = random.nextInt(10-1+1)+1;
         while(pairs.contains(a)){
            a = random.nextInt(10-1+1)+1;
         }
         int b = random.nextInt(10-1+1)+1;
         while(pairs.contains(b)){
            b = random.nextInt(10-1+1)+1;
         }

         if(a == b){
            pairs.add(a);
            System.out.println("Player " + (player+1)+ " turned " + a + " and " + b + ". It's a pair!");
            if(player == 0){
                playerOnePairs++;
                System.out.println("Player 1 has " +playerOnePairs + " pairs now!");
                if(pairs.size()<10){
                    System.out.println("Player 1 gets new turn!");
                    System.out.println();
                    makePlay(player);
                }
                
            }else if(player == 1){
                playerTwoPairs++;
                System.out.println("Player 2 has " +playerTwoPairs + " pairs now!");
                if(pairs.size()<10){
                    System.out.println("Player 2 gets new turn!");
                    System.out.println();
                    makePlay(player);
                }
            }else{
                playerThreePairs++;
                System.out.println("Player 3 has " +playerThreePairs + " pairs now!");
                if(pairs.size()<10){
                    System.out.println("Player 3 gets new turn!");
                    System.out.println();
                    makePlay(player);
                }
            }
         }else{
            System.out.println("Player " + (player+1)+ " turned " + a + " and " + b + ". It's not a pair, maybe next time!");
         }
    }

    @Override
    boolean endOfGame() {
        if(pairs.size() == 10){
            return true;
         }
        return false;
    }

    @Override
    void printWinner() {
        if(playerOnePairs > playerTwoPairs && playerOnePairs > playerThreePairs){
            System.out.println("Player 1 wins with " +playerOnePairs + " pairs!");
        }else if(playerTwoPairs > playerOnePairs && playerTwoPairs > playerThreePairs){
            System.out.println("Player 2 wins with " +playerTwoPairs + " pairs!");
        }else if(playerThreePairs > playerTwoPairs && playerThreePairs == playerOnePairs ){
            System.out.println("Player 3 and Player 1 tide the win with " +playerOnePairs+ " pairs!");
        }else if(playerThreePairs > playerOnePairs && playerThreePairs == playerTwoPairs ){
            System.out.println("Player 3 and Player 2 tide the win with " +playerTwoPairs+ " pairs!");
        }else if(playerOnePairs == playerTwoPairs && playerOnePairs > playerThreePairs){
            System.out.println("Player 1 and Player 2 tide the win with " +playerTwoPairs+ " pairs!");
        }else{
            System.out.println("Player 3 wins with " + playerThreePairs + " pairs!");
        }
        
    }
    
}
