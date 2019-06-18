package mothersday.lib;

import mothersday.models.*;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class MediaDatabase {
    
    ArrayList<Media> data = new ArrayList<Media>();

    public Media insert(Media element) {
        data.add(element);
        return element;
    }

    public ArrayList<Media> getItems() {
        return data;
    }

    public boolean removeItem(Media element) {
        try{
            this.data.remove(element);
            return true;
        } catch(Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public ArrayList<Media> getByParam(String param, String val) {

        ArrayList<Media> results = new ArrayList<Media>();

        try {
            switch(param) {
                case "title": {
                    for(Media media : this.data) 
                        if(media.getTitle().contains(val)) 
                            results.add(media);
                    break;
                }
                case "userEmail": {
                    for(Media media : this.data) 
                        if(media.getOwner().getEmail().equals(val))
                            results.add(media);
                    break;
                }
                case "nota": {
                    for(Media media: this.data) {
                        try {
                            if(media.getGrade() == Float.parseFloat(val))
                                results.add(media);
                        } catch(Exception e) {
                            // e.printStackTrace();
                        }
                    } 
                    break;
                }
                case "notaGt": {
                    for(Media media: this.data) {
                        try {
                            if(media.getGrade() > Float.parseFloat(val))
                                results.add(media);
                        } catch(Exception e) {
                            // e.printStackTrace();
                        }
                    }
                    break;
                }
                case "notaGtEq": {
                    for(Media media: this.data) {
                        try {
                            if(media.getGrade() >= Float.parseFloat(val))
                                results.add(media);
                        } catch(Exception e) {
                            // e.printStackTrace();
                        }
                    }
                    break;
                }
                case "notaLt": {
                    for(Media media: this.data) {
                        try {
                            if(media.getGrade() < Float.parseFloat(val))
                                results.add(media);
                        } catch(Exception e) {
                            // e.printStackTrace();
                        }
                    }
                    break;
                }
                case "notaLtEq": {
                    for(Media media: this.data) {
                        try {
                            if(media.getGrade() <= Float.parseFloat(val))
                                results.add(media);
                        } catch(Exception e) {
                            // e.printStackTrace();
                        }
                    }
                    break;
                }
                case "vizualized": {
                    for(Media media: this.data)
                        if(media.getIsVizualized() && media.getTitle().contains(val))
                            results.add(media);
                    break;
                }
                case "notVizualized": {
                    for(Media media: this.data)
                        if(!media.getIsVizualized() && media.getTitle().contains(val))
                            results.add(media);
                    break;
                }
                case "type": {
                    for(Media media: this.data) 
                        if(media.getType().toString().contains(val.toUpperCase()))
                            results.add(media);
                    break;
               }
                case "date": {
                    for(Media media: this.data) 
                        if(Long.parseLong(media.getScheduledDate()) == Long.parseLong(val))
                            results.add(media);
                    break;
                }
                case "dateGt": {
                    for(Media media: this.data)
                        if(Long.parseLong(media.getScheduledDate()) > Long.parseLong(val))
                            results.add(media);
                    break;
                }
                case "dateGtEq": {
                    for(Media media: this.data) 
                        if(Long.parseLong(media.getScheduledDate()) >= Long.parseLong(val))
                            results.add(media);
                    break;
                }
                case "dateLt": {
                    for(Media media: this.data)
                        if(Long.parseLong(media.getScheduledDate()) < Long.parseLong(val))
                            results.add(media);
                    break;
                }
                case "dateLtEq": {
                    for(Media media: this.data)
                        if(Long.parseLong(media.getScheduledDate()) <= Long.parseLong(val))
                            results.add(media);
                    break;
                }
                default: {
                    System.out.println("Parametro de busca incorreto");
                }
            }
        } catch(Exception E) {
            // E.printStackTrace();
        }

        return results;
    }

}
