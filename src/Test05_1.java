/* 1. 문제
    아래 코드에서는 두 개의 if문을 사용하고 있다.
    이를 하나의 if문만 사용하도록 변경해보자.

public class Test05_1 {
    public static void main(String[] args)
    {
        int num = 120;
        if(num > 0) {
            if((num % 2) == 0)
                System.out.println("양수이면서 짝수");
        }
    }
}
 */

public class Test05_1 {
    public static void main(String[] args)
    {
        int num = 120;
        if(num > 0 && (num % 2) == 0)
            System.out.println("양수이면서 짝수");
    }
}
