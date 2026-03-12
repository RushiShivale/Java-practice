public class sumofelement {
    public static int sum(int number[]){
        int add = 0;
        for(int i=0 ;i<number.length;i++){
            add += number[i];
        }
        return add;
    }
    public static void main(String[] args) {
        int number [] = {2,3,4,5,6,7,8};

        int op=sum(number);
        System.out.println(op);
    }
}
