package com.rise.solution;

import java.util.Arrays;

public class IslandRiddle {
	
	 // Simulates the physical seesaw scale.
    // Returns 1 if left is heavier, -1 if right is heavier, 0 if balanced.
    private static int weigh(int[] island, int[] leftIdxs, int[] rightIdxs) {
        int leftSum = Arrays.stream(leftIdxs).map(idx -> island[idx]).sum();
        int rightSum = Arrays.stream(rightIdxs).map(idx -> island[idx]).sum();
        
        if (leftSum > rightSum) return 1;
        if (rightSum > leftSum) return -1;
        return 0;
    }

    public static String solve(int[] island) {
        // --- WEIGHING 1 ---
        // Group A (0,1,2,3) vs Group B (4,5,6,7)
        int w1 = weigh(island, new int[]{0, 1, 2, 3}, new int[]{4, 5, 6, 7});

        if (w1 == 0) {
            // SCENARIO A: Odd man is in [8,9,10,11]. [0-7] are proven normal.
            
            // --- WEIGHING 2 ---
            int w2 = weigh(island, new int[]{8, 9, 10}, new int[]{0, 1, 2});

            if (w2 == 0) {
                // 8, 9, 10 are normal. It must be index 11.
                // --- WEIGHING 3 ---
                int w3 = weigh(island, new int[]{11}, new int[]{0});
                return "Man 12 is the odd one and he is " + (w3 == 1 ? "heavier." : "lighter.");
            } 
            else if (w2 == 1) {
                // One of [8,9,10] is heavy.
                // --- WEIGHING 3 ---
                int w3 = weigh(island, new int[]{8}, new int[]{9});
                if (w3 == 1) return "Man 9 is the odd one and he is heavier.";
                if (w3 == -1) return "Man 10 is the odd one and he is heavier.";
                return "Man 11 is the odd one and he is heavier.";
            } 
            else {
                // One of [8,9,10] is light.
                // --- WEIGHING 3 ---
                int w3 = weigh(island, new int[]{8}, new int[]{9});
                if (w3 == 1) return "Man 10 is the odd one and he is lighter.";
                if (w3 == -1) return "Man 9 is the odd one and he is lighter.";
                return "Man 11 is the odd one and he is lighter.";
            }
        } 
        else if (w1 == 1) {
            // SCENARIO B: [0,1,2,3] is heavier than [4,5,6,7]. [8-11] are normal.
            
            // --- WEIGHING 2 ---
            // Mix: [0,1,4] vs [2,8,9] (8 and 9 are normal)
            int w2 = weigh(island, new int[]{0, 1, 4}, new int[]{2, 8, 9});

            if (w2 == 0) {
                // Odd man is in left-out group [3, 5, 6, 7]
                // --- WEIGHING 3 ---
                int w3 = weigh(island, new int[]{5}, new int[]{6});
                if (w3 == 1) return "Man 7 is the odd one and he is lighter.";
                if (w3 == -1) return "Man 6 is the odd one and he is lighter.";
                
                int w3Alt = weigh(island, new int[]{3}, new int[]{8});
                return w3Alt == 1 ? "Man 4 is the odd one and he is heavier." : "Man 8 is the odd one and he is lighter.";
            } 
            else if (w2 == 1) {
                // Seesaw didn't change tilt. Odd man is heavy in [0,1] or light in [5] (swapped).
                // --- WEIGHING 3 ---
                int w3 = weigh(island, new int[]{0}, new int[]{1});
                if (w3 == 1) return "Man 1 is the odd one and he is heavier.";
                if (w3 == -1) return "Man 2 is the odd one and he is heavier.";
                return "Man 5 is the odd one and he is lighter.";
            } 
            else {
                // Seesaw reversed tilt. Odd man is heavy in [2] or light in [4].
                // --- WEIGHING 3 ---
                int w3 = weigh(island, new int[]{2}, new int[]{8});
                return w3 == 1 ? "Man 3 is the odd one and he is heavier." : "Man 5 is the odd one and he is lighter.";
            }
        } 
        else {
            // SCENARIO C: [4,5,6,7] is heavier than [0,1,2,3]. Mirror of Scenario B.
            
            // --- WEIGHING 2 ---
            int w2 = weigh(island, new int[]{4, 5, 0}, new int[]{6, 8, 9});

            if (w2 == 0) {
                // --- WEIGHING 3 ---
                int w3 = weigh(island, new int[]{1}, new int[]{2});
                if (w3 == 1) return "Man 3 is the odd one and he is lighter.";
                if (w3 == -1) return "Man 2 is the odd one and he is lighter.";
                
                int w3Alt = weigh(island, new int[]{7}, new int[]{8});
                return w3Alt == 1 ? "Man 8 is the odd one and he is heavier." : "Man 4 is the odd one and he is lighter.";
            } 
            else if (w2 == 1) {
                // --- WEIGHING 3 ---
                int w3 = weigh(island, new int[]{4}, new int[]{5});
                if (w3 == 1) return "Man 5 is the odd one and he is heavier.";
                if (w3 == -1) return "Man 6 is the odd one and he is heavier.";
                return "Man 1 is the odd one and he is lighter.";
            } 
            else {
                // --- WEIGHING 3 ---
                int w3 = weigh(island, new int[]{6}, new int[]{8});
                return w3 == 1 ? "Man 7 is the odd one and he is heavier." : "Man 1 is the odd one and he is lighter.";
            }
        }
    }

}
