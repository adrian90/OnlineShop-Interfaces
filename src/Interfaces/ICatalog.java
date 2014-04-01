package Interfaces;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.ejb.Remote;
import javax.naming.NamingException;

@Remote
public interface ICatalog {
    public ICatalog findCat(int id, String clase) throws NamingException, SQLException; 
    public IAlbum findAlb(int id, String clase) throws NamingException, SQLException;
    public void setAddAlbum(IAlbum alb);
    public ArrayList getCatalog();
    public IProduct getProduct(String name, float price);
    public void setID(int ID);
    public int getID();
    public void setPosition(int pos);
    public void setNproducts(int npro);
    public int getPosition();
    public int getNproducts();
    public int getNPages();
}
