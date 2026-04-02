class Uccms {
    String studentName;  
    int studentId;        
    float marks;          
    boolean passed;       

    public Uccms(String studentName, int studentId, float marks, boolean passed) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.marks = marks;
        this.passed = passed;
    }

    public void display() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentId);
        System.out.println("Marks: " + marks);
        System.out.println("Passed: " + passed);
        System.out.println("----------------------");
    }
}
    