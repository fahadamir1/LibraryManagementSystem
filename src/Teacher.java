public class Teacher extends User{
    private String emp_id;
    private User NO_of_Teachers[];
    public String getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(String emp_id) {
        this.emp_id = emp_id;
    }


    public Teacher(String user_name, int fine, Books[] issued_book, String emp_id) {
        super(user_name, fine, issued_book);
        this.emp_id = emp_id;
    }
}
