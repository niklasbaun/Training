package ex5_1;

import java.util.Date;

public class Director {
    private String prename;
    private String surname;
    private Date birthdate;

    //constructor
    public Director(String prename, String surname, Date birthdate){
        this.prename = prename;
        this.surname = surname;
        this.birthdate = birthdate;
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
