import java.util.ArrayList;
public class Library {
    ArrayList<Book> a=new ArrayList<Book>();
    public void addBook(Book x){
        a.add(x);
    }
    public void show(){
        for(Book x:a) System.out.println(x);
    }
}