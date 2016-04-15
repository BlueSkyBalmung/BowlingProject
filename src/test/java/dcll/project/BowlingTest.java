package dcll.project;

import java.util.ArrayList;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BowlingTest
{
    @org.junit.Test
    public void TestJouerPartie_Strike()
    {
        ArrayList<Integer> jets = new ArrayList<Integer>(12);
        for (int i = 0; i < 12; i++)
            jets.add(10);
        IBowling bowling = new Bowling(jets);
        assert(bowling.playGame() == 300);
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

        assert(bowling.playGame() == 90);
    }

    @org.junit.Test
    public void TestJouerPartie_NeufEtUn()
    {
        ArrayList<Integer> jets = new ArrayList<Integer>(20);

        jets.add(9);
        jets.add(1);
        IBowling bowling = new Bowling(jets);

        assert(bowling.playGame() == 10);
        jets.add(1);
        bowling.setJets(jets);
        assert(bowling.playGame() == 12);
    }

    @org.junit.Test
    public void TestJouerPartie_jetImpossible() {
        ArrayList<Integer> jets = new ArrayList<Integer>(20);
        jets.add(-1);
        IBowling bowling = new Bowling(jets);

        assert(bowling.playGame() == -1);
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

        assert(bowling.playGame() == 150);
    }

    @org.junit.Test
    public void TestJouerPartie_deuxStrike()
    {
        ArrayList<Integer> jets = new ArrayList<Integer>(21);

        jets.add(10);
        jets.add(10);

        IBowling bowling = new Bowling(jets);

        assert(bowling.playGame() == 30);
    }


    @org.junit.Test
    public void TestSetJets()
    {
        ArrayList<Integer> jets = new ArrayList<Integer>(12);
        for (int i = 0; i < 10; i++)
            jets.add(0);
        IBowling bowling = new Bowling(jets);

        jets.set(1,1);
        bowling.setJets(jets);

        assert(bowling.getJets() == jets);
    }

    @org.junit.Test
    public void TestConstructSetJets()
    {
        ArrayList<Integer> jets = new ArrayList<Integer>(12);
        for (int i = 0; i < 10; i++)
            jets.add(0);
        IBowling bowling = new Bowling(jets);

        assert(bowling.getJets() == jets);
    }

    @org.junit.Test
    public void TestConstructSetNull()
    {
        ArrayList<Integer> jets = new ArrayList<Integer>(12);
        IBowling bowling = new Bowling(jets);

        assertFalse(bowling.jetsPossible());
    }

    @org.junit.Test
    public void TestVerifierJets()
    {
        ArrayList<Integer> jets = new ArrayList<Integer>(12);
        jets.add(-1);
        jets.add(-1);
        IBowling bowling = new Bowling(jets);

        assertFalse(bowling.jetsPossible());

        jets.remove(0);
        for (int i = 0; i < 10; i++)
            jets.add(0);
        bowling.setJets(jets);

        assertTrue(bowling.jetsPossible());

        jets = new ArrayList<Integer>(12);
        for (int i = 0; i < 10; i++)
            jets.add(11);
        bowling.setJets(jets);

        assertFalse(bowling.jetsPossible());

    }
}
