package Game;

public class Chrono implements Runnable {

    private final int PAUSE = 3; // temps d'attente entre 2 tours de boucle

    @Override
    public void run() {

        while(true){
            Main.scene.repaint(); // repaint est la methode qui permet de refresh
            // System.out.println("Ok");

            try {
               Thread.sleep(PAUSE);
             } catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }
}

// Main scene repain sert à refresh toute les 3ms mon jeu en boucle infinie