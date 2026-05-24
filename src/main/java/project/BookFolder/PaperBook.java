package project.BookFolder;

import java.util.concurrent.atomic.AtomicInteger;

public class PaperBook extends Book {

    static final String BookForm = "종이";

    String BookLocation; // 도서관에서 책 위치
    AtomicInteger TotalBooks; // 책 개수


    public PaperBook(String BookName, int totalBooks, String bookLocation) {
        super(BookName, BookForm);
        this.TotalBooks = new AtomicInteger(totalBooks);
        this.BookLocation = bookLocation;
    }


    void BookDecrease() {
        // 책 권수 감소
        this.TotalBooks.decrementAndGet();
    }

    void BookIncrease() {
        // 책 권수 증가
        this.TotalBooks.incrementAndGet();
    }

    void BookCountPrint() {
        System.out.print(" 잔여책:" + this.TotalBooks);
    }


    @Override
    public void BookStatusPrint() {

        super.BookStatusPrint();
        System.out.print("/");
        this.BookCountPrint();
        System.out.println(")");
    }

    // 책 위치 출력
    void BookLocationPrint() {
        System.out.println("책의 위치는 " + this.BookLocation + "입니다.");
    }


    @Override
    public boolean isLoanAvailable() {

        if (TotalBooks.get() > 0) {
            return true;
        }
        else {
            System.out.println("대출 가능한 도서가 없습니다.");
            return false;
        }
    }


    @Override
    synchronized public void BookLoan() {

        //스레드가 들어왔는지 알 수 있도록
        System.out.println(Thread.currentThread().getName() + " 대출 시도");

        if (isLoanAvailable()) {
            this.BookDecrease();
            super.BookLoan();

            BookLocationPrint();
            System.out.print(this.BookName + "의 ");
            BookCountPrint();
            System.out.println();
        }
        else {
            System.out.println(this.BookName + "잔역 도서가 없습니다.");
            System.out.println("대출에 실패했습니다.");
        }
    }


    @Override
    synchronized public void BookReturn() {

        System.out.println(Thread.currentThread().getName() + " 반납 시도");

        this.BookIncrease();
        super.BookReturn();

        System.out.print(this.BookName + "의 ");
        BookCountPrint();
        System.out.println();
    }
}