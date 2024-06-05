public class java_arrays {
    public static void main(String[] args) {
        int [] marks = {98,77,66,54,34} ;
       /* System.out.println(marks.length);

        String [] students = {"Balram","Ankit","Amit","Umesh","Thandup"};
        System.out.println(students.length);
        System.out.println(students[1]);*/
       /* for (int i =0;i<marks.length-1;i++){
            System.out.println(marks[i]);
        }
*/
       /* for (int element: marks){
            System.out.println(element);
        }*/
        for(int i = marks.length-1 ;i>=0;i--){
            System.out.println(marks[i]);
        }
     /*   marks[0] = 99;
        marks[1] = 77;
        marks[2] = 22;
        marks[3] = 23;
        marks[4] = 43;
        marks[5] = 55;
        marks[6] = 91;
        marks[7] = 77;
        marks[8] = 56;
        marks[9] = 76;
       // marks[10] = 76;*/
        System.out.println(marks[4]);

    }
}
