package Affichage;

public class Score {
    private final int NBRE_TOTAL_COIN = 10;
    private int numberCoin;

    public Score(){
        this.numberCoin = 0;
    }

    public int getNBRE_TOTAL_COIN() {
        return NBRE_TOTAL_COIN;
    }

    public int getNumberCoin() {
        return numberCoin;
    }

    public void setNumberCoin(int numberCoin) {
        this.numberCoin = numberCoin;
    }
    
    
}
