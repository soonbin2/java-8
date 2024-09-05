package com.ogiraffers.Team;

import java.util.Scanner;

public class practice {
    /*사용자로부터 세 개의 정수를 입력받아, 이 세 정수로 구성된 삼각형의 유형을 판별하는 프로그램을 작성하세요.
    입력받은 세 정수가 삼각형의 세 변의 길이입니다. 만약 변의 길이가 0보다 작을때 "변의 길이는 0보다 커야 합니다."가 출력이
    되게 하세요.
    정삼각형: 세 변의 길이가 모두 같을 때.
    이등변 삼각형: 두 변의 길이가 같고 나머지 한 변의 길이와 다를 때.
    부등변 삼각형: 세 변의 길이가 모두 다를 때.

    입력 예시
    첫 번째 변의 길이를 입력하세요 : 2
    두 번째 변의 길이를 입력하세요 : 3
    세 번째 변의 길이를 입력하세요 : 4

    출력 예시
    부등변삼각형 입니다.
    */
    public void test(){
        Scanner sc =new Scanner(System.in);
        System.out.print("첫 번째 변의 길이를 입력하세요 : ");
        int a = sc.nextInt();
        System.out.print("두 번째 변의 길이를 입력하세요 : ");
        int b = sc.nextInt();
        System.out.print("세 번째 변의 길이를 입력하세요 : ");
        int c = sc.nextInt();

        if(a>0 && b>0 && c>0){
            if(a==b && b==c){
                System.out.println("정삼각형 입니다.");
            }else if(a==b || a==c || b==c){
                System.out.println("이등변삼각형 입니다.");
            }else{
                System.out.println("부등변삼각형 입니다.");
            }
        }else{
            System.out.println("변의 길이는 0보다 커야 합니다.");
        }

    }
}
