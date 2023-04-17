package Shopping;

public class Student {
    private long studentID;
    private static final double DISCOUNT = 0.05;

    public Student(String name, String address, String studentID) {
        super();
        this.studentID = Long.parseLong(studentID);
    }

    public long getStudentID() {
        return studentID;
    }

    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }

    public double getDiscount() {
        return DISCOUNT;
    }

    @Override
    public String toString() {
        return "Student{name='" +  "', address='" + getAddress() + "', studentID=" + studentID + "}";
    }

    private String getAddress() {
        return null;
    }


}
