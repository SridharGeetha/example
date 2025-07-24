import java.util.*;

public class Library {
   
    private List<Book> books = new ArrayList<>();
    
    public List<Book> getBooks() {
        return books;
    }
    public void setBooks(Book book) {
        books.add(book);
    }
    public void addBook(Book book) {
        books.add(book);
    }

}
class Book{
    private String title;
    private String author;
    private int ISBN;
    List<Page> pages = new ArrayList<>();

    public Book(){
        
    }
    public Book(String title, String author, int iSBN) {
        this.title = title;
        this.author = author;
        ISBN = iSBN;
    }
    public void createPage(int pageNo,String content){
        Page page = new Page(pageNo, content);
        pages.add(page);
    }
     public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getISBN() {
        return ISBN;
    }
    public void setISBN(int iSBN) {
        ISBN = iSBN;
    }
}
class Page{
    private int pageNo;
    private String content;

    public Page(){

    }

    public Page(int pageNo,String content){
        this.pageNo = pageNo;
        this.content = content;
    }
    public int getPageNo() {
        return pageNo;
    }
    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
}
class Main{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Library lib = new Library();
        boolean flag = true;
        while (flag) {
            System.out.println("Library Management System");
            System.out.println("-------------------------");
            System.out.println("1.Create Book");
            System.out.println("2.Print Book");
            System.out.println("3.List Pages");
            System.out.println("-------------------------");
            System.out.println("Enter the Option");
            int op = read.nextInt();
            switch (op) {
                case 1:
                    read.nextLine();
                    System.out.println("Enter Book Title");
                    String title = read.nextLine();
                    System.out.println("Enter Book Author");
                    String author = read.nextLine();
                    System.out.println("Enter Book ISBN");
                    int isbn = read.nextInt();
                    Book b = new Book(title,author,isbn);
                    System.out.println("-------------------------");
                    while (true) {
                    System.out.println("1.Create Page");
                    System.out.println("Enter Page Number");
                    int pn = read.nextInt();
                    
                    read.nextLine();
                    System.out.println("Enter Content");
                    String con = read.nextLine();
                    b.createPage(pn, con);
                    System.out.println("Do you want to continue ?(yes/no)");
                    if(read.nextLine().equalsIgnoreCase("no")) 
                    break;
                    }
                    lib.addBook(b);     
                    System.out.println("-------------------------");
                    System.out.println("Book Added Successfully");
                    System.out.println("-------------------------");
                    System.out.println("Do you want to continue ?(yes/no)");
                     if(read.nextLine().equalsIgnoreCase("no")) 
                        flag = false;
                    
                    break;
                case 2:
                    if (lib.getBooks().isEmpty()) {
                    System.out.println("No books in the library.");
                    } 
                    else {
                        for(Book book : lib.getBooks()){
                        System.out.println("Title: " + book.getTitle());
                        System.out.println("Author: " + book.getAuthor());
                        System.out.println("ISBN: " + book.getISBN());
                    }
                    }
                    System.out.println("Do you want to continue ?(yes/no)");
                    
                    if(read.nextLine().equalsIgnoreCase("no")){
                        flag = false;
                    }
                    break;
                case 3:
                    
                    for(Book book : lib.getBooks()){
                        System.out.println(" Book Name : " + book.getTitle());
                        System.out.println("Book Page :");
                        for(Page page : book.pages){
                            System.out.println("page : "+page.getPageNo());
                            System.out.println("Content : "+page.getContent());
                        }
                    }
                    System.out.println("Do you want to continue ?(yes/no)");
                    if(read.nextLine().equalsIgnoreCase("no")){
                        flag = false;
                    }
                    break;
                default:
                    System.out.println("Invalid Option");
                    break;
            }
           
        }
        read.close();
        
    }
}
