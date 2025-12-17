package bva_desciisionTable.bva_desciisionTable;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MinCalculatorTestB {
    // יש 7 בדיקות
    @Test
    void EP_SMALLER_Than_1_Max_TestB() {
        // arrange
        int a = 50;
        int b = 0;   // min-1
        int c = 50;
        int d = 50;
        int e = 50;

        // act + assert
        assertThrows(IllegalArgumentException.class, () -> {
            MinCalculator.findMin(a, b, c, d, e);
        });
    }

    @Test
    void EP_1_TO_1000_Min_TestB() {
        // arrange
        int a = 50;
        int b = 1;   // min
        int c = 50;
        int d = 50;
        int e = 50;

        // act
        int result = MinCalculator.findMin(a, b, c, d, e);

        // assert
        assertEquals(1, result);
    }

    @Test
    void EP_1_TO_1000_MinPlus1_TestB() {
        // arrange
        int a = 50;
        int b = 2;   // min+1
        int c = 50;
        int d = 50;
        int e = 50;

        // act
        int result = MinCalculator.findMin(a, b, c, d, e);

        // assert
        assertEquals(2, result);
    }

    @Test
    void EP_1_TO_1000_Nominal_TestB() {
        // arrange
        int a = 50;
        int b = 50;  // nominal
        int c = 50;
        int d = 50;
        int e = 50;

        // act
        int result = MinCalculator.findMin(a, b, c, d, e);

        // assert
        assertEquals(50, result);
    }

    @Test
    void EP_1_TO_1000_MaxMinus1_TestB() {
        // arrange
        int a = 50;
        int b = 999; // max-1
        int c = 50;
        int d = 50;
        int e = 50;

        // act
        int result = MinCalculator.findMin(a, b, c, d, e);

        // assert
        assertEquals(50, result);
    }

    @Test
    void EP_1_TO_1000_Max_TestB() {
        // arrange
        int a = 50;
        int b = 1000; // max
        int c = 50;
        int d = 50;
        int e = 50;

        // act
        int result = MinCalculator.findMin(a, b, c, d, e);

        // assert
        assertEquals(50, result);
    }

    @Test
    void EP_GREATER_Than_1000_Min_TestB() {
        // arrange
        int a = 50;
        int b = 1001; // max+1
        int c = 50;
        int d = 50;
        int e = 50;

        // act + assert
        assertThrows(IllegalArgumentException.class, () -> {
            MinCalculator.findMin(a, b, c, d, e);
        });
    }
}
