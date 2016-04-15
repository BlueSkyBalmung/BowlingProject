/**
 * package dcll.
 * @since 1.0
 * @author Vincent et Timothée
 * @version 1.0
 */
package dcll.project;

import java.util.ArrayList;

/**
 * permet de jouer au bowling.
 */
public class Bowling implements IBowling {

    /**
     * valeur d'un strike au bowling.
     */
    private static final int STRIKE =  10;

    /**
     * listes des jets.
     */
    private ArrayList<Integer> scores;

    /**
     * CONSTRUCTEUR.
     * @param i jets
     */
   public Bowling(final ArrayList<Integer> i) {
        scores = i;
   }

    /**
     * joue une partie, retourne le score, dépend des jets Choisis.
     * @return score
     * @return -1
     */
    public final int playGame() {
        if (jetsPossible()) {
            int score = 0;
            int current = 0;
            for (int i = 0; scores.size() > i &&
                    ((i + 1  < scores.size() && scores.get(i) < STRIKE)
                    || STRIKE > current); current++) {
                if (scores.get(i) == STRIKE) {
                    score += scores.get(i);
                    if (scores.size() > (i + 1)) {
                        score += scores.get(i + 1);
                    }
                    if (scores.size() > (i  + 2)) {
                        score += scores.get(i + 2);
                    }
                    i++;
                } else {
                     if (scores.size() > (i + 1)
                             && (scores.get(i) + scores.get(i + 1)) == STRIKE) {
                         score += STRIKE;
                         if (scores.size() > (i + 2)) {
                             score += scores.get(i + 2);
                         }
                     } else {
                         score += scores.get(i);
                         if (scores.size() > (i + 1)) {
                             score += scores.get(i + 1);
                         }
                     }
                     i = i + 2;
                }
            }
            return score;
        }
        return -1;
   }

    /**
     * vérifie que les jets sont possible.
     * @return jetsPossible
     */
   public final boolean jetsPossible() {
       if (scores.size() == 0) {
           return false;
       }
       for (int i = 0; i < scores.size(); i++) {
           if (scores.get(i) < 0) {
               return false;
           }
           if (scores.get(i) > STRIKE) {
               return false;
           }

       }

       return true;
   }

    /**
     * retourne les jets selectionnes.
     * @return jets
     */
    public final ArrayList<Integer> getJets() {
        return scores;
   }

    /**
     * modifie les jets selectionnés.
     * @param i jets
     */
   public final void setJets(final ArrayList<Integer> i) {
       scores = i;
   }
}
