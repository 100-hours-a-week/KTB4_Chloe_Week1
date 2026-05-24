package project.BookFolder;

public class Book {
    protected String BookName ;
    String BookForm;


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

    public void BookStatusPrint(){
        System.out.print("(" + BookForm + "책");
    }

    public boolean isLoanAvailable(){
        return true;
    }

    public void BookLoan(){
        System.out.println(this.BookName+ " 책이 대출되었습니다.");
    }

    public void BookReturn(){
        System.out.println(this.BookName + " 책이 반납되었습니다.");
    }






}


