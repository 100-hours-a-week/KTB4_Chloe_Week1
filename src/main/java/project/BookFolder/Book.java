package project.BookFolder;

public class Book {
    String BookName ;

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

    BookCategory bookCategory;




    boolean isBookLoaned = false; // 책 대출 유무

    int ReturnPeriod = 7; // 책 반납 기한

    public Book(String BookName) {
        this.BookName = BookName;
    }

    public void BookList(){
        System.out.println(BookName);
    }



}


