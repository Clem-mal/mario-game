package audio;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Audio {

    private Clip clip;

    public Audio(String son) {

        try {
            AudioInputStream audio = AudioSystem.getAudioInputStream(new File(son));
            clip = AudioSystem.getClip();
            clip.open(audio);
        } catch (Exception e) {}

    }

    public Clip getClip() { return clip;}

    public void play(){clip.start();}
    public void stop(){clip.stop();}

    public static void playSound(String son){
        Audio s = new Audio(son);
        s.play();
    }
}
