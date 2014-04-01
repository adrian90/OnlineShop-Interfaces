package Interfaces;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.naming.NamingException;

public interface IUser {
    public UserInterface findUser(String user, String pass, String clase) throws NamingException, SQLException;
    public ArrayList<IProduct> findProducts(String user, String pass, String clase) throws NamingException, SQLException;
}
