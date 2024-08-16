class Solution {
    public int maxScore(int[] cardPoints, int k) {
      int n = cardPoints.length;
        
        // Calculate the total points from the last k cards
        int totalPoints = 0;
        for (int i = n - k; i < n; i++) {
            totalPoints += cardPoints[i];
        }
        
        // If k equals the size of the array, return the total sum of the array
        if (k == n) {
            return totalPoints;
        }
        
        // Initialize the maximum score with the current total points
        int maxScore = totalPoints;
        
        // Start sliding the window to the left, adding from the front and subtracting from the back
        for (int i = 0; i < k; i++) {
            totalPoints += cardPoints[i] - cardPoints[n - k + i];
            maxScore = Math.max(maxScore, totalPoints);
        }
        
        return maxScore;
    }
}