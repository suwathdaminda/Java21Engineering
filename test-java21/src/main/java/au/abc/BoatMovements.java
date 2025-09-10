package au.abc;

import java.util.List;

public class BoatMovements {
	
	
    public static boolean canTravelTo(boolean[][] gameMatrix, int fromRow, int fromColumn, int toRow, int toColumn) {
       
    	if (fromRow > gameMatrix.length-1 || toRow > gameMatrix.length-1) {
    		return false;
    	}
    	return (gameMatrix[fromRow][fromColumn] && gameMatrix[toRow][toColumn]);
    }

    public static void main(String[] args) {
        boolean[][] gameMatrix = {
            {false, true,  true,  false, false, false},
            {true,  true,  true,  false, false, false},
            {true,  true,  true,  true,  true,  true},
            {false, true,  true,  false, true,  true},
            {false, true,  true,  true,  false, true},
            {false, false, false, false, false, false},
        };

        System.out.println(canTravelTo(gameMatrix, 3, 2, 2, 2)); // true, Valid move
        System.out.println(canTravelTo(gameMatrix, 3, 2, 3, 4)); // false, Can't travel through land
        System.out.println(canTravelTo(gameMatrix, 3, 2, 6, 2)); // false, Out of bounds
    }
    
    
    public <T> void printArray(T array) {
//        for (T item : array) {
//          System.out.println(item);
//        }
      }
    
}