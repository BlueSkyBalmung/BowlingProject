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
        int current=0;
        int score=0;
        for(int i=0; i<10 || scores.size()==current;i++){
            switch(scores.get(current)){
                case 10:
                        score+=scores.get(current);

            }
            current++;
        }
       return score;
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
