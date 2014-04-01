package Classes;

import Interfaces.IAlbum;
import Interfaces.ISong;
import java.io.Serializable;
import java.util.ArrayList;
public class Album extends Classes.Product implements Interfaces.IAlbum, Serializable {
    private ArrayList<ISong> alb = new ArrayList<>();
    private String photo;
    
    
    @Override
    public void setPhoto(String photo){
        this.photo= photo;
    }   
    @Override
    public void setAddSong(ISong song){
        alb.add(song);
    } 

    @Override
    public String getPhoto(){
        return this.photo;
    }
    
    @Override
    public ArrayList<ISong> getSongsAlbum(){
         return this.alb;
    }
    
    @Override
    public IAlbum getAlbum(){
         return this;
    }
    
    @Override
    public ISong getSong(int id){
         for (int i=0; i<alb.size(); i++){
             if (alb.get(i).getID()==id) 
                 return alb.get(i);
         }
         return null;
    }
    
    
}
