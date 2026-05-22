package project;

import java.util.Scanner;

public class Verify {
    static final String LibraryCode = "1234";

    //예외 처리 필요
    public void VerifyCode(){
        Scanner scanner = new Scanner(System.in);
        String verification_code;
        boolean VerifyCheck = false;

        while(!VerifyCheck){
            System.out.println("도서관 인증 코드를 입력해주세요");
            verification_code = scanner.nextLine();

            if(verification_code.equals(LibraryCode)){
                System.out.println("도서관 코드가 인증되었습니다.");
                VerifyCheck = true;
                continue;
            }
            System.out.println("도서관 코드가 아닙니다. 다시 시도하세요");
        }

    }
}

