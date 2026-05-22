package project;

import java.util.Scanner;

public class BookListView {

     BookList bookList = new BookList();
    //예외 처리 필요
    public void BookListViewForm(){
        bookList.BookListCreate();
        Scanner scanner = new Scanner(System.in);
        String PaperBook = "1.종이책";
        String EBook = "2.전자책";
        int UserSelectForm;

        boolean BookFormCheck = false;
        while(!BookFormCheck){

            System.out.println(PaperBook);
            System.out.println(EBook);
            System.out.println("번호를 선택해주세요.");
            UserSelectForm = scanner.nextInt();

            if( UserSelectForm == 1){
                BookListViewPaper();
                BookFormCheck = true;
                continue;
            }
            else if(UserSelectForm == 2){
                BookListViewElectronic();
                BookFormCheck = true;
                continue;
            }
            System.out.println("번호를 다시 선택해주세요.");
        }

    }

    public void BookListViewPaper(){
        Scanner scanner = new Scanner(System.in);
        boolean BookPaperCheck = false;
        int UserSelectPaperField;

        while(!BookPaperCheck){
            System.out.println("종이책 목록");
            System.out.println("1.문학");
            System.out.println("2.경제");
            System.out.println("3.과학");
            System.out.println("번호를 선택해주세요.");
            UserSelectPaperField = scanner.nextInt();
            scanner.nextLine();
            switch (UserSelectPaperField){
                case 1 :
                    bookList.literatureBooks[0].BookList();
                    bookList.literatureBooks[1].BookList();
                    BookPaperCheck = true;
                    break;
                case 2 :
                    bookList.economyBooks[0].BookList();
                    bookList.economyBooks[1].BookList();
                    bookList.economyBooks[2].BookList();
                    BookPaperCheck = true;
                    break;
                case 3 :
                    bookList.scienceBooks[0].BookList();
                    bookList.scienceBooks[1].BookList();
                    BookPaperCheck = true;
                    break;
                default:
                    System.out.println("번호를 다시 선택해주세요.");
            }

        }
    }

    public void BookListViewElectronic(){
        Scanner scanner = new Scanner(System.in);
        boolean BookElectronicCheck = false;
        int UserSelectElectronicField;

        while(!BookElectronicCheck){
            System.out.println("전자책 목록");
            System.out.println("1.문제집");
            System.out.println("2.만화책");
            System.out.println("번호를 선택해주세요.");
            UserSelectElectronicField = scanner.nextInt();
            scanner.nextLine();

            switch (UserSelectElectronicField){
                case 1:
                    bookList.workBooks[0].BookList();
                    BookElectronicCheck = true;
                    break;
                case 2:
                    bookList.cartoonBooks[0].BookList();
                    bookList.cartoonBooks[1].BookList();
                    BookElectronicCheck = true;
                    break;
                default:
                    System.out.println("번호를 다시 선택해주세요.");
                    break;
            }
        }

    }

}
