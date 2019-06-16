package mothersday.models;

import java.util.Date;
import java.util.Calendar;
import javax.sound.sampled.*;

import mothersday.contracts.*;

public class Audio extends Media {
    private String localPath;

    public Audio(String localPath, String title, Calendar scheduledDate, Son user) {
        super(title, scheduledDate, MediaTypes.AUDIO, user);
        this.localPath = localPath;
    } 

    public String getLocalPath() {
        return this.localPath;
    }

    @Override 
    public void playMedia() {
        //Abre no navegador
        System.out.println("toacando audio");
        this.playSound(this.localPath);
    }

    @Override
    public String toString() {
        return this.getTitle();
    }

    public static synchronized void playSound(final String name) {
        new Thread(new Runnable() {
        // The wrapper thread is unnecessary, unless it blocks on the
        // Clip finishing; see comments.
        public void run() {
            try {
                Clip clip = AudioSystem.getClip();
                System.out.println(name);
                AudioInputStream inputStream = AudioSystem.getAudioInputStream(
                Audio.class.getResourceAsStream("../static/" + name));
                clip.open(inputStream);
                clip.start(); 
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
        }).start();
    }
}