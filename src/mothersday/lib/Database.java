package mothersday.lib;

import mothersday.users.*;
import java.util.ArrayList;
import java.util.List;

public class Database<T> {

    private ArrayList<T> elements = new ArrayList<T>();

    public ArrayList<T> addElement(T element) {

        elements.add(element);
        return elements;
    }
}
