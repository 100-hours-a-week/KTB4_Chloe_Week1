package project;

import project.BookFolder.Book;

import java.util.List;
import java.util.Scanner;

public class BookListView {

     BookList bookList = new BookList();
    //예외 처리 필요
    public void BookListViewCategory(){
        bookList.BookListCreate();
        Scanner scanner = new Scanner(System.in);
        int UserSelectCategoryNum; // 사용자가 입력할 번호
        Book.BookCategory UserSelectCategory = null; //사용자가 선택한 카테고리
        List<Book> UserSelectCategoryList;


        boolean BookFormCheck = false; //while 문 체크

        while(!BookFormCheck){

            System.out.println("======== 책 카테고리 ========");

            for (int i = 0; i < bookList.CategoryList.size(); i++) {
                System.out.println((i + 1) + "." + bookList.CategoryList.get(i).getKorean());
            }

            System.out.println("책 카테고리 번호를 선택해주세요.");

            try{
                UserSelectCategoryNum = scanner.nextInt();
                scanner.nextLine();
                for (int i = 0; i < bookList.CategoryList.size(); i++) {
                    if(UserSelectCategoryNum == i + 1){
                        UserSelectCategory = bookList.CategoryList.get(i);
                        BookFormCheck = true;
                        break;
                    }
                }

                if(!BookFormCheck){
                    System.out.println("번호를 다시 선택해주세요.");
                }

            }
            catch (Exception e){
                System.out.println("숫자만 입력해주세요.");
                scanner.nextLine(); // 잘못된 입력 제거
            }
        }

        //값 자체가 ArryList 타입!
        UserSelectCategoryList = bookList.books.get(UserSelectCategory);

        for (int i = 0; i < UserSelectCategoryList.size(); i++) {

            //UserSelectCategoryList의 배열에 각 객체가 들어가 있음
            //이 객체는 Book 타입
            Book book = UserSelectCategoryList.get(i);

            System.out.print((i + 1) + ".");
            book.BookNamePrint();
            System.out.print(" ");
            book.BookStatusPrint();
        }

    }


}
