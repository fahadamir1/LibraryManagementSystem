import java.util.Objects;

import static java.lang.System.exit;

public class Library {
public Books list_of_books [];

public  Newspaper List_of_Newspaper[];



    public Library(Books[] list_of_books, Newspaper[] list_of_Newspaper) {
        this.list_of_books = list_of_books;
        List_of_Newspaper = list_of_Newspaper;
    }

    public void show_books(){
        int i=0;
        while(list_of_books[i]!=null){
            Books B=list_of_books[i];
            B.show1_Books(B);
            i++;
        }
    }
    public void show_Newspaper(){
        int i=0;
        while(List_of_Newspaper[i]!=null){
            Newspaper N=List_of_Newspaper[i];
            N.show1_Newspaper(N);
            i++;
        }
    }

    public Books Issue_books(String LC){
       int i=0;
       while(list_of_books[i]!=null) {
           Books B = new Books(list_of_books[i]);

               String id = B.getLibrary_code();
           if (Objects.equals(LC, id)) {
                   System.out.println("Your Book is Issued");
                   B.setStatus("Issued");
                   System.out.println("--------------------");
                   System.out.println("This Book is issued");
                   list_of_books[i] = B;
                   B.show1_Books(B);
                   return B;
               }
               i++;

       }
            System.out.println("Id is not available!!");
            return null;
    }
    public boolean check_issuedBooks(String l){
        int i=0;
        boolean flag=false;
        while(list_of_books[i]!=null) {
            Books G = new Books(list_of_books[i]);
            String status=G.getStatus();
            if(status=="Issued"){
                System.out.println("The Book is already Issued");
                System.out.println("try another Book!!");
                flag=true;
            }
            i++;
        }
        return flag;
    }
    public Books return_book(String RID){
        int i=0;
        while(list_of_books[i]!=null){
            Books B=new Books(list_of_books[i]);
            String id=B.getLibrary_code();
            if(RID.equals(id)){
                System.out.println("Your Book is Returned");
                B.setStatus("Active");
                list_of_books[i]=B;
                System.out.println("--------------------");
                System.out.println("This Book is returned");
                B.show1_Books(B);
                return B;
            }
            i++;
        }
        System.out.println("Id is not available!!");
        return null;
    }
    public void add_book(int index,Books B){
        list_of_books[index]=B;
    }
    void search_book(String L){
        int i=0;
        boolean flag=false;
        while(list_of_books[i]!=null) {
            Books B=new Books(list_of_books[i]);
            String C=B.getLibrary_code();
            if(Objects.equals(L, C)){
                B.show1_Books(B);
                flag=true;
                break;
            }
            i++;
        }
        if(!flag){
            System.out.println("Wrong ID/Book Not Present");
        }
    }
}
