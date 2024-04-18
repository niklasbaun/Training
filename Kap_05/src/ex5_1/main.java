package ex5_1;

import java.util.Date;

public class main {
    public static void main(String[] args) {
        // create a new library with content
        // create actors
        Actor actor1 = new Actor("Viggo", "Mortensen", new Date(1958, 10, 20));
        Actor actor2 = new Actor("Hugo", "Weaving", new Date(1960, 4, 4));
        Actor actor3 = new Actor("Orlando", "Bloom", new Date(1977, 1, 13));
        Actor actor4 = new Actor("Elijah", "Wood", new Date(1981, 1, 28));
        Actor actor5 = new Actor("Ian", "McKellen", new Date(1939, 5, 25));
        Actor actor6 = new Actor("Sean", "Bean", new Date(1959, 4, 17));
        Actor actor7 = new Actor("Christopher", "Lee", new Date(1922, 5, 27));
        Actor actor8 = new Actor("Matt", "Damon", new Date(1970, 8, 8));
        Actor actor9 = new Actor("Franka", "Potente", new Date(1974, 12, 22));
        Actor actor10 = new Actor("Clive", "Owen", new Date(1964, 10, 3));
        Actor actor11 = new Actor("Karl", "Urban", new Date(1972, 6, 7));
        Actor actor12 = new Actor("Daniel", "Brühl", new Date(1978, 6, 16));
        Actor actor13 = new Actor("Tommy", "Lee Jones", new Date(1946, 9, 15));
        Actor simonPegg = new Actor("Simon", "Pegg", new Date(1970, 2, 14));
        Actor nickFrost = new Actor("Nicholas", "Frost", new Date(1972, 3, 28));
        Actor simonJones = new Actor("Simon", "Jones", new Date(1950, 7, 27));
        Actor kristenBell = new Actor("Kristen", "Bell", new Date(1980, 7, 18));
        Actor idinaMenzel = new Actor("Idina", "Menzel", new Date(1971, 5, 30));
        Actor jonathanGroff = new Actor("Jonathan", "Groff", new Date(1985, 3, 26));
        Actor joshGad = new Actor("Josh", "Gad", new Date(1981, 2, 23));
        Actor scottAdsit = new Actor("Scott", "Adsit", new Date(1973, 4, 19));
        Actor ryanPotter = new Actor("Ryan", "Potter", new Date(1989, 1, 10));
        Actor danielHenney = new Actor("Daniel", "Henney", new Date(1979, 11, 28));
        Actor toddMiller = new Actor("Todd", "Miller", new Date(1969, 4, 30));
        Actor auliʻiCravalho = new Actor("Auliʻi", "Cravalho", new Date(2000, 11, 22));
        Actor dwayneJohnson = new Actor("Dwayne", "Johnson", new Date(1972, 5, 2));
        Actor rachelHouse = new Actor("Rachel", "House", new Date(1971, 8, 17));
        Actor TemueraMorrison = new Actor("Temuera", "Morrison", new Date(1964, 3, 26));

        // create directors
        Director director1 = new Director("Peter", "Jackson", new Date(1961, 10, 31));
        Director director2 = new Director("Paul", "Greengrass", new Date(1961, 10, 29));
        Director director3 = new Director("Doug", "Liman", new Date(1965, 7, 22));
        Director director4 = new Director("Tony", "Gilroy", new Date(1958, 10, 20));
        Director edgarWright = new Director("Edgar", "Wright", new Date(1974, 4, 18));
        Director alanBell = new Director("Alan", "Bell", new Date(1937, 11, 14));
        Director jenniferLee = new Director("Jennifer", "Lee", new Date(1970, 3, 23));
        Director donHall = new Director("Don", "Hall", new Date(1955, 1, 1));
        Director johnMusker = new Director("John", "Musker", new Date(1954, 1, 1));

        // create DVDs
        DVD dvd1 = new DVD("Lord of the Rings: The Fellowship of the Ring", "0000-0000-401A-0000-7-0000-000A-V", director1, new Actor[]{actor1, actor2, actor3, actor4, actor5, actor6, actor7});
        DVD dvd2 = new DVD("Lord of the Rings: The Two Towers", "0000-0001-DAA4-0000-O-0000-0008-L",director1, new Actor[]{actor1, actor2, actor3, actor4, actor5, actor6, actor7, actor11});
        DVD dvd3 = new  DVD("Lord of the Rings: The Return of the King", "0000-0001-DAA3-0000-J-0000-0009-0",  director1, new Actor[]{actor1, actor2, actor3, actor4, actor5, actor6, actor7, actor11});
        DVD dvd4 = new DVD("The Bourne Identity", "0000-0000-F733-0000-5-0000-0000-M", director2, new Actor[]{actor8, actor9, actor10});
        DVD dvd5 = new DVD("The Bourne Supremacy", "0000-0001-5EB1-0000-S-0000-0009-9", director2, new Actor[]{actor8, actor9, actor11});
        DVD dvd6 = new DVD("The Bourne Ultimatum", "0000-0001-BDCB-0000-M-0000-0006-V", director2, new Actor[]{actor8, actor12});
        DVD dvd7 = new DVD("Jason Bourne", "0000-0004-755D-0000-Z-0000-0000-6", director4, new Actor[]{actor8, actor13});
        DVD shaunOfTheDead = new DVD("Shaun of the dead", "0000-0000-ECA9-0000-C-0000-0000-1", edgarWright, new Actor[]{simonPegg, nickFrost});
        DVD hotFuzz = new DVD("Hot Fuzz", "0000-0001-B356-0000-D-0000-0000-Z", edgarWright, new Actor[]{simonPegg, nickFrost});
        DVD theWorldsEnd = new DVD("The World's End", "0000-0003-A092-0000-9-0000-0000-A", edgarWright, new Actor[]{simonPegg, nickFrost});
        DVD perAnhalterDurchDieGalaxis = new DVD("Per Anhalter durch die Galaxis", "0000-0001-89EB-0000-H-0000-0004-F", alanBell, new Actor[]{simonJones});
        DVD dasRestaurantAmEndeDesUniversums = new DVD("Das Restaurant am Ende des Universums", "0000-0004-3F46-0000-U-0000-0001-J", alanBell, new Actor[]{simonJones});
        DVD frozen2 = new DVD("Frozen II", "0000-0005-701F-0000-Y-0000-0000-9", jenniferLee, new Actor[]{kristenBell, idinaMenzel, jonathanGroff, joshGad});
        DVD baymax = new DVD("Baymax", "0000-0004-9237-0000-H-0000-0000-N", donHall, new Actor[]{ryanPotter, danielHenney, toddMiller});
        DVD moana = new DVD("Moana", "0000-0004-9249-0000-5-0000-0000-M", johnMusker, new Actor[]{auliʻiCravalho, dwayneJohnson, rachelHouse, TemueraMorrison});

        //create library
        DVD[] dvds = new DVD[0];
        Library our_Library = new Library("Our Library", new Date(),dvds);
        //add all DVDs to the library
        our_Library.addDVD(dvd1);
        our_Library.addDVD(dvd2);
        our_Library.addDVD(dvd3);
        our_Library.addDVD(dvd4);
        our_Library.addDVD(dvd5);
        our_Library.addDVD(dvd6);
        our_Library.addDVD(dvd7);
        our_Library.addDVD(shaunOfTheDead);
        our_Library.addDVD(hotFuzz);
        our_Library.addDVD(theWorldsEnd);
        our_Library.addDVD(perAnhalterDurchDieGalaxis);
        our_Library.addDVD(dasRestaurantAmEndeDesUniversums);
        our_Library.addDVD(frozen2);
        our_Library.addDVD(baymax);
        our_Library.addDVD(moana);

        //remove some DVDs from the library
        our_Library.removeDVD("The Bourne Ultimatum");
        our_Library.removeDVD("Lord of the Rings: The Two Towers");

        System.out.println(our_Library.doIOwn(dvd3));
        System.out.println(our_Library.doIOwn(dvd6));

        testLib();
    }

    public static void testLib(){
        DVD[] dvdCollection = new DVD[0];
        Library test_library = new Library("My Library", new Date(),dvdCollection);
        if (test_library.getName().equals("My Library")){
            System.out.println("Name test passed");
        } else {
            System.out.println("Test failed");
            System.out.println("Expected: My Library");
            System.out.println("Actual: " + test_library.getName());
        }
        //for length 0, without any content
        if (test_library.getDVDs().length == 0){
            System.out.println("DVD Test passed");
        } else {
            System.out.println("Test failed");
            System.out.println("Expected: 0");
            System.out.println("Actual: " + test_library.getDVDs().length);
        }
        //add DVDs
        // create a new library with content
        // create actors
        Actor actor1 = new Actor("Viggo", "Mortensen", new Date(1958, 10, 20));
        Actor actor2 = new Actor("Hugo", "Weaving", new Date(1960, 4, 4));
        Actor actor3 = new Actor("Orlando", "Bloom", new Date(1977, 1, 13));
        Actor actor4 = new Actor("Elijah", "Wood", new Date(1981, 1, 28));
        Actor actor5 = new Actor("Ian", "McKellen", new Date(1939, 5, 25));
        Actor actor6 = new Actor("Sean", "Bean", new Date(1959, 4, 17));
        Actor actor7 = new Actor("Christopher", "Lee", new Date(1922, 5, 27));
        Actor actor8 = new Actor("Matt", "Damon", new Date(1970, 8, 8));
        Actor actor9 = new Actor("Franka", "Potente", new Date(1974, 12, 22));
        Actor actor10 = new Actor("Clive", "Owen", new Date(1964, 10, 3));
        Actor actor11 = new Actor("Karl", "Urban", new Date(1972, 6, 7));
        Actor actor12 = new Actor("Daniel", "Brühl", new Date(1978, 6, 16));
        Actor actor13 = new Actor("Tommy", "Lee Jones", new Date(1946, 9, 15));
        // create directors
        Director director1 = new Director("Peter", "Jackson", new Date(1961, 10, 31));
        Director director2 = new Director("Paul", "Greengrass", new Date(1961, 10, 29));
        Director director3 = new Director("Doug", "Liman", new Date(1965, 7, 22));
        Director director4 = new Director("Tony", "Gilroy", new Date(1958, 10, 20));

        // create DVDs
        DVD dvd1 = new DVD("Lord of the Rings: The Fellowship of the Ring", "0000-0000-401A-0000-7-0000-000A-V", director1, new Actor[]{actor1, actor2, actor3, actor4, actor5, actor6, actor7});
        DVD dvd2 = new DVD("Lord of the Rings: The Two Towers", "0000-0001-DAA4-0000-O-0000-0008-L",director1, new Actor[]{actor1, actor2, actor3, actor4, actor5, actor6, actor7, actor11});
        DVD dvd3 = new DVD("Lord of the Rings: The Return of the King", "0000-0001-DAA3-0000-J-0000-0009-0",  director1, new Actor[]{actor1, actor2, actor3, actor4, actor5, actor6, actor7, actor11});
        DVD dvd4 = new DVD("The Bourne Identity", "0000-0000-F733-0000-5-0000-0000-M", director2, new Actor[]{actor8, actor9, actor10});
        DVD dvd5 = new DVD("The Bourne Supremacy", "0000-0001-5EB1-0000-S-0000-0009-9", director2, new Actor[]{actor8, actor9, actor11});
        DVD dvd6 = new DVD("The Bourne Ultimatum", "0000-0001-BDCB-0000-M-0000-0006-V", director2, new Actor[]{actor8, actor12});
        DVD dvd7 = new DVD("Jason Bourne", "0000-0004-755D-0000-Z-0000-0000-6", director4, new Actor[]{actor8, actor13});
        //add all DVDs to the library
        test_library.addDVD(dvd1);
        test_library.addDVD(dvd2);
        test_library.addDVD(dvd3);
        test_library.addDVD(dvd4);
        test_library.addDVD(dvd5);
        test_library.addDVD(dvd6);
        test_library.addDVD(dvd7);
        //test length again
        if (test_library.getDVDs().length == 7){
            System.out.println("2nd DVD length Test passed");
        } else {
            System.out.println("Test failed");
            System.out.println("Expected: 7");
            System.out.println("Actual: " + test_library.getDVDs().length);
        }

        //test remove
        test_library.removeDVD("The Bourne Ultimatum");
        test_library.removeDVD("Lord of the Rings: The Two Towers");
        //check if really removed
        if (!test_library.doIOwn(dvd6)){
            System.out.println("Remove Test 1 passed");
        } else {
            System.out.println("Remove Test 1 Test failed");
            System.out.println("Expected: false");
            System.out.println("Actual: " + test_library.doIOwn(dvd6));
        }
        if (!test_library.doIOwn(dvd2)){
            System.out.println("Remove Test 2 passed");
        } else {
            System.out.println("Remove Test 2 Test failed");
            System.out.println("Expected: false");
            System.out.println("Actual: " + test_library.doIOwn(dvd2));
        }

    }
}
