package Objets;
import java.awt.*;

public class Coin extends Objets implements Runnable {

    private int counter;
    private final int BREAK = 15; // temps d'attente entre 2 tour de boublce

    public Coin (int x, int y){
        super(x, y, 30, 30);

        super.imgObjet = Toolkit.getDefaultToolkit().getImage("images/piece1.png");

    }

    public Image move(){
        String str;
        Image img;


        this.counter++;
        if (this.counter /100 == 0) {
            str = "images/piece1.png";
        } else {
            str = "images/piece2.png";
        }
        if (this.counter == 200) {
            this.counter = 0;
        }
        img = Toolkit.getDefaultToolkit().getImage(str);
        return img;

        }

        @Override
        public void run() {
            try {Thread.sleep(20); // On attend 20ms avant d'appeler Le methode Move() pour que tous les objets sont complétement créer
            }
            catch (InterruptedException e) {}

            while(true) {
                this.move();
                try {Thread.sleep(BREAK);
                }
                catch(InterruptedException e) {}
            }
        }
    }
    

  