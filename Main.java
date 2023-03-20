public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        AssignmentMarks marks = new AssignmentMarks("Math", 80, 85, 90);
        marks.setMark(2, 90);
        System.out.println("New mark for assignment 2: " + marks.getAssignment2());
    }
}

public class AssignmentMarks {
    private String courseName;
    private int assignment1;
    private int assignment2;
    private int assignment3;

    public AssignmentMarks(String name, int mark1, int mark2, int mark3) {
        this.courseName = name;
        this.assignment1 = mark1;
        this.assignment2 = mark2;
        this.assignment3 = mark3;
    }

    public void setMark(int assignmentNumber, int mark) {
        if (mark < 0 || mark > 100) {
            throw new IllegalArgumentException("Invalid mark: " + mark);
        }
        switch (assignmentNumber) {
            case 1:
                this.assignment1 = mark;
                break;
            case 2:
                this.assignment2 = mark;
                break;
            case 3:
                this.assignment3 = mark;
                break;
            default:
                throw new IllegalArgumentException("Invalid assignment number: " + assignmentNumber);
        }
    }

    public int getAssignment2() {
        return assignment2;
    }
}
