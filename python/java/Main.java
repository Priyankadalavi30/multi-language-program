public class Main {
    public static void main(String[] args) {
        int[] nums = {10, 25, 5, 40, 15};

        int max = nums[0];
        int min = nums[0];
        int sum = 0;

        for (int n : nums) {
            if (n > max) max = n;
            if (n < min) min = n;
            sum += n;
        }

        System.out.println("Highest: " + max);
        System.out.println("Lowest: " + min);
        System.out.println("Average: " + (sum / nums.length));
    }
}
