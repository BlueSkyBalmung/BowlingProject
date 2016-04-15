package dcll.project;

import java.util.ArrayList;

/**
 * permet de jouer au bowling.
 */
public interface IBowling {

    /**
     * Permet de lancer la parte, retourne le score,
     * @author equipeProjet.
     * @return score
     */
    int playGame();

    /**
     * regarde si le jets comprend des valeurs possible.
     * @return jetsPossible
     */
    boolean jetsPossible();

    /**
     * renvoie les jets préalablement mis en paramètre.
     * @return jets
     */
    ArrayList<Integer> getJets();

    /**
     * modifie les jets choisis.
     * @param i les jets
     */
    void setJets(ArrayList<Integer> i);
}