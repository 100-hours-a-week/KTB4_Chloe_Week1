package project.BookFolder;

import java.util.concurrent.atomic.AtomicInteger;

public class PaperBook extends Book {
    static final String BookForm = "종이";

    String BookLocation; // 도서관에서 책 위치
    AtomicInteger TotalBooks; // 책 개수

    public PaperBook(String BookName,int totalBooks, String bookLocation){
        super(BookName,BookForm);
        this.TotalBooks = new AtomicInteger(totalBooks);
        this.BookLocation = bookLocation;
    }

    void BookDecrease(){
        //책 권수 감소
        this.TotalBooks.decrementAndGet();

    }

    void BookCoutPrint(){
        System.out.print(" 잔여책:" + this.TotalBooks);
    }

    @Override
    public void BookStatusPrint(){

        super.BookStatusPrint();

        System.out.print("/");

        this.BookCoutPrint();

        System.out.println( ")");
    }

    void BookIncrease(){
        //책 권수 증가
        this.TotalBooks.incrementAndGet();
    }
    @Override
    public boolean isLoanAvailable() {
        if (TotalBooks.get()>0) {
            return true;
        }
        else{
            System.out.println("대출 가능한 도서가 없습니다.");
            return false;
        }

    }

    @Override
       synchronized public void BookLoan(){
        System.out.println(Thread.currentThread().getName() + " 대출 시도");

        if(isLoanAvailable()){
            this.BookDecrease();
            super.BookLoan();

            System.out.print(this.BookName + "의 ");
            BookCoutPrint();
            System.out.println();

        }
        else{
            System.out.println(this.BookName +"잔역 도서가 없습니다.");
            System.out.println("대출에 실패했습니다.");
        }


    }


@Override
synchronized public void BookReturn(){
        this.BookIncrease();
        super.BookReturn();
        System.out.print(this.BookName + "의 ");
        BookCoutPrint();
        System.out.println();
    }


}
