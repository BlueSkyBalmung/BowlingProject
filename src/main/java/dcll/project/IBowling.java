package dcll.project;

import java.util.ArrayList;

/**
 * Created by 21002269 on 09/03/2016.
 */
public interface IBowling {
    public int jouerPartie();
    boolean jetsPossible();
    ArrayList<Integer> getJets();
    void setJets(ArrayList<Integer> i);


}
