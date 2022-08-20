package Objets;
import java.awt.*;

public class Block extends Objets {

   

    public Block(int x, int y){
        super(x, y, 30, 30);
        super.imgObjet = Toolkit.getDefaultToolkit().getImage("../images/bloc.png");
    }

    
}
