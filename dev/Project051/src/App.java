public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello World");
        Student student = new Student("โอม", "โปรเพลเยอร์จากกัมพูชา", 1);
        student.displayInfo();
        student.setName("John Rambo");
        student.displayInfo();
        student.setPoint(89);
        student.displayInfo();
    }
}