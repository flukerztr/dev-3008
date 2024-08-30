public class Student {
    public String name;
    public String major;
    public int point;
    
    public Student(String name, String major, int point) {
        this.name = name;
        this.major = major;
        this.point = point;
        
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public void displayInfo() {
        System.out.println("Student name: " +name);
        System.out.println("Student major " +major);
        System.out.println("Student point " +point);
    }
}
