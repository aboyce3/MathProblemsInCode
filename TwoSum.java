public class TwoSum {

    public static void main(String[] args){
            int[] arr = new int[]{1,6,3,8,2,4};
            int[] answer = twoSum(arr, 9);
            System.out.println("[" + answer[0] + ", " + answer[1] + "]");
        }

        public static int[] twoSum(int[] nums, int target) {
            for(int i = 0; i < nums.length; i++)
                for(int j = i+1; j < nums.length; j++)
                    if((nums[i] + nums[j]) == target)
                        return new int[]{i,j};
            return null;
        }
    }

