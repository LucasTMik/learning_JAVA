package mothersday.lib;

import mothersday.users.*;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class Database<T> {

    private static final String _NOME_BANCO_ = "db.bd";
    private static final String _STRING_CONEXAO_ = "jdbc:sqlite:"+_NOME_BANCO_;

    private ArrayList<T> elements = new ArrayList<T>();


    // public Database() {
    //     try {
    //         Class.forName("org.sqlite.JDBC");
    //     } catch(Exception e) {
    //         e.printStackTrace();
    //     }
    //     java.io.File file = new java.io.File(_NOME_BANCO_);
    //     if(!file.exists()) 
    //         createDb();
    // }

    // private void createDb() {
    //     try {
    //         Connection conn = DriverManager.getConnection(_STRING_CONEXAO_);
    //         Statement stm = conn.createStatement();

    //         stm.executeUpdate("CREATE TABLE Users("
    //                                 +"userId INTEGER PRIMARY KEY,"
    //                                 +"name varchar(80) not null,"
    //                                 +"email varchar(40) not null,"
    //                                 +"pass INTEGER not null);");
    //         stm.close();
    //         conn.close();            
    //     } catch( Exception e) {
    //         e.printStackTrace();
    //     }
    // }

    // public ArrayList<T> addElement(T element) {

    //     elements.add(element);
    //     return elements;
    // }

}
