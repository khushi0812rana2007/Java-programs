class Student {
    String name;
    int age;
    void print() {
    System.out.println("Name: " + name + ", Age: " + age);
    }
}
class Q27 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Khushi";
        s1.age = 18;
        Student s2 = new Student();
        s2.name = "Riya";
        s2.age = 19;
        s1.print();
        s2.print();
    }
    }
