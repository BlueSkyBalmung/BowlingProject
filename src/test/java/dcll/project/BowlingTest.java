package dcll.project;

import junit.framework.Test;

import java.util.ArrayList;

public class BowlingTest
{
    @org.junit.Test
    public void TestJouerPartie_Strike()
    {
        ArrayList<Integer> jets = new ArrayList<Integer>(12);
        for (int i = 0; i < 12; i++)
            jets.add(10);
        IBowling bowling = new Bowling(jets);

        assert(jets.jouerPartie() == 0);
    }

    @org.junit.Test
    public void TestJouerPartie_NeufEtZero()
    {
        ArrayList<Integer> jets = new ArrayList<Integer>(20);
        for (int i = 0; i < 10; i++)
        {
            jets.add(9);
            jets.add(0);
        }
        IBowling bowling = new Bowling(jets);

        assert(jets.jouerPartie() == 90);
    }

    @org.junit.Test
    public void TestJouerPartie_CinqEtSpare()
    {
        ArrayList<Integer> jets = new ArrayList<Integer>(21);
        for (int i = 0; i < 10; i++)
        {
            jets.add(5);
            jets.add(10);
        }
        jets.add(5);
        IBowling bowling = new Bowling(jets);

        assert(jets.jouerPartie() == 150);
    }

    @org.junit.Test
    public void TestJouerPartieStrikes()
    {
        ArrayList<Integer> jets = new ArrayList<Integer>(12);
        for (int i = 0; i < 12; i++)
            jets.add(10);
        IBowling bowling = new Bowling(jets);

        assert(jets.jouerPartie() == 0);
    }

    @org.junit.Test
    public void TestSetJets()
    {
        ArrayList<Integer> jets = new ArrayList<Integer>(12);
        for (int i = 0; i < 10; i++)
            jets.add(0);
        IBowling bowling = new Bowling(jets);

        jets.set(1,1);
        bowling.setJeu(jeu);

        assert(bowling.getJets() == jets);
    }

    @org.junit.Test
    public void TestSetJets()
    {
        ArrayList<Integer> jets = new ArrayList<Integer>(12);
        for (int i = 0; i < 10; i++)
            jets.add(0);
        IBowling bowling = new Bowling(jets);

        assert(bowling.getJets() == jets);
    }

    @org.junit.Test
    public void TestVerifierJets()
    {
        ArrayList<Integer> jets = new ArrayList<Integer>(12);
        jets.add(-1);
        IBowling bowling = new Bowling(jets);

        assertFalse(bowling.verifierJets());

        jets.remove(0);
        for (int i = 0; i < 10; i++)
            jets.add(0);
        bowling.setJets(jets);

        assertTrue(bowling.verifierJets());
    }
}
