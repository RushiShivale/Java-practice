public class reverse {
    public static void main(String[] args) {
        int a = 10899;
        while (a>0){
            int lastD = a % 10 ;
            System.out.print(lastD);
            a = a/10 ;
        }
    }
}
