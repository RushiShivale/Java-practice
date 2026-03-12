
public class maxSubArr {
    public static int findMaxSubArray(int number[]){
        int max_value = Integer.MIN_VALUE;

        for (int i = 0; i < number.length; i++){
            for (int j = i; j<number.length;j++){
                int curr = 0;
                for (int k = j; k<number.length; k++){
                    
                    curr += number[k];
                }
                if (max_value < curr){
                    max_value = curr;
                }
               
            }
        }
        return max_value;
    }

    public static void main (String args[]){
        int number[] = {12,13,34,65,23};

        System.out.println("the Max sub array addition is : "+findMaxSubArray(number));

    }
}