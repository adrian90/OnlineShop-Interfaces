package Interfaces;

import javax.ejb.Remote;
@Remote
public interface UserInterface {
    
    public boolean isLogin();    
    public void setLogin();
    public void setLogout();
    public void setNick(String nick);
    public void setPassword(String password);
    public void setCorreo(String correo);
    public void setNombre(String nombre);
    public void setApellidos(String apellidos);
    public void setEdad(int edad);
    public void setPais(String pais);
    
    public String getNick();
    public String getPassword();
    public String getCorreo();
    public String getNombre();
    public String getApellidos();
    public int getEdad();
    public String getPais();
    
    public void remove();
}
