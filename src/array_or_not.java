import java.sql.SQLOutput;
import java.util.Scanner;
public class array_or_not {
    public static void main(String[] args) {
        int[] array ={1, 2, 3, 4, 5};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer to check in the array: ");
        int num = scanner.nextInt();
        boolean found = false;

        for (int element : array){
            if (element == num){
                found = true;
                break;
            }
        }

        if (found){
            System.out.println("The integer is present in the array.");
        }else{
            System.out.println("The integer is not present in the array.");
        }
    }
}
