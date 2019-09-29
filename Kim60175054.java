package com.company;
import java.util.Scanner;
import java.util.regex.*;
public class Kim60175054 {
    public static void main(String[] args){
        System.out.println("3자리 정수 입력(100~999) >> ");
        Scanner sc = new Scanner(System.in);
        String alpha = sc.nextLine();
        String ex = "^[1-9]{1}[0-9]{1}[0-9]{1}$"; // 정규표현식을 이용한 숫자범위 지적
        // String변수 ex가 100~999까지 범위가 지정된다.
        if(alpha.matches(ex)){
            int b = Integer.parseInt(alpha) %100;
            if(b%11 ==0){
                System.out.printf("YES! 10의자리와 1의 자리가 %d로 같습니다.",b%10);
            }
            else{
                System.out.println("범위에 들어오지만 10의자리와 1의자리가 같지 않습니다.");
            }
        }else{
            System.out.println("범위가 벗어났습니다.");
        }
    }
}
