class InherStudent {
    private String name;
    private int marks;

    public void setData(String n, int m) { name = n; marks = m; }
    public void show() { System.out.println(name + " scored " + marks); }
}

public class StudentDemo {
    public static void main(String[] args) {
        InherStudent s = new InherStudent();
        s.setData("Harshita", 95);
        s.show();
    }
}
