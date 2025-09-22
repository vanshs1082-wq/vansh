public class Main {
    public static void main(String[] args){
        Book a=new Book("Title1","Author1");
        Book b=new Book("Title2","Author2");
        Library c=new Library();
        Library d=new Library();
        c.addBook(a);
        d.addBook(a);
        d.addBook(b);
        c.show();
        d.show();
    }
}