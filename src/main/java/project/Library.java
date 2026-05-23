package project;

import project.BookFolder.*;

import java.util.Scanner;

public class Library {

    public static void UserSelectWork(){
        boolean UserSelectCheck = false;
        String Book_List = "1. 책 목록 보기";
        String Book_Loan = "2. 책 대출 하기";
        String End = "3. 종료";
        int UserSelectWork;

        BookLoan bookLoan = new BookLoan();
        BookListView bookListView = new BookListView();

        Scanner scanner = new Scanner(System.in);

        while(!UserSelectCheck ) {
            System.out.println("원하는 업무 번호를 선택하세요.");
            System.out.println(Book_List);
            System.out.println(Book_Loan);
            System.out.println(End);

            UserSelectWork = scanner.nextInt();
            scanner.nextLine(); // 남아있는 엔터 제거

            switch ( UserSelectWork ){
                case 1 :
                    bookListView.BookListViewCategory();
                    break;
                case 2 :
                    bookLoan.LibraryLoan();
                    break;
                case 3 :
                    System.out.print("도서관 시스템을 종료합니다.");
                    UserSelectCheck = true;
                    break;
                default:
                    System.out.println("다시 번호를 입력해주세요.");
                    break;
            }

        }









    }
}
