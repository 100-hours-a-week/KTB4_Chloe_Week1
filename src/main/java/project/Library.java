package project;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Library {

    public void UserSelectWork() {
        boolean UserSelectCheck = false;
        String Book_List = "1. 책 목록";
        String Book_Loan = "2. 대출 ";
        String Book_Return = "3. 반납";
        String End = "4. 종료";
        int UserSelectWork;

        LibrayLoan librayLoan = new LibrayLoan();
        LibraryReturn libraryReturn = new LibraryReturn();
        BookListView bookListView = new BookListView();
        Scanner scanner = new Scanner(System.in);

        while (!UserSelectCheck) {
            System.out.println("==========================");
            System.out.println("원하는 업무 번호를 선택하세요.");
            System.out.println(Book_List);
            System.out.println(Book_Loan);
            System.out.println(Book_Return);
            System.out.println(End);
            System.out.println("==========================");

            try {
                UserSelectWork = scanner.nextInt();
                scanner.nextLine();

                switch (UserSelectWork) {
                    case 1:
                        bookListView.BookListViewCategory();
                        break;
                    case 2:
                        librayLoan.LibraryLoan();
                        break;
                    case 3:
                        libraryReturn.LibraryReturn();
                        break;
                    case 4:
                        System.out.print("도서관 시스템을 종료합니다.");
                        UserSelectCheck = true;
                        break;
                    default:
                        throw new IllegalArgumentException("번호를 다시 입력해주세요.");
                }

            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력해주세요.");
                scanner.nextLine();
                //이전에 입력했던 것을 없애야 함!!!

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }


        }
    }


    }

