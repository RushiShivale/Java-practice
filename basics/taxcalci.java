import java.util.*;

public class taxcalci {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("write your income: ");
        int income = sc.nextInt();

        if (income < 500000){
            System.out.println("no tax");
        }
        else if (income < 1000000){
            System.out.println("tax is "+ (income * 20/100));
        }
        else if (income > 1000000) {
            System.out.println("tax is "+ (income * 30/100));
        }
        sc.close();
    }
}
