package Game;
import javax.swing.*;

public class Main  {

    public static Scene scene; // declaration de réference ( =null par défault)

    public static void main(String[] args){

        scene = new Scene(); // instancation de ma classe = ça devient une reference à un objet 

        JFrame f = new JFrame("New best Game ever");
        f.getContentPane().add(scene);
        f.setSize(700, 350);
        f.setVisible(true);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    }
