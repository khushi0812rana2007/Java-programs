public class StudentInfo { 
    public static void main(String[] args) {

        String[] name = {"Khushi", "Riya", "priya", "Suman", "Pragya"};
        int[] age = {18, 19, 20, 18, 21};

        System.out.println("--- Student Details ---");

        for(int i = 0; i < 5; i++) {
            System.out.println("Name: " + name[i]);
            System.out.println("Age: " + age[i]);
            System.out.println();
        }
    }
}
