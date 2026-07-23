 

class Solution {
    public int longestConsecutive(int[] nums) {

        // Edge case
        if (nums.length == 0) {
            return 0;
        }

        // Step 1: Store all numbers in HashSet
        HashSet<Integer> hash = new HashSet<>();

        for (int num : nums) {
            hash.add(num);
        }

        int maxLength = 0;

        // Step 2: Traverse the array
        for (int num : nums) {

            // Check if it is the start of a sequence
            if (!hash.contains(num - 1)) {

                int current = num;
                int currentLength = 1;

                // Count consecutive numbers
                while (hash.contains(current + 1)) {
                    current++;
                    currentLength++;
                }

                // Update maximum length
                maxLength = Math.max(maxLength, currentLength);
            }
        }

        return maxLength;
    }
}