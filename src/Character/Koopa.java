package Character;
import java.awt.*;




import Objets.Objets;

public class Koopa extends Character implements Runnable{
    private Image imgKoopa;
    private final int BREAK = 15;
    private int dxKoopa;
    

    public Koopa (int x, int y) {
        super(x , y, 43, 50);
        super.setWalkInRight(true);
        super.setWalk(true);
        this.dxKoopa = 1;

        // this.icoKoopa = new ImageIcon(getClass().getResource("champArretDroite.png"));
        // this.imgKoopa = this.icoKoopa.getImage();
        imgKoopa = Toolkit.getDefaultToolkit().getImage("../images/tortueArretDroite.png");

        Thread chronoKoopa = new Thread(this);
        chronoKoopa.start(); 
        }

        public Image getImgKoopa() {
            return imgKoopa;
        }
        
        public void move(){
            if(super.isWalkingInRight() == true) {
                this.dxKoopa = 1;
            } else {
                this.dxKoopa = -1;
            }super.setX(super.getX() + this.dxKoopa);
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
                this.dxKoopa =-1;
            }else if(
                super.contactBack(objet) == true && this.isWalkingInRight() == false ){
                    super.setWalkInRight(true);
                    this.dxKoopa =1;
                }
    
        }
        public void contact(Character character){
            if(super.contactFront(character) == true && this.isWalkingInRight() == true) {
                super.setWalkInRight(false);
                this.dxKoopa = -1;
            }else if (super.contactBack(character) == true && this.isWalkingInRight() == false){
                super.setWalkInRight(true);
                this.dxKoopa = 1;
            }
        }
        public Image die(){
            String str;
            Image img;

            str = "../images/tortueFermee.png";
            img = Toolkit.getDefaultToolkit().getImage(str);
            return img;
        }
    }