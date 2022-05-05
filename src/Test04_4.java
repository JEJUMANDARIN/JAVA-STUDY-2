/* 4. 문제
    다음 계산 결과를 출력하는 프로그램을 작성하되, 덧셈 연산의 횟수를 최소화하여 작성해보자
    3+6 3+6+9   3+6+9+12
 */

public class Test04_4 {
    public static void main(String[] args)
    {
        int result = 3 + 6;
        System.out.println("3 + 6 = " + result);

        result += 9;
        System.out.println("3 + 6 + 9 = " + result);

        result += 12;
        System.out.println("3 + 6 + 9 + 12 = " + result);

        // 덧셈의 수를 최소화하기 위하여 이전 덧셈 결과를 활용한다.

    }
}
