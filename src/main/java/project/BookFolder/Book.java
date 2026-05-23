package project.BookFolder;

public class Book {
    String BookName ;
    String BookForm;

    boolean isBookLoaned = false; // 책 대출 유무
    int ReturnPeriod = 7; // 책 반납 기한

    public enum BookCategory {
        Literature("문학"),
        Economy("경제"),
        Science("과학"),
        Workbook("문제집"),
        Cartoon("만화");

        private final String korean;

        BookCategory(String korean)
        {
            this.korean = korean;
        }

        public String getKorean() {
            return korean;
        }
    }

    public String BookGetName(){
        return this.BookName;
    }


    public Book(String BookName, String bookform) {
        this.BookName = BookName;
        this.BookForm = bookform;
    }

    public void BookNamePrint(){
        System.out.print(BookName);

    }
    public void BookFormPrint(){
        System.out.println("(" + BookForm + "책)");
    }

    public void BookLoan(){
        //System.out.print("책 대출이 완료되었습니다.");
    }



}


