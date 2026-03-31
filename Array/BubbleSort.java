public class BubbleSort {

    public static void bubblesort(int arr[]){

        for (int i=0;i < arr.length-1;i++){ // start the turn until the sort
            for (int j = 0; j< arr.length-1-i;j++){ // for each turn, compare the adjacent elements
                if (arr[j] > arr[j+1]){ // swap if the element is smaller than the next one
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int Arr[] = {4,3,5,1,2,4,2,5,3,5,10,9,7,6,0};
        bubblesort(Arr);


        System.out.println("Sorted Array: ");
        for(int i = 0 ; i< Arr.length;i++){
            System.out.print(Arr[i]+ " ");
        }

    }
}
