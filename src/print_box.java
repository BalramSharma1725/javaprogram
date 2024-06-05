public class print_box {
    public static void main(String[] args) {
        char rows = 5;

        for (char i = 1; i <= rows; i++) {
            for (char j = 1; j <= i; j++) {
                System.out.print(j + "");
            }
            System.out.println();
        }
    }
}
