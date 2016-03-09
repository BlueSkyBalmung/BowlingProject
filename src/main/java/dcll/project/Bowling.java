package dcll.project;

import java.util.ArrayList;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class Bowling implements IBowling
{
    ArrayList<Integer> scores;
   public Bowling(ArrayList<Integer> i){
        scores=i;
   }


    public int jouerPartie(){
        if(jetsPossible()) {
            int score = 0;
            int current =0;
            for (int i = 0; i + 1 < scores.size() || 10 > current; current++) {
                if (scores.get(i) == 10) {
                    score += scores.get(i);
                    score += (scores.size()>(i+1) ? scores.get(i + 1) : 0);
                    score += (scores.size()>(i+2) ?  scores.get(i + 2) : 0);
                    i++;
                } else{
                     if (scores.size()>(i+1) && (scores.get(i) + scores.get(i + 1)) == 10) {
                         score += 10;
                         score += (scores.size()>(i+2) ? scores.get(i + 2) : 0);

                     }else {
                         score += scores.get(i);
                         score += (scores.size()>(i+1) ?scores.get(i + 1) :0);
                     }
                     i=i+2;
                }
            }
            return score;
        }
        return -1;
   }


   public boolean jetsPossible(){
        for(int i=0; i<scores.size();i++){
            if(scores.size() >10 || scores.size()<0){
                return false;
            }
        }
       return true;
   }

    public ArrayList<Integer> getJets(){
        return scores;
   }

   public void setJets(ArrayList<Integer> i) {
       scores = i;
   }
}
