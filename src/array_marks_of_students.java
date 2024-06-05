public class array_marks_of_students {
    public static void main(String[] args) {
        int[] studentMarks = {25, 35, 45, 55, 65};
        int totalMarks = 0;

        for (int mark : studentMarks){
            totalMarks += mark;
        }
        System.out.println("Total marks in Physics:" + totalMarks);
    }
}
