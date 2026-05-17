package project;

import project.BookFolder.*;

import java.util.Scanner;

public class Library {

    static String LibraryCode = "1234";
    static LiteratureBook[] literatureBooks;
    static EconomyBook[] economyBooks;
    static ScienceBook[] scienceBooks;
    static WorkBook[] workBooks;
    static CartoonBook[] cartoonBooks;

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

    public static void BookListCreate(){
        literatureBooks = new LiteratureBook[2];
        literatureBooks[0] = new LiteratureBook("젊은 베르테르의 슬픔");
        literatureBooks[1] = new LiteratureBook("문학책2");

        economyBooks = new EconomyBook[3];
        economyBooks[0] = new EconomyBook("경제랑 놀자");
        economyBooks[1] = new EconomyBook("경제책2");
        economyBooks[2] = new EconomyBook("경제책3");

        scienceBooks = new ScienceBook[2];
        scienceBooks[0] = new ScienceBook("과학책1");
        scienceBooks[1] = new ScienceBook("과학책2");

        workBooks = new WorkBook[1];
        workBooks[0] = new WorkBook("문제집1");

        cartoonBooks = new CartoonBook[2];
        cartoonBooks[0] = new CartoonBook("만화책1");
        cartoonBooks[1] = new CartoonBook("만화책2");
    }

    public static void BookListViewForm(){
        BookListCreate();
        Scanner scanner = new Scanner(System.in);
        String PaperBook = "1.종이책";
        String EBook = "2.전자책";

        System.out.println(PaperBook);
        System.out.println(EBook);
        System.out.println("번호를 선택해주세요.");
        int UserSelectForm = scanner.nextInt();

        if( UserSelectForm == 1){
            BookListViewPaper();
        }
        else if(UserSelectForm == 2){
            BookListViewElectronic();
        }
        else{
            System.out.println("번호를 다시 선택해주세요.");
            BookListViewForm();
        }
    }

    public static void BookListViewPaper(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("종이책 목록");
        System.out.println("1.문학");
        System.out.println("2.경제");
        System.out.println("2.경제");
        System.out.println("번호를 선택해주세요.");
        int UserSelectPaperField = scanner.nextInt();
        scanner.nextLine();

        switch (UserSelectPaperField){
            case 1 :
                literatureBooks[0].BookList();
                literatureBooks[1].BookList();
                break;
            case 2 :
                economyBooks[0].BookList();
                economyBooks[1].BookList();
                economyBooks[2].BookList();
                break;
            case 3 :
                scienceBooks[0].BookList();
                scienceBooks[1].BookList();
            default:
                System.out.println("번호를 다시 선택해주세요.");
                BookListViewPaper();
        }
    }

    public static void BookListViewElectronic(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("전자책 목록");
        System.out.println("1.문제집");
        System.out.println("2.만화책");
        System.out.println("번호를 선택해주세요.");
        int UserSelectElectronicField = scanner.nextInt();
        scanner.nextLine();

        switch (UserSelectElectronicField){
            case 1:
                workBooks[0].BookList();
                break;
            case 2:
                cartoonBooks[0].BookList();
                cartoonBooks[1].BookList();
                break;
            default:
                System.out.println("번호를 다시 선택해주세요.");
                BookListViewElectronic();
                break;
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
                BookListViewForm();
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
