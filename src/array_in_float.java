public class array_in_float {
    public static void main(String[] args) {
        float[] floatArray = { 1.5f, 2.5f, 3.5f, 4.5f, 5.5f};
        float sum = 0;

        for (float num : floatArray){
            sum += num;
        }
        System.out.println("Sum of the floats in the array:" + sum);
    }
}
