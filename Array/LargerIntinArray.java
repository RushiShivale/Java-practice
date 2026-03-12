public class LargerIntinArray {
    public static int getlargest(int number[]){
        int largest = 0;
        for (int i = 0; i < number.length ;i++){
            if (largest < number[i]){
                largest = number[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int number[]= {23,3,53,55,67,34,23,65,76,23,67,87,45,34,76};

        int largenum = getlargest(number);
        System.out.println("largest integer in the array is "+ largenum);
    }
}
