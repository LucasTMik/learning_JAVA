package mothersday.controllers;

import java.io.*;
import javax.imageio.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Calendar;

import mothersday.lib.MediaDatabase;
import mothersday.contracts.*;
import mothersday.models.*;

public class MediaController {
    
    MediaDatabase dbMedia;

    public MediaController() {
        dbMedia = new MediaDatabase();
    }

    public ArrayList<Media> getMedias() {
        return dbMedia.getItems();
    }

    public ArrayList<Media> getMediaByParam(String param, String val) {
        return dbMedia.getByParam(param, val);
    }

    public Media scheduleMedia( Son son, MediaTypes type, String title, String media, Calendar scheduleDate ) {
        Media mediaObj = null;
        if(son.getMother() != null) {
            switch(type) {
                case FRASE: {
                    mediaObj = new Frase(media, title, scheduleDate, son);
                    break;
                }
                case VIDEO: {
                    mediaObj = new Video(media, title, scheduleDate, son);
                    break;
                }
                case AUDIO: {
                    mediaObj = new Audio(media, title, scheduleDate, son);
                    break;
                }
                default: {
                    System.out.println("MEdia type errado");
                }
            }
            if(mediaObj != null) 
                dbMedia.insert(mediaObj);
        } else 
            System.out.println("Você ainda não cadastrou sua mae");
        return mediaObj;
    }

    
}