package ex7_1;

public class Card implements Comparable<Card> {
    private final String Name;
    private final CardType type;
    private final int year;

    public static final CardType MONSTER_NORMAL = new CardType("Monster Normal");
    public static final CardType MONSTER_EFFECT = new CardType("Monster Effect");
    public static final CardType Spell  = new CardType("Magic");
    public static final CardType Trap = new CardType("Trap");

    //constructor
    public Card(String Name, CardType type, int year) {
        this.Name = Name;
        this.type = type;
        this.year = year;
    }

    //getter
    public String getName() {
        return Name;
    }

   public CardType getType(){
        return type;
   }

    public int getYear(){
          return year;
    }

    @Override
    public int compareTo(Card o) {
        int yearCompare = Integer.compare(getYear(), o.getYear());
        if(yearCompare != 0){
            return yearCompare;
        }
        int typeCompare = getType().getMonster().compareTo(o.getType().getMonster());
        if(typeCompare != 0){
            return typeCompare;
        }
        return getName().compareTo(o.getName());
    }
}



