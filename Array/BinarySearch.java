public class BinarySearch {

    public static int  getelement(int number[], int key){
        int start = 0;
        int end = number.length - 1;
        
        while(start <= end){
            
            int mid = (start+end)/2;

            if (number[mid] == key) {
                return mid;
            }
            if (number[mid] > key){     // goes to left half
                end = mid-1;
            }
            if (number[mid] < key){     // goes to right half
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10,12,14,16,18,20};
        int key = 18;

        System.out.println("element found at  " + getelement(number, key));
    }
}
