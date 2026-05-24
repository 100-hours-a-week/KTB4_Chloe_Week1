package project.BookFolder;

public class EBook extends Book {
    static final String BookForm = "전자";
    String BookDownload = "책 다운링크" ; //책 다운 링크
    boolean isDownload = false;


    public EBook(String BookName) {
        super(BookName,BookForm);
    }

    @Override
    public boolean isLoanAvailable(){
        return true;
    }

    @Override
    public void BookLoan() {
        System.out.println(Thread.currentThread().getName() + " 대출 시도");

        this.BookAuthority();
        super.BookLoan();



    }

    @Override
    public void BookReturn(){
         super.BookReturn();
    }

    @Override
    public void BookStatusPrint(){
        super.BookStatusPrint();
        System.out.println(")");
    }

    void BookAuthority(){
        boolean isDownload = true;
        // 일정 시간이 지나면 isBookLoaned = false로 변경
        // 그리고 생성한 BookDownLoad 객체 버리기
    }

}
