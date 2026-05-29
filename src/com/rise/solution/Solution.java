package com.rise.solution;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // Test case: 12 men. Man 7 (index 6) is lighter (95 instead of 100).
        int[] testIsland = {100, 100, 100, 100, 100, 100, 195, 100, 100, 100, 100, 100};
        
        IslandRiddle ir = new IslandRiddle();
        
        System.out.println(ir.solve(testIsland));

	}

}
