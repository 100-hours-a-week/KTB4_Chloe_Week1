package project.BookFolder;


public class PaperBook extends Book {
    static String BookForm = "종이";
    PaperBook(String BookName){
        super(BookName);
    }

    void BookFormOutput(){
        System.out.print("종이책");
    }

}
