package ex5_1;

import java.util.Date;

public class Actor {
    private String prename;
    private String surname;
    private Date birthdate;

    //constructor
    public Actor(String prename, String surname, Date date){
        this.prename = prename;
        this.surname = surname;
    }

    //getters
    public String getPrename(){
        return prename;
    }
    public String getSurname(){
        return surname;
    }
    public Date getBirthdate(){
        return birthdate;
    }
}
