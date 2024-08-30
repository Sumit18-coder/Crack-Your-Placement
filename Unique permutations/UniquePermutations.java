import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniquePermutations {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);  // Sort the array to handle duplicates
        backtrack(result, new ArrayList<>(), nums, new boolean[nums.length]);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums, boolean[] used) {
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));  // Add a copy of tempList to the result
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (used[i]) continue;  // Skip used elements
                if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue;  // Skip duplicates
                
                used[i] = true;
                tempList.add(nums[i]);
                backtrack(result, tempList, nums, used);
                used[i] = false;
                tempList.remove(tempList.size() - 1);  // Remove the last element for backtracking
            }
        }
    }

    public static void main(String[] args) {
        UniquePermutations permutations = new UniquePermutations();
        int[] nums = {1, 2, 1};
        List<List<Integer>> result = permutations.permuteUnique(nums);
        System.out.println("Unique permutations are: ");
        for (List<Integer> perm : result) {
            System.out.println(perm);
        }
    }
}