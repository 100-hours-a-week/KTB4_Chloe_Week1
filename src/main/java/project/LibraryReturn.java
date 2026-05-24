package project;
import project.BookFolder.Book;
import project.BookFolder.PaperBook;

import java.util.List;
import java.util.Scanner;

import static project.Main.bookList;

public class LibraryReturn {

    public void LibraryReturn(){

        Scanner scanner = new Scanner(System.in);
        String returBookName = ""; //반납할 책 이름

        System.out.println("반납할 책의 이름을 입력해주세요");
        System.out.println("책이름을 모두 입력하고, ok를 입력해주세요");

        boolean ReturnCheck = false;
        while(!returBookName.equals("ok")){

            returBookName = scanner.nextLine();

            for(List<Book> booklist : bookList.books.values()){
                for(Book book : booklist){
                    if(book.BookGetName().equals(returBookName)){
                        ReturnCheck = true;
                        if(book instanceof PaperBook){
                            book.BookReturn();
                        } else {
                            System.out.println("전자책은 반납 기능을 수행할 수 없습니다.");
                        }
                    }
                }

            }
            if(!ReturnCheck){
                System.out.println("반납에 실패하였습니다. 다시 입력해주세요.");
                ReturnCheck = false;
            }

        }


    }
}
