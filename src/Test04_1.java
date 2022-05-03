/* 1. 문제
    int형 변수 num1, num2, num3에 각각 10, 20, 30이 저장된 상태에서
    다음 문장을 실행하면 변수에는 각각 얼마가 저장되겠는가?
    num1 = num2 = num3;

    이의 확인을 위한 코드를 작성하고 그러한 결과를 보이는 이유를 설명해보자.
 */

public class Test04_1 {
    public static void main(String[] args) {

        int num1 = 10, num2 = 20,  num3 = 30;
        num1 = num2 = num3;

        /*
          = 연산자는 결합 방향이 오른쪽에서 왼쪽으로 진행된다.
          따라서 위의 문장은 다음과 같다.
          num1 = (num2 = num3);
        */

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);


    }
}
