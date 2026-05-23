package project;

import project.BookFolder.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class BookLoan {

    BookList bookList = new BookList();

    //도서관 반납 일자
    public void LibraryLoan() {
        bookList.BookListCreate();
        Scanner scanner = new Scanner(System.in);
        int LoanBookCount; //대출할 책의 개수
        String[] LoanBookNames;  //대출할 책 이름 -> 데이터에 있는지 비교

        while (true) {

            System.out.println("대여하실 책의 권수를 입력해주세요.(최대:3개)");
            LoanBookCount = scanner.nextInt();
            scanner.nextLine(); // 남아있는 엔터 제거

            if (LoanBookCount > 0 && LoanBookCount < 4) {
                break;
            }

            System.out.println("4권이상 대여하실 수 없습니다.");
        }

        LoanBookNames = new String[LoanBookCount];
        System.out.println("책 이름을 입력해주세요.");

        //책 이름 입력
        for(int i=0; i < LoanBookCount; i++){
            while(true){
                LoanBookNames[i] = scanner.nextLine();
                //System.out.print("입력완료");

                if(findBookName(LoanBookNames[i])){
                    break;
                }

                System.out.println("책이 존재하지 않습니다. 다시 입력해주세요");

            }
        }

       //대출한 책 목록
        LoanedBookList(LoanBookNames,LoanBookCount);


    }

    //책 이름 있는지 확인하고 있으면 대출 실행
    boolean findBookName (String loanbookname){

        for( List<Book> booklist : bookList.books.values()){
            for(Book book : booklist){
                if(Objects.equals(book.BookGetName(), loanbookname)){
                    System.out.println(loanbookname+" 선택완료");
                    return true;
                }
            }
        }

        return false;
    }

    //대출한 책 알려주기
    void LoanedBookList(String[] loanbooks,int loanbookcount){

        System.out.println();
        System.out.println("--대출 책 목록--");
        for( List<Book> booklist : bookList.books.values()){
            for(Book book : booklist){
                for(int i=0; i<loanbookcount; i++){
                    if(book.BookGetName().equals(loanbooks[i])){
                        book.BookNamePrint();
                        System.out.print(" ");
                        book.BookFormPrint();
                        book.BookLoan(); // 대출 로직 실행
                    }
                }

            }
        }
        System.out.println("책 대출이 완료되었습니다.");
        System.out.println();
    }
}
