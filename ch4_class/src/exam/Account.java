package exam;

import javax.swing.Spring;

public class Account {

  // 은행 계좌
  // 속성: 계좌번호(110-11-12345), 계좌주 이름(홍길동), 잔액(100000)
  private String accountNum;
  private String name;
  private int balance;

  // 생성자
  public Account() {}

  public Account(String accountNum, String name, int balance) {
    this.accountNum = accountNum;
    this.name = name;
    this.balance = balance;
  }

  // 메소드
  // 예금하다
  int deposit(int num) {
    return balance += num;
  }

  // 출금하다
  int withdraw(int num) {
    return balance -= num;
  }
}
