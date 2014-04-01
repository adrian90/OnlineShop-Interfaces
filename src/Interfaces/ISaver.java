package Interfaces;

import java.sql.SQLException;
import javax.naming.NamingException;


public interface ISaver {
    
    public void saveProducts(ICart cart, String clase)throws NamingException, SQLException;
}
