package com.company;
import java.util.Scanner;
public class sachick {
    public static void main(String[] args) {
        String qi;
        do{
            Scanner sc = new Scanner(System.in);
            double a = sc.nextDouble();
            char c = sc.next().charAt(0);
            double d = sc.nextDouble();
            double k = 0.0;
            System.out.println("연산식 : "+a +" "+c+" "+d);
            switch(c){
                case('+'):  System.out.print("연산식 : "+a +" "+c+" "+ d+"의 계산결과는"+(k = a+d)); break;
                case('-'):  System.out.print("연산식 : "+a +" "+c+" "+ d+"의 계산결과는"+(k = a-d)); break;
                case('*'):  System.out.print("연산식 : "+a +" "+c+" "+ d+"의 계산결과는"+(k = a*d)); break;
                case('/'): {
                    if(d == 0){
                        System.out.println("0으로 나눌 수 없습니다");
                    }
                    else{
                        System.out.print("연산식 : "+a +" "+c+" "+ d+"의 계산결과는"+" "+(k = a/d)); break;
                    }
                }
                case('%'): System.out.print("연산식 : "+a +" "+c+" "+ d+"의 계산결과는"+(k = a%d)); break;
                case('?'):  System.out.print("연산식 : "+a +" "+c+" "+ d+"의 계산결과는"+((k = a-(a%d))/d)); break;

            }
            System.out.println();
            System.out.print("계속하시겠습니까?(y/n):");
            Scanner ssc = new Scanner(System.in);
            qi = ssc.nextLine();
        }while(qi.equals("y"));
        }
}







//사칙 연산을 입력 받아 계산하는 프로그램을 작성하고자 한다.
//연산자는 +,-,*,/의 네 가지로 하고 피연산자는 모두 실수로 한다.
//피연산자와 연산자는 실행 사례와 같이 빈 칸으로 분리하여 입력한다.
//0으로 나누기 시 “0으로 나눌 수 없습니다.”를 출력하고 종료한다.