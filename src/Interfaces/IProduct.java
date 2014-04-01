package Interfaces;

import java.sql.Time;

public interface IProduct {
    public void setName(String name);   
    public void setAuthor(String author);    
    public void setPrice(float price);
    public void setAdded(boolean T);
    public void setTime(Time t);
    public void setID(int id);
    public void setBuyed(boolean T);
    
    public String getName();
    public float getPrice();
    public String getAuthor();
    public boolean getAdded();
    public Time getTime();
    public int getID();
    public boolean getBuyed();
}
