package Classes;

import Interfaces.IProduct;
import java.io.Serializable;
import java.sql.Time;

public class Product implements IProduct, Serializable {
    private boolean added = false;
    private boolean buyed = false;
    private String name;
    private String author;
    private float price;
    private int id;
    private Time Time;
    
    @Override
    public void setBuyed(boolean T){
        this.buyed = T;
    }
    @Override
    public void setName(String name){
        this.name= name;
    }
    @Override
    public void setAuthor(String author){
        this.author= author;
    }
    @Override
    public void setPrice(float price){
        this.price= price;
    }
    @Override
    public void setTime(Time time){
        this.Time=time;
    }
    
    @Override
    public void setID(int id){
        this.id= id;
    }
    @Override
    public void setAdded(boolean T){
        this.added= T;
    }
    @Override
    public String getName(){
        return this.name;
    }
    @Override
    public float getPrice(){
        return this.price;
    }
    @Override
    public String getAuthor(){
        return this.author;
    }
    @Override
    public Time getTime(){
        return this.Time;
    }
    @Override
    public int getID(){
        return this.id;
    }
    @Override
    public boolean getAdded(){
        return this.added;
    }
    @Override
    public boolean getBuyed(){
        return this.buyed;
    }
}
