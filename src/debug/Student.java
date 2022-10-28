package debug;

public class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void diHoc(int x){
        System.out.println("Hoc sinh đi học để lấy " + x + " điểm thi" );
    }

    public void choiGame(){
        System.out.println("Tối rồi, giải trí thôi");
    }
}
