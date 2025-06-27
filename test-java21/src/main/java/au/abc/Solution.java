package au.abc;

import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
    	int smallestMissing = 1;
    	Arrays.sort(A);
    	for(int i=0; i<A.length; i++) {
    		if (smallestMissing == A[i]) {
    			smallestMissing++;
    		}
    	}
    	return smallestMissing;
    }
    
    public static void main(String[] arg) {
    	Solution a = new Solution();
    	int[] positiveIntegers = {1, 3, 6, 4, 1, 2};
    	int[] negativeIntegers = {-1,-3,1};
    	int retVal = a.solution(positiveIntegers);
	    System.out.println("missing element in the array of positive integers {1, 3, 6, 4, 1, 2}:" + retVal);
    	retVal = a.solution(negativeIntegers);
	    System.out.println("missing element in the array of negative integers {-1,-3}:" + retVal);
    }
}

