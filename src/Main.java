import model.Student;

public class Main {
    public static void main(String[] args) {
        Student std = new Student("Thomas",22,"Male","s1234");
        System.out.println(std.getName());
        System.out.println(std.getAge());
        System.out.println(std.getGender());
        System.out.println(std.getId());
    }
}