class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        int length = arr.length;
        int min_val = Integer.MAX_VALUE;
        int max_val = Integer.MIN_VALUE;

        for (int num : arr) {
            min_val = Math.min(min_val, num);
            max_val = Math.max(max_val, num);
        }

        double diff = (double) (max_val - min_val) / (length - 1);

        for (int i = 0; i < length; i++) {
            double expected = min_val + i * diff;
            boolean found = false;
            for (int num : arr) {
                if (Math.abs(num - expected) < 1e-9) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }

        return true;
    }
}