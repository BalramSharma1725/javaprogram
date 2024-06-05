public class minimum_array {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int min = array[0];

        for (int i = 1; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        System.out.println("The minimum element in the array is: " + min);
    }
}
