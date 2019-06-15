package mothersday.models;
import java.io.*;
import javax.imageio.*;

import java.util.Date;

public class Media {
    private Date date;
    private MediaTypes type;
    private String title;
    private Float grade;
    private boolean vizualized;
    private Son owner;

    public Media(String titulo, MediaTypes type, Son user) {
        this.date = new Date();
        this.titulo = titulo;
        this.type = type;
        this.grade = null;
        this.vizualizado = false;    
        this.owner = user;
    }

    public String getTitle() { return this.title; }
    public Son getOwner() { return this.owner; }
    public Float getGrade() { return this.grade; }
    public boolean getIsVizualized() { return this.vizualized; }
    public MediaTypes getType() { return this.type; }
}
