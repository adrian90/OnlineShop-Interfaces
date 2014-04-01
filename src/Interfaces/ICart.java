package Interfaces;

import javax.ejb.Remote;
import java.util.ArrayList;

@Remote
public interface ICart {
    public void addProduct (IProduct p);
    public void removeProduct (int p);
    public void setUser(String user);
    public ArrayList<IProduct> getContents();
    public void remove();
    public void setTotalPrice(float totalprice);
    public void sumTotalPrice(float totalprice);
    public void restTotalPrice(float totalprice);
    public float getTotalPrice();
    public String getUser();
}
