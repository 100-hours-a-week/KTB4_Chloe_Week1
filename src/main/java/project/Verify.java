package project;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Verify {
    static final String LibraryCode = "1234";

    //예외 처리 필요
    public void VerifyCode(){
        Scanner scanner = new Scanner(System.in);
        String verification_code;
        boolean VerifyCheck = false;

        while(!VerifyCheck){
            try {
                System.out.println("도서관 인증 코드를 입력해주세요( 숫자 4자리 )");
                verification_code = scanner.nextLine();

                if (!verification_code.matches("\\d{4}")) {
                    throw new InputMismatchException();
                }

                if (verification_code.equals(LibraryCode)) {
                    System.out.println("도서관 코드가 인증되었습니다.");
                    VerifyCheck = true;

                    System.out.println();
                    System.out.println("==========================");
                    System.out.println("   도서관 시스템에 오신 것을");
                    System.out.println("       환영합니다 📚");
                    System.out.println("==========================");
                    System.out.println();

                    continue;
                }

                throw new IllegalArgumentException();
            }
            catch (InputMismatchException e){
                System.out.println("도서관 코드는 4자리 숫자 입니다.");
            }
            catch(IllegalArgumentException e){
                System.out.println("도서관 코드가 아닙니다.다시 시도하세요 ");
            }

        }

    }
}

