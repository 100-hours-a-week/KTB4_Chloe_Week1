package project.BookFolder;

public class EBook extends Book {
    static final String BookForm = "전자";
    String BookDownload ; //책 다운 링크


    public EBook(String BookName) {
        super(BookName,BookForm);
    }

    void BookAuthority(){
        // BookDownLoad 생성
        // 일정 시간이 지나면 isBookLoaned = false로 변경
        // 그리고 생성한 BookDownLoad 객체 버리기
    }
}
