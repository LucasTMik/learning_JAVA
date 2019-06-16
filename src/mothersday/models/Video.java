package mothersday.models;

import java.util.Date;
import java.util.Calendar;

import mothersday.contracts.*;

public class Video extends Media {
    private String linkUrl;

    public Video(String linkUrl, String title, Calendar scheduledDate, Son user) {
        super(title, scheduledDate, MediaTypes.VIDEO, user);
        this.linkUrl = linkUrl;
    } 

    public String getUrl() {
        return this.linkUrl;
    }

    @Override 
    public void playMedia() {
        //Abre no navegador
        System.out.println("Abrindo navegador com video");
    }

    @Override
    public String toString() {
        return this.getTitle();
    }
}