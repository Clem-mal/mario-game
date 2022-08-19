package Game;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;


public class Keyboard implements KeyListener {
    @Override
    public void keyPressed(KeyEvent e) {
        if(Main.scene.mario.isLife() == true) {

        if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            if(Main.scene.getxPos() == -1){
                Main.scene.setxPos(0);
                Main.scene.setxBackground(-50);
                Main.scene.setxBackground2(750);
            }
            Main.scene.mario.setWalk(true);
            Main.scene.mario.setWalkInRight(true);
            Main.scene.setDx(1);
        }
        else if (e.getKeyCode() == KeyEvent.VK_LEFT){
            if(Main.scene.getxPos() == 4431){
                Main.scene.setxPos(4430);
                Main.scene.setxBackground(-50);
                Main.scene.setxBackground2(750);
            }


            Main.scene.setDx(-1);
            Main.scene.mario.setWalk(true);
            Main.scene.mario.setWalkInRight(false);
        }
        if (e.getKeyCode() == KeyEvent.VK_SPACE){
            Main.scene.mario.setJumping(true);
        }
     }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        Main.scene.mario.setWalk(false);
        Main.scene.setDx(0); // Au relachement de la touche DX revient à 0
        
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
}
