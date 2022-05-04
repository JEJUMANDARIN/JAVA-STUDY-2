/* 2. 문제
    SCE.java의 실행 결과를 보면 변수 num2의 값이 증가하지 않았음을 알 수 있다.
    그렇다면 어떻게 수정해야 num2의 값이 증가하겠는가?
 */
public class Test04_2 {
    public static void main(String[] args)
    {
        int num1 = 0;
        int num2 = 0;
        boolean result;

        num1 += 10;
        num2 += 10;
        result = (num1 < 0) && (num2 > 0);

        System.out.println("result = " + result);
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2 + '\n');

        num1 += 10;
        num2 += 10;
        result = (num1 > 0) || (num2 > 0);

        System.out.println("result = " + result);
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
