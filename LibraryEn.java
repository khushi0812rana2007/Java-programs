public class LibraryEn {
    private String title;
    private String author;

    public void setBook(String t, String a) {
        title = t;
        author = a;
    }

    public void show() {
        System.out.println(title + " by " + author);
    }
}

class LibraryEnDemo {
    public static void main(String[] args) {
        LibraryEn b = new LibraryEn();
        b.setBook("Java Basics", "James Gosling");
        b.show();
    }
}
