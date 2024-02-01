package operator;

import java.util.Scanner;

public class ConditionEx2 {

  public static void main(String[] args) {
    // 숫자 입력 받은 후 그 숫자가 양수인지 음수인지 판별
    Scanner sc = new Scanner(System.in);
    System.out.print("숫자 입력 ");
    int num = sc.nextInt();
    System.out.printf("입력한 숫자 %d는 %S\n", num, num >= 0 ? "양수" : "음수");

    // 짝수인지 홀수인지 판별
    System.out.printf(
      "입력한 숫자 %d는 %S\n",
      num,
      num % 2 == 0 ? "짝수" : "홀수"
    );

    char ch1 = 'a';
    // ch1 이 영문자이거나 1~9 사이의 숫자인지 판별
    System.out.println(
      (ch1 >= 65 && ch1 <= 90) ||
        (ch1 >= 97 && ch1 <= 122) ||
        (ch1 >= 1 && ch1 <= 9)
        ? true
        : false
    );
  }
}
