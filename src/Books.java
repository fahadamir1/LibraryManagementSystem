import java.time.Year;
import java.util.Scanner;
import java.util.ArrayList;
public class Books {
    private String Title;
    private String Author;
    private int year;
    private String library_code;
    private String Status;
private String Category;
static int index=0;

    public Books(String title, String author, int year, String library_code, String status, String category) {
        Title = title;
        Author = author;
        this.year = year;
        this.library_code = library_code;
        Status = status;
        Category = category;
        index++;
    }

    public void show1_Books(Books B){
        System.out.print("Title is: ");
        System.out.println(B.Title);
        System.out.print("Author is: ");
        System.out.println(B.Author);
        System.out.print("Year is: ");
        System.out.println(B.year);
        System.out.print("Library Code is: ");
        System.out.println(B.library_code);
        System.out.print("Category is:");
        System.out.println(B.Category);
        System.out.print("Status is: ");
        System.out.println(B.Status);
        System.out.println("");
    }
    public  Books(Books B){
        this.Title=B.Title;
        this.library_code=B.library_code;
        this.year=B.year;
        this.Author=B.Author;
        this.Status=B.Status;
        this.Category=B.Category;
    }


    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public String getLibrary_code() {
        return library_code;
    }

    public void setLibrary_code(String library_code) {
        this.library_code = library_code;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }


}
