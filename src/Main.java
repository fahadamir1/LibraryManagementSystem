import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main_screen() {
        System.out.println("Welcome to the Library Management System");
        System.out.println("Choose Your Field");
        System.out.println("1.Student");
        System.out.println("2.Teacher");
        System.out.println("3.Staff");
        System.out.println("4.Exit");
    }

    public static void student_function() {
        System.out.println("Choose From the Following");
        System.out.println("1.View Book List");
        System.out.println("2.Issue Book");
        System.out.println("3.Return Book");
        System.out.println("4.Check Fine");
        System.out.println("5.See Issue Books");
        System.out.println("6.Exit");
    }

    public static void Teacher_fun() {
        System.out.println("Choose From the Following");
        System.out.println("1.View Book List");
        System.out.println("2.Issue Book");
        System.out.println("3.Return Book");
        System.out.println("4.Check Fine");
        System.out.println("5.See Issue Books");
        System.out.println("6.Exit");
    }

    public static void Staff_fun() {
        System.out.println("Choose From the Following");
        System.out.println("1.View Book List");
        System.out.println("2.Search Book from Book ID");
        System.out.println("3.See Issued Book");
        System.out.println("4.Issue Book");
        System.out.println("6.Enter New Book");
        System.out.println("7.Exit");
    }

    public static void main(String[] args) {
        //Classes
        Books[] B1 = new Books[100];
        Newspaper[] N1 = new Newspaper[100];
        //Newspaper Hardcode added
        N1[Newspaper.index] = new Newspaper("Jung", "23-01-23", "N100", "Active", "Daily News");
        N1[Newspaper.index] = new Newspaper("Jung", "23-01-23", "N200", "Active", "Daily News");
        N1[Newspaper.index] = new Newspaper("Jung", "23-01-23", "N300", "Active", "Daily News");
        N1[Newspaper.index] = new Newspaper("Jung", "23-01-23", "N400", "Active", "Daily News");
        //Books Hardcode Added
        B1[Books.index] = new Books("Here Helps", "M.R", 2002, "BL000", "Active", "Self Help");
        B1[Books.index] = new Books("Everything is good", "Mark Manson", 2002, "BL001", "Active", "Self Help");
        B1[Books.index] = new Books("Think and Grow Rich", "J.", 2002, "BL002", "Active", "Self Help");
        B1[Books.index] = new Books("Good Morning Pakistan", "Mark Ryan", 2002, "BL003", "Active", "Self Help");
        //New Library
        Library L = new Library(B1, N1);
        Books[] std_issud_books = new Books[3];
        Books[] Tea_issud_books = new Books[10];
        Books[] Staff_issud_books = new Books[5];
        int choice;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            main_screen();
            System.out.print("Choose between 1/4: ");
            choice = scanner.nextInt();
            if (choice == 1) {
                String name, id1;
                System.out.print("Enter you name: ");
                name = scanner.next();
                System.out.print("Enter your ID: ");
                id1 = scanner.next();
                Student S1 = new Student(name, 0, std_issud_books, id1);
                while (true) {
                    student_function();
                    System.out.print("choose Between 1/6: ");
                    int std_Choice;

                    std_Choice = scanner.nextInt();
                    if (std_Choice == 1) {
                        L.show_books();
                    }
                    if (std_Choice == 2) {
                        String ID;
                        if (S1.count_issue_books() <= 3) {
                            System.out.print("Enter the ID of the Books: ");
                            ID = scanner.next();
                            S1.set_issuebooks(L.Issue_books(ID));
                        } else {
                            System.out.println("Your Issue Limit is Reached");
                            System.out.print("Your Issued book is: ");
                            System.out.println(S1.count_issue_books());
                        }
                    }
                    if (std_Choice == 3) {
                        String id;
                        System.out.print("Enter the ID of the Books: ");
                        id = scanner.next();
                        S1.return_book(L.return_book(id));
                    }
                    if (std_Choice == 4) {
                        System.out.print("Your fine is: ");
                        System.out.println(S1.getFine());
                    }
                    if (std_Choice == 5) {
                        System.out.println("Your Issue books is");
                        S1.see_issue_books();
                    }
                    if (std_Choice == 6) {
                        break;
                    }
                }
            }
            if (choice == 2) {
                String name1, id2;
                System.out.print("Enter you name: ");
                name1 = scanner.next();
                System.out.print("Enter your ID: ");
                id2 = scanner.next();
                Teacher T1 = new Teacher(name1, 0, Tea_issud_books, id2);
                while (true) {
                    Teacher_fun();
                    int Te_choice;
                    System.out.print("choose Between 1/6: ");
                    Te_choice = scanner.nextInt();
                        if (Te_choice == 1) {
                            L.show_books();
                        }
                        if (Te_choice == 2) {
                            String ID;
                            if (T1.count_issue_books() <= 3) {
                                System.out.print("Enter the ID of the Books: ");
                                ID = scanner.next();
                                if (L.check_issuedBooks(ID)) {
                                    System.out.println("Choose Again!!");
                                    continue;
                                }
                                T1.set_issuebooks(L.Issue_books(ID));
                            } else {
                                System.out.println("Your Issue Limit is Reached");
                                System.out.print("Your Issued book is: ");
                                System.out.println(T1.count_issue_books());
                            }
                        }
                        if (Te_choice == 3) {
                            String id;
                            System.out.print("Enter the ID of the Books: ");
                            id = scanner.next();
                            T1.return_book(L.return_book(id));
                        }
                        if (Te_choice == 4) {
                            System.out.print("Your fine is: ");
                            System.out.println(T1.getFine());
                        }
                        if (Te_choice == 5) {
                            System.out.println("Your Issue books is");
                            T1.see_issue_books();
                        }
                        if (Te_choice == 6) {
                            break;
                        }
                }

            }
            if (choice == 3) {
                String name2, id3;
                System.out.print("Enter you name: ");
                name2 = scanner.next();
                System.out.print("Enter your ID: ");
                id3 = scanner.next();
                Staff St1 = new Staff(name2, 0, Tea_issud_books, id3);
                while(true){
                    Staff_fun();
                    int staf_choice;
                    staf_choice= scanner.nextInt();
                    if(staf_choice==1){
                        L.show_books();
                    }
                    if(staf_choice==2){
                        String ID1;
                        System.out.println("Enter the Book ID to Search");
                        ID1= scanner.next();
                        L.search_book(ID1);
                    }
                    if(staf_choice==3){
                        St1.see_issue_books();
                    }
                    if(staf_choice==4){
                        String Id3;
                        if (St1.count_issue_books() <= 3) {
                            System.out.print("Enter the ID of the Books: ");
                            Id3 = scanner.next();
                            if (L.check_issuedBooks(Id3)) {
                                System.out.println("Choose Again!!");
                                continue;
                            }
                            St1.set_issuebooks(L.Issue_books(Id3));
                        } else {
                            System.out.println("Your Issue Limit is Reached");
                            System.out.print("Your Issued book is: ");
                            System.out.println(St1.count_issue_books());
                        }
                    }
                    if(staf_choice==6){
                        String title,author,lc,category;
                        int year;
                        System.out.print("Enter the Title of the Book: ");
                        title= scanner.next();
                        System.out.print("Enter the Author of the Book: ");
                        author= scanner.next();
                        System.out.print("Enter the Library Code of the Book: ");
                        lc= scanner.next();
                        System.out.print("Enter the Category of the Book: ");
                        category= scanner.next();
                        System.out.print("Enter the Year of the Book: ");
                        year= scanner.nextInt();
                        Books C=new Books(title,author,year,lc,"Active",category);
                        L.list_of_books[Books.index-1]=C;

                    }
                    if(staf_choice==7){
                        break;
                    }
                }
            }
            if(choice==4){break;}
        }
    }
}
