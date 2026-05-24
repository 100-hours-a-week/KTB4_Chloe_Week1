package project;

import project.BookFolder.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Main {
    public static BookList bookList = new BookList();

     void main(){

        bookList.BookListCreate();
        Verify verify = new Verify();
        Library library = new Library();


        class BookLoanTask implements Runnable {

            Random random = new Random();

            @Override
            //20초 마다 대출 시도 하고 대출 성공하면 알림이 뜨는 동작
            public void run() {

                while(true){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    // 전체 책 담을 리스트
                    List<Book> allBooks = new ArrayList<>();
                    // map 안의 책 전부 추가
                    for(List<Book> books : bookList.books.values()){
                        allBooks.addAll(books);
                    }
                    // 랜덤 책 선택
                    Book randomBook = allBooks.get(random.nextInt(allBooks.size()));
                    randomBook.BookNamePrint();
                    randomBook.BookStatusPrint();
                    System.out.println("대출 시작");
                    randomBook.BookLoan();
                    System.out.println("======================");

                    try{
                        Thread.sleep(20000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        class BookReturnTask implements Runnable{
            @Override
            //25초 마다 반납하는 동작
            public void run() {

                    Random random = new Random();

                    while(true){

                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        // 전체 책 담을 리스트
                        List<Book> allBooks = new ArrayList<>();
                        // map 안의 책 전부 추가
                        for(List<Book> books : bookList.books.values()){

                            for(Book book : books){

                                if(book instanceof PaperBook){
                                    allBooks.add(book);
                                }
                            }
                        }
                        // 랜덤 책 선택
                        Book randomBook =  allBooks.get(random.nextInt(allBooks.size()));
                        randomBook.BookNamePrint();
                        randomBook.BookStatusPrint();
                        System.out.println("반납 시작");
                        randomBook.BookReturn();
                        System.out.println("======================");

                        try{
                            Thread.sleep(25000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();

                        }
                }

            }
        }

        Runnable BookLoanTask= new BookLoanTask();
        Thread loanthread = new Thread(BookLoanTask,"대출 사용자 ");
        Runnable BookReturnTask = new BookReturnTask();
        Thread returnthread = new Thread(BookReturnTask,"반납 사용자 " );

        verify.VerifyCode(); //인증코드

        loanthread.start(); //스레드 실행
        returnthread.start(); // 스레드 실행

        library.UserSelectWork(); //도서관 동작











    }
}
