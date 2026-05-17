package project;

import project.BookFolder.*;

import java.util.Scanner;

public class Library {

    static String LibraryCode = "1234";

    public static void VerifyCode(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("도서관 인증 코드를 입력해주세요");
        String verification_code = scanner.nextLine();

        if(verification_code.equals(LibraryCode)){
            System.out.println("도서관 코드가 인증되었습니다.");
        }
        else{
            System.out.println("도서관 코드가 아닙니다. 다시 시도하세요");
            VerifyCode();
        }
    }

    public static void BookListView(){
        LiteratureBook[] literatureBooks = new LiteratureBook[2];
        literatureBooks[0] = new LiteratureBook("젊은 베르테르의 슬픔");
        literatureBooks[1] = new LiteratureBook("문학책2");


        EconomyBook[] economyBooks = new EconomyBook[3];
        economyBooks[0] = new EconomyBook("경제랑 놀자");
        economyBooks[1] = new EconomyBook("경제책2");
        economyBooks[2] = new EconomyBook("경제책3");

        ScienceBook[] scienceBooks = new ScienceBook[2];
        scienceBooks[0] = new ScienceBook("과학책1");
        scienceBooks[1] = new ScienceBook("과학책2");

        WorkBook[] workBooks = new WorkBook[1];
        workBooks[0] = new WorkBook("문제집1");

        CartoonBook[] cartoonBooks = new CartoonBook[2];
        cartoonBooks[0] = new CartoonBook("만화책1");
        cartoonBooks[1] = new CartoonBook("만화책2");

        Scanner scanner = new Scanner(System.in);
        String PaperBook = "1.종이책";
        String EBook = "2.전자책";

        System.out.println(PaperBook);
        System.out.println(EBook);
        System.out.println("번호를 선택해주세요.");
        int UserSelectNumber = scanner.nextInt();

        if(UserSelectNumber == 1){
            System.out.println("종이책 목록");
            literatureBooks[0].BookList();
            literatureBooks[1].BookList();
            economyBooks[0].BookList();
            economyBooks[1].BookList();
            economyBooks[2].BookList();
            scienceBooks[0].BookList();
            scienceBooks[1].BookList();
        }
        else if(UserSelectNumber == 2){
            workBooks[0].BookList();
            cartoonBooks[0].BookList();
            cartoonBooks[1].BookList();
        }
        else{
            System.out.println("번호를 다시 선택해주세요.");
            BookListView();
        }
    }

    public static void UserSelectWork(){
        System.out.println("원하는 업무 번호를 선택하세요.");
        String Book_List = "1. 책 목록 보기";
        String Book_Loan = "2. 책 대출 하기";
        String End = "3. 종료";

        System.out.println(Book_List);
        System.out.println(Book_Loan);
        System.out.println(End);

        Scanner scanner = new Scanner(System.in);
        int UserSelectWork = scanner.nextInt();
        scanner.nextLine(); // 남아있는 엔터 제거



        switch ( UserSelectWork ){
            case 1 :
                BookListView();
                UserSelectWork();
                break;
            case 2 :
                BookLoan bookLoan = new BookLoan();
                bookLoan.BookLoan();
                UserSelectWork();
                break;
            case 3 :
                System.out.print("도서관 시스템을 종료합니다.");
                break;
            default:
                System.out.println("다시 번호를 입력해주세요.");
                UserSelectWork();
                break;
        }
    }
}
