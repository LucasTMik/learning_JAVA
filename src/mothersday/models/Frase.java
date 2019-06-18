package mothersday.models;

import java.util.Date;
import java.util.Calendar;
import javax.swing.JOptionPane;

import mothersday.contracts.*;

public class Frase extends Media {
    private String frase;

    public Frase(String frase, String title, Calendar scheduledDate, Son user) {
        super(title, scheduledDate, MediaTypes.FRASE, user);
        this.frase = frase;
    } 

    public String getFrase() {
        return this.frase;
    }

    @Override 
    public void editMedia(String newVal) {
        this.frase = newVal;
    }

    @Override
    public void playMedia() {
        //Abre Pane com mensagem
        JOptionPane.showMessageDialog(null, this.frase);
    }

    @Override
    public String toString() {
        return this.getTitle();
    }
}