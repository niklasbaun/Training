package ex7_1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Card> cards = Arrays.asList(
                new Card("Blue Eyes White Dragon", Card.MONSTER_NORMAL, 2002),
                new Card("Dark Magician", Card.MONSTER_NORMAL, 2002),
                new Card("Pot of Greed", Card.Spell, 2002),
                new Card("Mirror Force", Card.Trap, 2002),
                new Card("Blue Eyes White Dragon", Card.MONSTER_NORMAL, 2003),
                new Card("Dark Magician", Card.MONSTER_NORMAL, 2003),
                new Card("Pot of Greed", Card.Spell, 2003),
                new Card("Mirror Force", Card.Trap, 2003),
                new Card("Blue Eyes White Dragon", Card.MONSTER_NORMAL, 2004),
                new Card("Dark Magician", Card.MONSTER_NORMAL, 2004),
                new Card("Pot of Greed", Card.Spell, 2004),
                new Card("Mirror Force", Card.Trap, 2004)
        );

        Collections.sort(cards);
        for (Card card : cards) {
            System.out.println(card.getName() + " " + card.getType().getMonster() + " " + card.getYear());
        }
    }
}
