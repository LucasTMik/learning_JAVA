package mothersday.lib;

import mothersday.users.*;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class SonDatabase {
    
    List<Son> data = new ArrayList<Son>();

    public Son insert(Son element) {
        data.add(element);
        return element;
    }

    public List<Son> getItems() {
        return data;
    }

    public Son removeItemByParam(String param, String val) {
        Son element = this.getByParam(param, val).get(0);
        this.data.remove(element);
        return element;
    }

    public List<Son> getByParam(String param, String val) {

        List<Son> results = new ArrayList<Son>();

        switch(param) {
            case "name": {
                for(Son Son : this.data) {
                    if(Son.getName().equals(val)) 
                        results.add(Son);
                }
            }
            case "email": {
                for(Son Son : this.data) {
                    if(Son.getEmail().equals(val))
                        results.add(Son);
                }
            }
        }

        return results;
    }

}
