public class sortingArray {


    public  static int[] sortArray(int[] nums) {


        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[i]) {

                   int temp=nums[i];

                    nums[i] = nums[j];
                    nums[j] = temp;

                }
            }
        }


        return nums;


    }

    public static void main(String[] args) {
   int[] nums={1,3,2,4,8,5};


       System.out.println(sortArray(nums));



    }
}