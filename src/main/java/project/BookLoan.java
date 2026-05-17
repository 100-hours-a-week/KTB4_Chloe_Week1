package project;
import java.util.Scanner;

public class BookLoan {
    static int ReturnPeriod = 7; //도서관 반납 일자
    public void BookLoan(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("대여하실 책의 권수를 입력해주세요.(최대:3개)");
        int LoanBooks = scanner.nextInt();
        scanner.nextLine(); // 남아있는 엔터 제거

        if(LoanBooks >=4){
            System.out.println("4권이상 대여하실 수 없습니다.");
            BookLoan();
        }

        String[] booknames = new String[LoanBooks];


        System.out.println("대여하실 책의 이름을 입력해주세요.");
        for(int i=0; i<LoanBooks; i++){
            booknames[i] = scanner.nextLine();
        }

        for(int i=0; i<LoanBooks; i++){
            System.out.print(booknames[i]+" ");
        }
        System.out.println("총"+LoanBooks+"권의 반납일자는 "+ReturnPeriod+"일 이내 입니다.");
    }
}
