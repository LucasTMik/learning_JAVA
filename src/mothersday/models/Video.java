package mothersday.models;

import java.util.Date;
import java.util.Calendar;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.Desktop;
import java.io.IOException;

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
        this.abrirLink(this.linkUrl);
    }

    public void abrirLink(String linkUrl) {
        try {
            URI uri = new URI(linkUrl);
            Desktop desktop = null;
            if (Desktop.isDesktopSupported()) {
            desktop = Desktop.getDesktop();
        }

        if (desktop != null)
            desktop.browse(uri);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (URISyntaxException use) {
            use.printStackTrace();
        }
    };

    @Override 
    public void editMedia(String val) {
        this.linkUrl = val;
    }

    @Override
    public String toString() {
        return this.getTitle();
    }
}