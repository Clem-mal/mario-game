package Objets;
import java.awt.*;

import Game.Main;

public class Objets {
    private int width, height;
    private int x, y;

    protected Image imgObjet;
    

    public Objets (int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;

    }
    public Image getImgObjet() {
        return imgObjet;
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

    public void deplacement(){
        if(Main.scene.getxPos()>= 0){
            this.x = this.x - Main.scene.getDx();
        }
    }
    
}
