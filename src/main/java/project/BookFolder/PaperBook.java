package project.BookFolder;

public class PaperBook extends Book {
    static final String BookForm = "종이";

    String BookLocation; // 도서관에서 책 위치
    int TotalBooks; // 책 개수

    public PaperBook(String BookName,int totalBooks, String bookLocation){
        super(BookName,BookForm);
        this.TotalBooks = totalBooks;
        this.BookLocation = bookLocation;
    }

    void BookDecrease(){
        //책 권수 감소
    }

    void BookIncrease(){
        //책 권수 증가
    }

    @Override
    public void BookLoan() {
        this.BookDecrease();
        super.BookLoan();
    }


    void returnBook(String bookName){
        //책 이름 확인하고
        // 해당 객체에 있는 isBookLoaned = false 로 뱐경
        System.out.println("반납이 완료 되었습니다. ");
    }


}
