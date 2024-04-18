package ex5_1;

public class DVD {
    private final String title;
    private final String ISBN;
    private final Director director;
    private final Actor[] actors;

    //constructor
    public DVD(String title, String ISBN, Director director, Actor[] actors){
        this.title = title;
        this.ISBN = ISBN;
        this.director = director;
        this.actors = actors;
    }

    //getters
    public String getTitle(){
        return title;
    }
    public String getISBN(){
        return ISBN;
    }
    public Director getDirector(){
        return director;
    }
    public Actor[] getActors(){
        return actors;
    }
}
