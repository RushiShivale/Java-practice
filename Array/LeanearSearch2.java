public class LeanearSearch2 {

    public static int linearSearch(String menu[],String key){
        for (int i = 0;i<menu.length;i++){
            if (menu[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String menu[] = {"idli","dosa","sambar","samosa","vadapav","dhokla","bhel"};
        String key ="bhel";

        int index = linearSearch(menu, key);
        if (index == -1){
            System.out.println("Item Not Found.");
        }
        else{
            System.out.println("Item Found at "+ index);
        }
    }
}
