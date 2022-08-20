package Game;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

import Character.Koopa;
import Character.Mario;
import Character.Mushroom;
import Objets.Block;
import Objets.Coin;
import Objets.Objets;
import Objets.TuyauRouge;

public class Scene extends JPanel {
    private Image imgBackground = Toolkit.getDefaultToolkit().getImage("../images/ecran.png");
    private Image imgBackground2 = Toolkit.getDefaultToolkit().getImage("../images/ecran.png");
    // private Image imgMario =
    // Toolkit.getDefaultToolkit().getImage("images/marioMarcheDroite.png");
    private Image imgCastel = Toolkit.getDefaultToolkit().getImage("../images/chateau1.png");
    private Image imgStart = Toolkit.getDefaultToolkit().getImage("../images/depart.png");
    private Image imgFlag = Toolkit.getDefaultToolkit().getImage("../images/drapeau.png");
    private Image imgCastelEnd = Toolkit.getDefaultToolkit().getImage("../images/chateauFin.png");

    private int xBackground; // posotion du background
    private int xBackground2;
    private int dx; // decalage de la position du background
    private int xPos; // Position absolue dans le jeu

    private int ySol; // hauteur courante du sol
    private int hauteurPlafond;

    public Koopa koopa;
    public Mushroom mushroom;

    public Mario mario;
    public TuyauRouge tuyauRouge1;
    public TuyauRouge tuyauRouge2;
    public TuyauRouge tuyauRouge3;
    public TuyauRouge tuyauRouge4;
    public TuyauRouge tuyauRouge5;
    public TuyauRouge tuyauRouge6;
    public TuyauRouge tuyauRouge7;
    public TuyauRouge tuyauRouge8;

    public Block block1;
    public Block block2;
    public Block block3;
    public Block block4;
    public Block block5;
    public Block block6;
    public Block block7;
    public Block block8;
    public Block block9;
    public Block block10;

    public Coin coin1;
    public Coin coin2;
    public Coin coin3;
    public Coin coin4;
    public Coin coin5;
    public Coin coin6;
    public Coin coin7;
    public Coin coin8;
    public Coin coin9;
    public Coin coin10;

    public Koopa koopa1;
    public Koopa koopa2;
    public Koopa koopa3;
    public Koopa koopa4;
    public Koopa koopa5;
    public Koopa koopa6;
    public Koopa koopa7;
    public Koopa koopa8;
    public Koopa koopa9;

    public Mushroom mushroom1;
    public Mushroom mushroom2;
    public Mushroom mushroom3;
    public Mushroom mushroom4;
    public Mushroom mushroom5;
    public Mushroom mushroom6;
    public Mushroom mushroom7;
    public Mushroom mushroom8;

    private ArrayList<Koopa> allKoopa;
    private ArrayList<Mushroom> allMushroom;
    private ArrayList<Objets> allObjets;
    private ArrayList<Coin> allCoin;

    public Scene() { // : ici Scene est un Constructeur (methode particulière)

        super();

        this.xBackground = -50; // deborde de 50px vers la gauche
        this.xBackground2 = 750;
        this.dx = 0;
        this.xPos = -1;
        this.ySol = 293;
        this.hauteurPlafond = 0;

        mario = new Mario(300, 245);

        tuyauRouge1 = new TuyauRouge(600, 230);
        tuyauRouge2 = new TuyauRouge(1000, 230);
        tuyauRouge3 = new TuyauRouge(1600, 230);
        tuyauRouge4 = new TuyauRouge(1900, 230);
        tuyauRouge5 = new TuyauRouge(2500, 230);
        tuyauRouge6 = new TuyauRouge(3000, 230);
        tuyauRouge7 = new TuyauRouge(3800, 230);
        tuyauRouge8 = new TuyauRouge(450000, 230);

        block1 = new Block(400, 140);
        block2 = new Block(800, 180);
        block3 = new Block(1700, 170);
        block4 = new Block(1340, 160);
        block5 = new Block(2000, 180);
        block6 = new Block(2600, 160);
        block7 = new Block(3500, 140);
        block8 = new Block(4000, 160);
        block9 = new Block(4200, 170);
        block10 = new Block(4300, 180);

        coin1 = new Coin(602, 145);
        coin2 = new Coin(1202, 140);
        coin3 = new Coin(1272, 95);
        coin4 = new Coin(1342, 40);
        coin5 = new Coin(1650, 145);
        coin6 = new Coin(2650, 145);
        coin7 = new Coin(3000, 135);
        coin8 = new Coin(3400, 125);
        coin9 = new Coin(4200, 145);
        coin10 = new Coin(4600, 1000);

        // koopa = new Koopa(950, 243);
        koopa1 = new Koopa(950, 243);
        koopa2 = new Koopa(1500, 243);
        koopa3 = new Koopa(1800, 243);
        koopa4 = new Koopa(2400, 243);
        koopa5 = new Koopa(3100, 243);
        koopa6 = new Koopa(3600, 243);
        koopa7 = new Koopa(3900, 243);
        koopa8 = new Koopa(4200, 243);
        koopa9 = new Koopa(4400, 243);

        // mushroom = new Mushroom(800, 264);
        mushroom1 = new Mushroom(355, 264);
        mushroom2 = new Mushroom(1100, 264);
        mushroom3 = new Mushroom(2100, 264);
        mushroom4 = new Mushroom(2400, 264);
        mushroom5 = new Mushroom(3200, 264);
        mushroom6 = new Mushroom(2500, 264);
        mushroom7 = new Mushroom(3700, 264);
        mushroom8 = new Mushroom(4500, 264);

        allMushroom = new ArrayList<Mushroom>();
        this.allMushroom.add(this.mushroom1);
        this.allMushroom.add(this.mushroom2);
        this.allMushroom.add(this.mushroom3);
        this.allMushroom.add(this.mushroom4);
        this.allMushroom.add(this.mushroom5);
        this.allMushroom.add(this.mushroom6);
        this.allMushroom.add(this.mushroom7);
        this.allMushroom.add(this.mushroom8);

        allKoopa = new ArrayList<Koopa>();
        this.allKoopa.add(this.koopa1);
        this.allKoopa.add(this.koopa2);
        this.allKoopa.add(this.koopa3);
        this.allKoopa.add(this.koopa4);
        this.allKoopa.add(this.koopa5);
        this.allKoopa.add(this.koopa6);
        this.allKoopa.add(this.koopa7);
        this.allKoopa.add(this.koopa8);
        this.allKoopa.add(this.koopa9);

        allCoin = new ArrayList<Coin>();
        this.allCoin.add(this.coin1);
        this.allCoin.add(this.coin2);
        this.allCoin.add(this.coin3);
        this.allCoin.add(this.coin4);
        this.allCoin.add(this.coin5);
        this.allCoin.add(this.coin6);
        this.allCoin.add(this.coin7);
        this.allCoin.add(this.coin8);
        this.allCoin.add(this.coin9);
        this.allCoin.add(this.coin10);

        allObjets = new ArrayList<Objets>();
        this.allObjets.add(this.tuyauRouge1);
        this.allObjets.add(this.tuyauRouge2);
        this.allObjets.add(this.tuyauRouge3);
        this.allObjets.add(this.tuyauRouge4);
        this.allObjets.add(this.tuyauRouge5);
        this.allObjets.add(this.tuyauRouge6);
        this.allObjets.add(this.tuyauRouge7);
        this.allObjets.add(this.tuyauRouge8);

        this.allObjets.add(this.block1);
        this.allObjets.add(this.block2);
        this.allObjets.add(this.block3);
        this.allObjets.add(this.block4);
        this.allObjets.add(this.block5);
        this.allObjets.add(this.block6);
        this.allObjets.add(this.block7);
        this.allObjets.add(this.block8);
        this.allObjets.add(this.block9);
        this.allObjets.add(this.block10);

        this.setFocusable(true);
        this.requestFocusInWindow();
        this.addKeyListener(new Keyboard()); // permet d'écouter les evenement claviers

        Thread chronoEcran = new Thread(new Chrono());
        chronoEcran.start(); // Démare ma fonction RUN dans le fichier Chrono

        // Thread = permet à mon programme de faire plusieurs chose en meme temps

    }

    public int getHauteurPlafond() {
        return hauteurPlafond;
    }

    public void setHauteurPlafond(int hauteurPlafond) {
        this.hauteurPlafond = hauteurPlafond;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getDx() {
        return dx;
    }

    public void setDx(int dx) {
        this.dx = dx;
    }

    public int getxBackground() {
        return xBackground;
    }

    public void setxBackground(int xBackground) {
        this.xBackground = xBackground;

    }

    public int getxBackground2() {
        return xBackground2;
    }

    public void setxBackground2(int xBackground2) {
        this.xBackground2 = xBackground2;

    }

    public int getySol() {
        return ySol;
    }

    // recupére la valeur de DX pour pouvoir la modifié

    public void setySol(int ySol) {
        this.ySol = ySol;
    }

    public void moveBackground() {

        if (this.xPos >= 0 && this.xPos <= 4430) {
            this.xPos = this.xPos + this.dx;
            this.xBackground = this.xBackground - this.dx;
            this.xBackground2 = this.xBackground2 - this.dx;
        }

        // permanence du fond d'écran
        if (this.xBackground == -800) {
            this.xBackground = 800;
        } else if (this.xBackground2 == -800) {
            this.xBackground2 = 800;

        } else if (this.xBackground == 800) {
            this.xBackground = -800;

        } else if (this.xBackground2 == 800) {
            this.xBackground2 = -800;
        }

    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        Graphics g2 = (Graphics2D) g; // graphics 2D : Bilbiotheque graphique de java

        for (int i = 0; i < this.allMushroom.size(); i++) {
            if (this.mario.isClose(this.allMushroom.get(i)) && this.allMushroom.get(i).isLife() == true) {
                this.mario.contact(this.allMushroom.get(i));
            }
        }

        for (int i = 0; i < this.allKoopa.size(); i++) {
            if (this.mario.isClose(this.allKoopa.get(i)) && this.allKoopa.get(i).isLife() == true) {
                this.mario.contact(this.allKoopa.get(i));
            }
        }

        this.moveBackground();
        if (this.xPos >= 0 && this.xPos <= 4430) {
            for (int i = 0; i < this.allObjets.size(); i++) {
                this.allObjets.get(i).deplacement();
            }
            for (int i = 0; i < this.allCoin.size(); i++) {
                this.allCoin.get(i).deplacement();
            }
            for (int i = 0; i < this.allKoopa.size(); i++) {
                this.allKoopa.get(i).deplacement();
            }
            for (int i = 0; i < this.allMushroom.size(); i++) {
                this.allMushroom.get(i).deplacement();
            }
        }

        // detectiion contact avec objet
        for (int i = 0; i < this.allObjets.size(); i++) {

            if (this.mario.isClose(this.allObjets.get(i))) {
                this.mario.contact(this.allObjets.get(i));
            }
            for (int j = 0; j < this.allKoopa.size(); j++) {
                if (this.allKoopa.get(j).isClose(this.allObjets.get(i))) {
                    this.allKoopa.get(j).contact(this.allObjets.get(i));
                }
            }
            for (int j = 0; j < this.allMushroom.size(); j++) {
                if (this.allMushroom.get(j).isClose(this.allObjets.get(i))) {
                    this.allMushroom.get(j).contact(this.allObjets.get(i));
                }
            }

        }
        for (int i = 0; i < this.allCoin.size(); i++) {
            if (this.mario.isClose(this.allCoin.get(i))) {
                if (this.mario.contactCoin(this.allCoin.get(i))) {
                    this.allCoin.remove(i);
                }
            }
        }

        for (int i = 0; i < this.allMushroom.size(); i++) {
            for (int j = 0; j < this.allMushroom.size(); j++) {
                if (j != i) {
                    if (this.allMushroom.get(j).isClose(this.allMushroom.get(i))) {
                        this.allMushroom.get(j).contact(this.allMushroom.get(i));
                    }
                }
            }

            for (int j = 0; j < this.allKoopa.size(); j++) {
                if (this.allKoopa.get(j).isClose(this.allMushroom.get(i))) {
                    this.allKoopa.get(j).contact(this.allMushroom.get(i));
                }

            }
        }
        for (int i = 0; i < this.allKoopa.size(); i++) {
            for (int j = 0; j < this.allMushroom.size(); j++) {
                if (this.allMushroom.get(j).isClose(this.allKoopa.get(i))) {
                    this.allMushroom.get(j).contact(this.allKoopa.get(i));
                }

            }

            for (int j = 1; j < this.allKoopa.size(); j++) {
                if (j != i) {
                    if (this.allKoopa.get(j).isClose(this.allKoopa.get(i))) {
                        this.allKoopa.get(j).contact(this.allKoopa.get(i));
                    }
                }
            }
        }

        g2.drawImage(imgBackground, xBackground, 0, this);
        g2.drawImage(imgBackground2, xBackground2, 0, this);
        g2.drawImage(imgCastel, 10 - this.xPos, 95, this);
        g2.drawImage(imgStart, 220 - this.xPos, 234, this);

        for (int i = 0; i < this.allObjets.size(); i++) {
            g2.drawImage(this.allObjets.get(i).getImgObjet(), this.allObjets.get(i).getX(),
                    this.allObjets.get(i).getY(), this);
        }

        for (int i = 0; i < this.allCoin.size(); i++) {
            g2.drawImage(this.allCoin.get(i).move(), this.allCoin.get(i).getX(), this.allCoin.get(i).getY(), this);
        }

        g2.drawImage(imgCastelEnd, 5000 - this.xPos, 145, this);
        g2.drawImage(imgFlag, 4650 - this.xPos, 115, this);

        if (this.mario.isJumping()) {
            g2.drawImage(this.mario.jump(), this.mario.getX(), this.mario.getY(), this);
        } else {
            g2.drawImage(this.mario.walk("mario", 25), this.mario.getX(), this.mario.getY(), this);
        }

        for (int i = 0; i < this.allMushroom.size(); i++) {
            if (this.allMushroom.get(i).isLife() == true) {
                g2.drawImage(this.allMushroom.get(i).walk("champ", 45), this.allMushroom.get(i).getX(),
                        this.allMushroom.get(i).getY(), this);
            } else {
                g2.drawImage(this.allMushroom.get(i).die(), this.allMushroom.get(i).getX(),
                        this.allMushroom.get(i).getY() + 20, this);
            }
        }

        for (int i = 0; i < this.allKoopa.size(); i++) {
            if (this.allKoopa.get(i).isLife() == true) {
                g2.drawImage(this.allKoopa.get(i).walk("tortue", 50), this.allKoopa.get(i).getX(),
                        this.allKoopa.get(i).getY(), this);
            } else {
                g2.drawImage(this.allKoopa.get(i).die(), this.allKoopa.get(i).getX(), this.allKoopa.get(i).getY() + 30,
                        this);
            }
        }

        // if(this.mushroom.isLife() == true){
        // g2.drawImage(this.mushroom.walk("champ", 45), this.mushroom.getX(),
        // this.mushroom.getY(), this);
        // }else {
        // g2.drawImage(this.mushroom.die(), this.mushroom.getX(), this.mushroom.getY()
        // + 20, this);

        // }

        // if(this.koopa.isLife() == true){
        // g2.drawImage(this.koopa.walk("tortue", 45), this.koopa.getX(),
        // this.koopa.getY(), this);
        // }else {
        // g2.drawImage(this.koopa.die(), this.koopa.getX(), this.koopa.getY() + 20,
        // this);

        // }

    }

}