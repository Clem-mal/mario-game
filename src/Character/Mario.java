package Character;
import java.awt.*;
import Game.Main;
import Objets.Coin;
import Objets.Objets;

public class Mario extends Character {
    private Image imgMario;
    private boolean isJumping;
    private int counterJump; // durée du saut et haute du saut


    public Mario (int x, int y){
        super(x, y , 28, 50);
        imgMario = Toolkit.getDefaultToolkit().getImage("images/marioArretDroite.png");

        this.isJumping = false;
        this.counterJump = 0;
    }

    public boolean isJumping() {
        return isJumping;
    }

    public void setJumping(boolean isJumping) {
        this.isJumping = isJumping;
    }

    public Image getImgMario () {
        return imgMario; 
    }


    @Override
    public Image walk(String name, int frequency) {
        String str;
        Image img;
    
        if (this.isWalking == false || Main.scene.getxPos() <= 0 || Main.scene.getxPos() > 4430){
    
            if (this.isWalkingInRight == true) {
                str = "images/" + name + "ArretDroite.png";
            } else {
                str = "images/" + name + "ArretGauche.png";
            }
        } else {
            this.counter++;
    
            if(this.counter / frequency == 0){
                    if( this.isWalkingInRight == true){
                        str = "images/" + name + "ArretDroite.png";
                    }else {
                        str = "images/" + name + "ArretGauche.png";
                            }
            } else {
                    if( this.isWalkingInRight == true){
                        str = "images/" + name + "MarcheDroite.png";
                    }else {
                        str = "images/" + name + "MarcheGauche.png";
                        }
    
                }if(this.counter == 2 * frequency){
                    this.counter = 0 ; 
                }
            } 
            img = Toolkit.getDefaultToolkit().getImage(str);
            return img;
    
        }

    public Image jump(){
            String str;
            Image img;

        this.counterJump++;

        // montée du saut
        if(this.counterJump <= 40) {
                if(this.getY() > Main.scene.getHauteurPlafond()){
                    this.setY(this.getY() - 4);
                } else {
                    this.counterJump = 41;
                }
                if(this.isWalkingInRight() == true) {
                    str = "images/marioSautDroite.png";
                }else {
                    str = "images/marioSautGauche.png";
                }
            // retombé du saut

        }else if (this.getY() + this.getHeight() < Main.scene.getySol()){
                this.setY(this.getY() + 1);
                if(this.isWalkingInRight() == true) { str = "images/marioSautDroite.png";}
            else {
                str = "images/marioSautGauche.png";
            } 
        }else {
                if (this.isWalkingInRight() == true) { str = "images/marioArretDroite.png";}
                else {str = "images/marioArretGauche.png";}
                this.isJumping = false;
                this.counterJump = 0;
             } 
             img = Toolkit.getDefaultToolkit().getImage(str);
             return img;
        }
        public void contact (Objets objet){
            // contact horizontal
                if (( super.contactFront(objet) == true && this.isWalkingInRight()== true ||
                super.contactBack(objet) == true && this.isWalkingInRight() == false)) {
                Main.scene.setDx(0);
                this.setWalk(false);
            }
                if(super.contactUnder(objet) == true && this.isJumping == true){
                    Main.scene.setySol(objet.getY());
                }else if (super.contactUnder(objet) == false) {
                    Main.scene.setySol(293);
                    if (this.isJumping == false) { this.setY(243);}
            }
                if(super.contactUpper(objet) == true) {
                    Main.scene.setHauteurPlafond(objet.getY() + objet.getHeight());
                }else if (super.contactUpper(objet) == false && this.isJumping == false){
                    Main.scene.setHauteurPlafond(0);
                }
        }
        public boolean contactCoin(Coin coin){
            if  (this.contactBack(coin) == true ||
                this.contactFront(coin) == true ||
                this.contactUnder(coin) == true ||
                this.contactUpper(coin) == true){
                    return true;
            } else {
                    return false;
                }
        }
        public void contact (Character character){
            if((super.contactFront(character) == true) || (super.contactBack(character) == true)){
                this.setWalk(false);
                this.setLife(false);
            } else if(super.contactUnder(character) == true){
                character.setWalk(false);
                character.setLife(false);
            }
        }

    }

    

