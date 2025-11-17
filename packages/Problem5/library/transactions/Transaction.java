package library.transactions;

import library.books.Book;
import library.members.Member;

public class Transaction {
    private Book book;
    private Member member;
    private String type;
    public Transaction(Book book,Member member,String type){this.book=book;this.member=member;this.type=type;}
    public void process(){
        if(type.equals("ISSUE")){
            if(!book.isIssued()){
                book.setIssued(true);
                System.out.println("Issued '"+book.getTitle()+"' to "+member.getName());
            } else {
                System.out.println("Book already issued");
            }
        } else if(type.equals("RETURN")){
            if(book.isIssued()){
                book.setIssued(false);
                System.out.println(member.getName()+" returned '"+book.getTitle()+"'");
            } else {
                System.out.println("Book was not issued");
            }
        }
    }
}
