package mothersday.lib;

import mothersday.models.*;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class SonDatabase {
    
    ArrayList<Son> data = new ArrayList<Son>();

    public Son insert(Son element) {
        data.add(element);
        return element;
    }

    public ArrayList<Son> getItems() {
        return data;
    }

    public boolean removeByParam(String param, String val) {
        ArrayList<Son> elements = this.getByParam(param, val);
        if(elements.size() != 0) {
            this.data.remove(elements.get(0));
            return true;
        }
        return false;
    }

    public boolean removeItem(Son user) {
        try {
            this.data.remove(user);
            return true;
        } catch(Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public ArrayList<Son> getByParam(String param, String val) {

        ArrayList<Son> results = new ArrayList<Son>();

        switch(param) {
            case "name": 
                for(Son son : this.data) {
                    if(son.getName().contains(val)) 
                        results.add(son);
                break;
            }
            case "email": {
                for(Son son : this.data) 
                    if(son.getEmail().equals(val))
                        results.add(son);
                break;
            }
            case "mother": {
                for(Son son : this.data)
                    if(son.getAsMother() != null && (val.contains("") || son.getName().contains(val)))
                        results.add(son);
                break;
            } 
        }

        return results;
    }

}
