package mothersday.models;

import java.util.Date;
import java.util.Calendar;

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
    public void playMedia() {
        //Abre Pane com mensagem
    }

    @Override
    public String toString() {
        return this.getTitle();
    }
}