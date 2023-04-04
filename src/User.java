import java.util.Objects;
import java.util.Scanner;

public class User {


    private String user_name;

    private int fine;

    private Books issued_book[];

    public static int index=0;

    public User(String user_name, int fine, Books[] issued_book) {
        this.user_name = user_name;
        this.fine = fine;
        this.issued_book = issued_book;
    }

    void set_issuebooks(Books B){
        Books C=new Books(B);
        issued_book[index]=C;
        index++;
    }
    public int count_issue_books(){
        int i=0;
        int count=0;
        while(issued_book[i]!=null){
            count++;
            if(count==3){
                return count;
            }
            i++;
        }
        return count;
    }
    void return_book(Books B){
        int i=0;
        while(issued_book[i]!=null){
            Books C=new Books(issued_book[i]);
            String A=C.getLibrary_code();
            String X=B.getLibrary_code();
            if(A.equals(X)){
                index--;
                System.out.println("User Issue list is updated");
            }
            i++;
        }
    }

    void see_issue_books(){
        int i=0;
        boolean flag=true;
        while(i<index){
            Books B=new Books(issued_book[i]);
            B.show1_Books(B);
            i++;
            flag=false;
        }
        if(flag) {
            System.out.println("Empty!!");
        }
    }


    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }




}
