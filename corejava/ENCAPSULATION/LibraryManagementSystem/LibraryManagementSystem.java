// LibraryManagementSystem.java
import java.util.*;

public class LibraryManagementSystem {
    public static void main(String[] args){
        List<LibraryItem> items = new ArrayList<>();
        items.add(new Book("B001","Effective Java","Joshua Bloch"));
        items.add(new Magazine("M001","Time","Editorial"));
        items.add(new DVD("D001","Inception","Nolan"));
        for(LibraryItem it: items){
            System.out.println(it.getItemDetails()+" - loan days: " + it.getLoanDuration());
        }
    }
}

abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;
    public LibraryItem(String itemId,String title,String author){
        this.itemId = itemId; this.title = title; this.author = author;
    }
    public String getItemId(){ return itemId; }
    public String getTitle(){ return title; }
    public String getAuthor(){ return author; }
    public String getItemDetails(){ return "["+itemId+"] "+title+" by "+author; }
    public abstract int getLoanDuration();
}

interface Reservable {
    boolean reserveItem(String userId);
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
    private boolean available = true;
    public Book(String id,String title,String author){ super(id,title,author); }
    @Override public int getLoanDuration(){ return 21; }
    @Override public boolean reserveItem(String userId){ if(available){ available=false; return true;} return false; }
    @Override public boolean checkAvailability(){ return available; }
}

class Magazine extends LibraryItem {
    public Magazine(String id,String title,String author){ super(id,title,author); }
    @Override public int getLoanDuration(){ return 7; }
}

class DVD extends LibraryItem {
    public DVD(String id,String title,String author){ super(id,title,author); }
    @Override public int getLoanDuration(){ return 3; }
}
