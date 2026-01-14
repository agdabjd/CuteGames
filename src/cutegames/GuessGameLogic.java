package cutegames;

public class GuessGameLogic {
    public static boolean Guessing(String guessStr){
        int guessInt = Integer.parseInt(guessStr);
        
        double catNumberDouble = 0 + Math.random()*(101);
        int catNumberInt = (int) catNumberDouble;
        
        return catNumberInt == guessInt;
    }
}
