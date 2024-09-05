package com.ogiraffers.Team;

import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        /* 사용자로부터 정수를 입력 받아
        * 해당 정수가 양수이며
                * 100이상이며
                * 짝수일 때 true,
        * 홀수일 때 false를 출력하는 조건문을 작성하세요.
        *
        * 사용자가 100미만의 양수를 입력 했을 때
                * "100 이상의 양수를 입력하세요" 라는 문장이 출력되도록 하세요
        * */
        Scanner sc =new Scanner(System.in);
        System.out.print("정수를 입력하시오 : ");
        int num = sc.nextInt();
        if(num >= 100 && num % 2 == 0){
            System.out.println("true");
        }else if (num >=100){
            System.out.println("false");
        }else{
            System.out.println("100 이상의 양수를 입력하세요");
        }
    }
}
