package sevenw.app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SevenWondersTest {
    SevenWonders élémentÀTesté;

    @BeforeEach
    void setUp() {
        élémentÀTesté = new SevenWonders();
    }

    /**
     * Méthode qui teste... que 15+5 donnera bien 20
     */
    @Test
    void addPoint() {
        int attendu = 20;
        int resultat = élémentÀTesté.addPoint(15,5);
        assertEquals(attendu, resultat, "en principe 15+5=20");
    }
}