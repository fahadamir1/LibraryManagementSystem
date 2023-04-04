public class Newspaper {
    private String Name;
    private String Publication_date;
    private String Library_code;

    private String Status;

    private String category;

    public static int index;



    public Newspaper(String name, String publication_date, String library_code, String status, String category) {
        Name = name;
        Publication_date = publication_date;
        Library_code = library_code;
        Status = status;
        this.category = category;
        index++;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPublication_date() {
        return Publication_date;
    }

    public void setPublication_date(String publication_date) {
        Publication_date = publication_date;
    }

    public String getLibrary_code() {
        return Library_code;
    }

    public void setLibrary_code(String library_code) {
        Library_code = library_code;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
    public void show1_Newspaper(Newspaper N){
        System.out.print("Name is: ");
        System.out.println(N.Name);
        System.out.print("Publication Date is: ");
        System.out.println(N.Publication_date);
        System.out.print("Status  is: ");
        System.out.println(N.Status);
        System.out.print("Category is: ");
        System.out.println(N.category);
        System.out.print("Library Code is:");
        System.out.println(N.Library_code);
        System.out.println("");
    }
}
