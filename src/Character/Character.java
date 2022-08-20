package Character;
import java.awt.*;
import Objets.*;
import Game.Main;

public class Character {
    private int width, height;
    private int x, y;
    public boolean isWalking;
    public boolean isWalkingInRight;
    public int counter;
    protected boolean isLife;


public Character (int x, int y, int width, int height) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
    this.counter = 0;
    this.isWalking = false;
    this.isWalkingInRight = true;
    this.isLife = true;
    }


public boolean isLife() {
    return isLife;
}


public void setLife(boolean isLife) {
    this.isLife = isLife;
}


public int getWidth() {
    return width;
}


public void setWidth(int width) {
    this.width = width;
}


public int getHeight() {
    return height;
}


public void setHeight(int height) {
    this.height = height;
}


public int getX() {
    return x;
}


public void setX(int x) {
    this.x = x;
}


public int getY() {
    return y;
}


public void setY(int y) {
    this.y = y;
}


public boolean isWalking() {
    return isWalking;
}


public void setWalk(boolean isWalking) {
    this.isWalking = isWalking;
}


public boolean isWalkingInRight() {
    return isWalkingInRight;
}


public void setWalkInRight(boolean isWalkingInRight) {
    this.isWalkingInRight = isWalkingInRight;
}


public int getCounter() {
    return counter;
}


public void setCounter(int counter) {
    this.counter = counter;
}

public Image walk(String name, int frequency){

    String str;
    Image img;

    if (this.isWalking == false){

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
    public void deplacement(){
        if(Main.scene.getxPos()>= 0){
            this.x = this.x - Main.scene.getDx();
        }
    }

protected boolean contactFront(Objets objet) {
        if  (this.x + this.width < objet.getX() ||
            this.x + this.width > objet.getX()  + 5 ||
            this.y + this.height <= objet.getY() ||
            this.y >= objet.getY() + objet.getHeight())
            {return false;
        }else {
            return true;}
    }

protected boolean contactBack(Objets objet){
        if (this.x > objet.getX() + objet.getHeight() ||
            this.x + this.width < objet.getX() + objet.getWidth() - 5 ||
            this.y + this.height <= objet.getY() ||
            this.y >= objet.getY() + objet.getHeight())
            {return false;
        }else {
            return true;}
        }

protected boolean contactUnder (Objets objet) {
        if (this.x + this.width <objet.getX() + 5 ||
            this.x > objet.getX() + objet.getWidth() - 5 ||
            this.y + this.height < objet.getY() ||
            this.y + this.height > objet.getY() + 5)
            {return false;
        }else {
            return true;}
        }
protected boolean contactUpper (Objets objet) {
        if (this.x +  this.width < objet.getX() + 5 ||
            this.x > objet.getX() + objet.getWidth() - 5 ||
            this.y < objet.getY() + objet.getHeight() ||
            this.y > objet.getY() + objet.getHeight() + 5)
            {return false;
        }else {
            return true;
        }
    }
public boolean isClose (Objets objet) {
        if((this.x > objet.getX() - 10 && this.x < objet.getX() + objet.getWidth() + 10) ||
            (this.x + this.width > objet.getX() - 10 && this.x + this.width < objet.getX() + objet.getWidth() + 10)) {
                return true;
        } else {
                return false;
            }
        }
        protected boolean contactFront(Character character) {
            if  (this.x + this.width < character.getX() ||
                this.x + this.width > character.getX()  + 5 ||
                this.y + this.height <= character.getY() ||
                this.y >= character.getY() + character.getHeight())
                {return false;
            }else {
                return true;}
        }
        protected boolean contactBack(Character character){
            if (this.x > character.getX() + character.getHeight() ||
                this.x + this.width < character.getX() + character.getWidth() - 5 ||
                this.y + this.height <= character.getY() ||
                this.y >= character.getY() + character.getHeight())
                {return false;
            }else {
                return true;}
            }

        protected boolean contactUnder(Character character){
            if(this.x + this.width < character.getX()  || this.x > character.getX() + character.getWidth() ||
            this.y + this.height < character.getY() || this.y + this.height > character.getY())
            {return false;}
            else {
                return true;}
    }
            public boolean isClose (Character character) {
                if((this.x > character.getX() - 10 && this.x < character.getX() + character.getWidth() + 10) ||
                    (this.x + this.width > character.getX() - 10 && this.x + this.width < character.getX() + character.getWidth() + 10)) {
                        return true;
                } else {
                        return false;
                    }
                }


}



