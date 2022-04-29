/* 3. 문제
숫자 12를 총 5회 출력하는 프로그램을 작성하되 매 출력마다 그 방법이 달리해보자.
즉 다음과 같은 문장을 구성하여 12를 5회 출력하되 소괄호의 내용은 모두 달라야한다.
        System.out.println(. . .);
 */

public class Test01_3 {
    public static void main(String[] args)
    {
        System.out.println(12);
        System.out.println("1"+"2");
        System.out.println("12");
        System.out.println("1"+2);
        System.out.println(1+"2");
    }
}
