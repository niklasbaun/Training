package ex5_1;

import java.util.Date;
import java.util.Objects;

public class Library {
    private String name;
    private Date date;
    private DVD[] dvds;

    //constructor
    public Library(String name, Date date, DVD[] dvds){
        this.name = name;
        this.date = date;
        this.dvds = dvds;
    }

    //getters
    public String getName(){
        return name;
    }
    public Date getDate(){
        return date;
    }
    public DVD[] getDVDs(){
        return dvds;
    }

    public void  addDVD(DVD dvd){
        DVD[] newDVDs = new DVD[dvds.length + 1];
        for(int i = 0; i < dvds.length; i++){
            newDVDs[i] = dvds[i];
        }
        newDVDs[dvds.length] = dvd;
        dvds = newDVDs;
    }

    public void removeDVD(String dvd){
        DVD[] newDVDs = new DVD[dvds.length - 1];
        int j = 0;
        for(int i = 0; i < dvds.length; i++){
            if(!Objects.equals(dvds[i].getTitle(), dvd)){
                newDVDs[j] = dvds[i];
                j++;
            }
        }
        dvds = newDVDs;
    }

    public boolean doIOwn(DVD dvd){
        for(int i = 0; i < dvds.length; i++){
            if(dvds[i] == dvd){
                return true;
            }
        }
        return false;
    }
}
