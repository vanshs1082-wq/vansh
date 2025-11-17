import library.books.Book;
import library.members.Member;
import library.transactions.Transaction;

public class MainLibrary {
    public static void main(String[] args){
        Book b=new Book("978-0134685991","Effective Java");
        Member m=new Member("M001","Sahil");
        System.out.println("Adding book: "+b.getTitle());
        System.out.println("Registering member: "+m.getName());
        Transaction t=new Transaction(b,m,"ISSUE");
        t.process();
    }
}
