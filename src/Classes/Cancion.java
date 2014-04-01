package Classes;

import java.io.Serializable;

public class Cancion extends Classes.Product implements Interfaces.ISong, Serializable{
    private String album;
    
    @Override
    public void setSAlbum(String album){
        this.album= album;
    }
    
    @Override
    public String getAlbum(){
        return this.album;
    }
}
