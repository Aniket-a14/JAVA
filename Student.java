public class Student {
    String name;
    int rollNumber;
    double marks;

    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public void updateMarks(double newMarks) {
        this.marks = newMarks;
    }

    public void increaseMarksByPercentage(double percentage) {
        this.marks += this.marks * (percentage / 100);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Roll Number: " + rollNumber + ", Marks: " + marks;
    }

    public static void main(String[] args) {
        Student student = new Student("John", 101, 85.0);


        student.updateMarks(90.5);
        System.out.println("Updated Details: " + student);

        student.increaseMarksByPercentage(10);
        System.out.println("Updated Details: " + student);
    }
}
