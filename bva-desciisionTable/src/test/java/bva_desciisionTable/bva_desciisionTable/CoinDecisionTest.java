package bva_desciisionTable.bva_desciisionTable;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CoinDecisionTest {
    // יש 10 בדיקות
    @Test
    void R1_R2_R3_R4_Test() {
        CoinDecision cd = new CoinDecision();
        String result = cd.CoinDecision("H", "H", "H", "H");
        assertEquals("Positive", result);
    }

    @Test
    void R5_R6_Test() {
        CoinDecision cd = new CoinDecision();
        String result = cd.CoinDecision("H", "T", "H", "H");
        assertEquals("Positive", result);
    }

    @Test
    void R7_Test() {
        CoinDecision cd = new CoinDecision();
        String result = cd.CoinDecision("H", "T", "T", "H");
        assertEquals("Positive", result);
    }

    @Test
    void R8_Test() {
        CoinDecision cd = new CoinDecision();
        String result = cd.CoinDecision("H", "T", "T", "T");
        assertEquals("Negative", result);
    }

    @Test
    void R9_R10_Test() {
        CoinDecision cd = new CoinDecision();
        String result = cd.CoinDecision("T", "H", "H", "H");
        assertEquals("Positive", result);
    }

    @Test
    void R11_Test() {
        CoinDecision cd = new CoinDecision();
        String result = cd.CoinDecision("T", "H", "T", "H");
        assertEquals("Positive", result);
    }

    @Test
    void R12_Test() {
        CoinDecision cd = new CoinDecision();
        String result = cd.CoinDecision("T", "H", "T", "T");
        assertEquals("Negative", result);
    }

    @Test
    void R13_Test() {
        CoinDecision cd = new CoinDecision();
        String result = cd.CoinDecision("T", "T", "H", "H");
        assertEquals("Positive", result);
    }

    @Test
    void R14_Test() {
        CoinDecision cd = new CoinDecision();
        String result = cd.CoinDecision("T", "T", "H", "T");
        assertEquals("Negative", result);
    }

    @Test
    void R15_R16_Test() {
        CoinDecision cd = new CoinDecision();
        String result = cd.CoinDecision("T", "T", "T", "T");
        assertEquals("Negative", result);
    }

}
