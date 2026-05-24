package project;
import project.BookFolder.Book;
import java.util.List;
import java.util.Scanner;

import static project.Main.bookList;

public class LibraryReturn {

    public void LibraryReturn(){

        Scanner scanner = new Scanner(System.in);
        String returBookName = ""; //반납할 책 이름

        System.out.println("반납할 책의 이름을 입력해주세요");
        System.out.println("책이름을 모두 입력하고, ok를 입력해주세요");



        while(!returBookName.equals("ok")){
            boolean ReturnCheck = false;

            returBookName = scanner.nextLine();

            for( List<Book> booklist : bookList.books.values()){
                for(Book book : booklist){
                    if(book.BookGetName().equals(returBookName)){
                       book.BookReturn();
                        ReturnCheck = true;
                    }

                }
            }
            if(!ReturnCheck){
                System.out.println("반납에 실패하였습니다. 다시 입력해주세요.");
            }
        }


    }
}
