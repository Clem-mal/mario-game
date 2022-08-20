package Character;
import java.awt.*;

import javax.swing.ImageIcon;

import Objets.Objets;

public class Mushroom extends Character implements Runnable {

    private Image imgMushroom;
    private ImageIcon icoMushroom;
    private final int BREAK = 15;
    private int dxMushroom;

    public Mushroom (int x, int y) {
        super(x , y, 27, 30);
        super.setWalkInRight(true);
        super.setWalk(true);
        this.dxMushroom = 1;

        this.icoMushroom = new ImageIcon(getClass().getResource("champArretDroite.png"));
        this.imgMushroom = this.icoMushroom.getImage();


        // this.imgMushroom = Toolkit.getDefaultToolkit().getImage("../images/champArretDroite.png");

        Thread chronoMushroom = new Thread(this);
            chronoMushroom.start();
    }
    public Image getImgMushroom() {
        return imgMushroom;
    }
  
    public void move(){
        if(super.isWalkingInRight() == true) {
            this.dxMushroom = 1;
        } else {
            this.dxMushroom = -1;
        }super.setX(super.getX() + this.dxMushroom);
    }

    @Override
    public void run(){
        try{ Thread.sleep(20);
        }
        catch (InterruptedException e) {}
        while(true) {
            if(this.isLife == true){
            this.move();
            try{Thread.sleep(BREAK);
            }
            catch (InterruptedException e){}
        }
    }

    }

    public void contact(Objets objet) {
        if (super.contactFront(objet) == true && this.isWalkingInRight() == true){
            super.setWalkInRight(false);
            this.dxMushroom =-1;
        }else if(
            super.contactBack(objet) == true && this.isWalkingInRight() == false ){
                super.setWalkInRight(true);
                this.dxMushroom =1;
            }

    }
    public void contact(Character character){
        if(super.contactFront(character) == true && this.isWalkingInRight() == true) {
            super.setWalkInRight(false);
            this.dxMushroom = -1;
        }else if (super.contactBack(character) == true && this.isWalkingInRight() == false){
            super.setWalkInRight(true);
            this.dxMushroom = 1;
        }
    }

    public Image die(){
        String str;
        Image img;

        if(this.isWalkingInRight() == true){
            str = "images/champEcraseDroite.png";
        } else { str = "images/champEcraseGauche.png";}
        img = Toolkit.getDefaultToolkit().getImage(str);
        return img;
    }


}

        




