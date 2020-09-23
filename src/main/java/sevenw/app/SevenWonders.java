package sevenw.app;

public class SevenWonders {

    public SevenWonders() {

    }

    /**
     * lancement de la partie de 7Wonders
     */
    public void démarrerPartie() {
        System.out.println("**** 7 wonders ****");
        System.out.println("**** fin ****");
    }

    public int addPoint(int valeurInitiale, int ajout) {
        return valeurInitiale+ajout;
    }

    public final static void main(String [] args) {
        SevenWonders partie = new SevenWonders();
        partie.démarrerPartie();
    }
}