package mothersday.models;

import java.io.*;
import javax.imageio.*;
import java.util.Date;
import java.util.Calendar;

import mothersday.contracts.*;

public abstract class Media {
    private Calendar createdDate;
    private Calendar scheduledDate;
    private MediaTypes type;
    private String title;
    private Float grade;
    private boolean vizualized;
    private Son owner;

    public Media(String titulo, Calendar scheduledDate, MediaTypes type, Son user) {
        Calendar cal = Calendar.getInstance();

        this.createdDate = cal;
        this.scheduledDate = scheduledDate;
        this.title = titulo;
        this.type = type;
        this.grade = null;
        this.vizualized = false;    
        this.owner = user;
    }

    public String getTitle() { return this.title; }
    public Son getOwner() { return this.owner; }
    public Float getGrade() { return this.grade; }
    public boolean getIsVizualized() { return this.vizualized; }
    public MediaTypes getType() { return this.type; }
    public String getScheduledDate() { return Long.toString(this.scheduledDate.getTimeInMillis()); }

    public abstract void playMedia();
    public abstract void editMedia(String val);

    public boolean setTitle(String newTitle) {this.title = newTitle; return true;}
    public boolean setGrade(Float newGrade) { this.grade = newGrade; return true;}
    public boolean view() {return this.vizualized = true; } 
}
