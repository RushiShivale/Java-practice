public class linearsearch {

    public static int linearSearch(int number[],int key){
        for (int i=0;i<number.length;i++){
            if (number[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14,16,18};
        int key = 10;

        int index = linearSearch(numbers, key);

        if(index ==-1){
            System.out.println("index Not found.");
        }
        else{
            System.out.println("index found at "+ index);
        }
    }
}
