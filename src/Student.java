public class Student extends User
{
    private String student_id;
    private User NO_of_students[];



    public Student(String user_name, int fine, Books[] issued_book, String student_id) {
        super(user_name, fine, issued_book);
        this.student_id = student_id;
    }

    public void set_student(Student S){
        this.setUser_name(S.getUser_name());
        this.setFine(S.getFine());
        this.setStudent_id(S.getStudent_id());
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public User[] getNO_of_students() {
        return NO_of_students;
    }

    public void setNO_of_students(User[] NO_of_students) {
        this.NO_of_students = NO_of_students;
    }
}
