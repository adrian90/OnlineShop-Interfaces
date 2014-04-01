package Interfaces;


import java.util.ArrayList;

public interface IAlbum extends IProduct {
    public void setPhoto(String photo); 
    public void setAddSong(ISong song);  
    public String getPhoto(); 
    public ArrayList<ISong> getSongsAlbum();
    public IAlbum getAlbum();
    public ISong getSong(int id);

}
