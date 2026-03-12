import java.util.*;

public class simplearr {
    public static void main(String[] args) {
        int marks[] = new int[5];
        Scanner sc = new Scanner(System.in);
        marks[0]= sc.nextInt();
        marks[1]= sc.nextInt();

        // int marks[] = {12,34,56,75,22}; //opt 2
        
        marks[2]= 58;  // custom updation or insertion
        marks[1] = marks[1]+ 20; // update with performing operations
        System.out.print("your marks is ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i]+" ");
        }
        sc.close();
    }
}
