package project;

import project.BookFolder.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class BookList {
    Map<Book.BookCategory, List<Book>> books = new HashMap<>();

    //key 값을 ArryList로 관리
    List<Book.BookCategory> CategoryList;

    public void BookListCreate(){

        //books에 카테고리 별로 리스트 만들기
        books.put(Book.BookCategory.Literature, new ArrayList<>());
        books.put(Book.BookCategory.Economy, new ArrayList<>());
        books.put(Book.BookCategory.Science, new ArrayList<>());
        books.put(Book.BookCategory.Cartoon, new ArrayList<>());
        books.put(Book.BookCategory.Workbook, new ArrayList<>());

        CategoryList = new ArrayList<>(books.keySet());



        //map의 get() 메소드 중복을 제거하기 위해..
        List<Book> literature = books.get(Book.BookCategory.Literature);
        List<Book> economy = books.get(Book.BookCategory.Economy);
        List<Book> science = books.get(Book.BookCategory.Science);
        List<Book> cartoon = books.get(Book.BookCategory.Cartoon);
        List<Book> workbook = books.get(Book.BookCategory.Workbook);

        //근데 이렇게 되면... 의미가 없는데 literature 가 객체 안에 굳이 들어가야 하나?
        //그래서 일단 없애봄...
        //이렇게 되면 map의 카테고리로 분류되서, 그 리스트 안에 Book 클래스 타입의 객체 들이 들어간다.
        literature.add(new PaperBook(
                "데미안",
                2,
                "문학-001"
        ));
        literature.add(new PaperBook(
                "문학책 2",
                1,
                "문학-002"
        ));
        economy.add(new PaperBook(
                "경제책 1",
                2,
                "경제-001"
        ));
        science.add(new PaperBook(
                "과학책 1",
                3,
                "과학-001"
        ));
        cartoon.add(new PaperBook(
                "만화책 1",
                2,
                "만화-001"
        ));

        literature.add(new EBook(
                "돈키호테"
        ));

        workbook.add(new EBook(
                "문제집 1"
        ));



















    }
}
