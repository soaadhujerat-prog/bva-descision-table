package bva_desciisionTable.bva_desciisionTable;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MinCalculatorTestA {
	 // יש 7 בדיקות
	 @Test
	    void EP_SMALLER_Than_1_Max_TestA() {
	        // arrange
	        int a = 0;   // ערך לא חוקי
	        int b = 50;
	        int c = 50;
	        int d = 50;
	        int e = 50;

	        // act + assert
	        assertThrows(IllegalArgumentException.class, () -> {
	        	MinCalculator.findMin(a, b, c, d, e);
	        });
	    }

	 @Test
	    void EP_1_TO_1000_Min_TestA() {
	        // arrange
	        int a = 1;    // ערך גבול תקין
	        int b = 50;
	        int c = 50;
	        int d = 50;
	        int e = 50;

	        // act
	        int result = MinCalculator.findMin(a, b, c, d, e);

	        // assert
	        assertEquals(1, result);   // 1 הוא הערך המינימלי
	    }


	@Test
	void EP_1_TO_1000_MinPlus1_TestA() {
		// arrange
		int a = 2;   // min+1
		int b = 50;
		int c = 50;
		int d = 50;
		int e = 50;

		// act
		int result = MinCalculator.findMin(a, b, c, d, e);

		// assert
		assertEquals(2, result);
	}

	@Test
	void EP_1_TO_1000_Nominal_TestA() {
		// arrange
		int a = 50;  // nominal
		int b = 50;
		int c = 50;
		int d = 50;
		int e = 50;

		// act
		int result = MinCalculator.findMin(a, b, c, d, e);

		// assert
		assertEquals(50, result);
	}

	@Test
	void EP_1_TO_1000_MaxMinus1_TestA() {
		// arrange
		int a = 999; // max-1
		int b = 50;
		int c = 50;
		int d = 50;
		int e = 50;

		// act
		int result = MinCalculator.findMin(a, b, c, d, e);

		// assert
		assertEquals(50, result); // המינימום הוא 50
	}

	@Test
	void EP_1_TO_1000_Max_TestA() {
		// arrange
		int a = 1000; // max
		int b = 50;
		int c = 50;
		int d = 50;
		int e = 50;

		// act
		int result = MinCalculator.findMin(a, b, c, d, e);

		// assert
		assertEquals(50, result);
	}

	@Test
	void EP_GREATER_Than_1000_Min_TestA() {
		// arrange
		int a = 1001; // max+1 (לא חוקי)
		int b = 50;
		int c = 50;
		int d = 50;
		int e = 50;

		// act + assert
		assertThrows(IllegalArgumentException.class, () -> {
			MinCalculator.findMin(a, b, c, d, e);
		});
	}

}
