package com.company;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class One213 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] dic = new int[28];
        for (int i = 0; i < s.length(); i++) {
            int a = s.charAt(i) - 65;
            dic[a]++;
        }
        boolean isOkay;

        int cnt = 0;
        int temp = 0;
        for (int i = 0; i < 26; i++) {
            if (dic[i] % 2 == 1) {
                temp = i;
                cnt++;
            }
        }
        if (cnt >= 2) {
            System.out.println("I'm Sorry Hansoo");
        } else if (cnt == 1) {

            for (int i = 0; i < 26; i++) {
                dic[i] = dic[i] / 2;
            }

            String answer = "";
            for (int i = 0; i < 26; i++) {
                while (dic[i] > 0) {
                    answer = answer + ((char) (i + 65));
                    dic[i]--;
                }
            }

            answer = answer + ((char) (temp + 65));


            int length = answer.length();
            for (int i = length - 2; i >= 0; i--) {
                answer = answer + answer.charAt(i);
            }

            System.out.println(answer);

        } else {
            for (int i = 0; i < 26; i++) {
                dic[i] = dic[i] / 2;
            }

            String answer = "";
            for (int i = 0; i < 26; i++) {
                while (dic[i] > 0) {
                    answer = answer + ((char) (i + 65));
                    dic[i]--;
                }
            }
            int length = answer.length();
            for (int i = length - 1; i >= 0; i--) {
                answer = answer + answer.charAt(i);
            }
            System.out.println(answer);
        }
    }
}