package debug;

public class DebugOne {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Nguyễn Văn A");
        Student student2 = new Student(2, "Trần Văn B");

        int x = 500;
        student1.diHoc(x);
        student2.choiGame();
    }
}
