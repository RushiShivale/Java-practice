public class kedanesMaxSumArr {

    public static void kedane(int nums[]){
        int maxsum = Integer.MIN_VALUE;
        int curr = 0;

        for (int i=0; i<nums.length;i++){
            curr = curr +nums[i];
            if (curr<0){
                curr = 0;
            }
            maxsum = Math.max(maxsum, curr);
        }
        System.out.println(maxsum);
    }

    public static void main (String args[]){
        int num[] = {-1,3,5,4,-7,2,-5};
        kedane(num);

    }
}