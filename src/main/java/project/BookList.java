package project;

import project.BookFolder.*;

public class BookList {
     LiteratureBook[] literatureBooks;
     EconomyBook[] economyBooks;
     ScienceBook[] scienceBooks;
     WorkBook[] workBooks;
     CartoonBook[] cartoonBooks;

    public void BookListCreate(){
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
}
