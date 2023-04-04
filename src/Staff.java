public class Staff extends User{
    private String Staff_Id;

    private User NO_of_Staff[];


    public Staff(String user_name, int fine, Books[] issued_book, String staff_Id) {
        super(user_name, fine, issued_book);
        Staff_Id = staff_Id;
    }
    public void Remove_fine(String Id,Student[] S){
        int i=0;
        while(S[i].getStudent_id().equals(Id)){
            System.out.println("Your fine is: ");
            System.out.print(S[i].getFine());
            System.out.println("Your fine is Renew");
            System.out.println("Your update fine is: ");
            S[i].setFine(0);
            System.out.print(S[i].getFine());
        }

    }
    public void Remove_fine(String Id,Teacher[] S){
        int i=0;
        while(S[i].getEmp_id().equals(Id)){
            System.out.println("Your fine is: ");
            System.out.print(S[i].getFine());
            System.out.println("Your fine is Renew");
            System.out.println("Your update fine is: ");
            S[i].setFine(0);
            System.out.print(S[i].getFine());
        }

    }
    public void Remove_fine(String Id,Staff[] S){
        int i=0;
        while(S[i].getStaff_Id().equals(Id)){
            System.out.println("Your fine is: ");
            System.out.print(S[i].getFine());
            System.out.println("Your fine is Renew");
            System.out.println("Your update fine is: ");
            S[i].setFine(0);
            System.out.print(S[i].getFine());
        }

    }

    public String getStaff_Id() {
        return Staff_Id;
    }

    public void setStaff_Id(String staff_Id) {
        Staff_Id = staff_Id;
    }

    public User[] getNO_of_Staff() {
        return NO_of_Staff;
    }

    public void setNO_of_Staff(User[] NO_of_Staff) {
        this.NO_of_Staff = NO_of_Staff;
    }
}
