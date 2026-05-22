package project;

import project.BookFolder.*;

public class Main {
    public void main(){
        Verify verify = new Verify();
        Library library = new Library();

        verify.VerifyCode(); //인증코드

        Library.UserSelectWork(); //도서관 동작





    }
}
