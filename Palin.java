package com.company;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Palin {
    public static void main(String[] args) throws IOException {
      int[] arr = new int[26];
      int count = 0;
      char[] name = new char[51];
      //Scanner sc = new Scanner(System.in);
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String k = in.readLine();
        int b = k.length();
        for(int i=0;i<b;i++){
            arr[k.charAt(i)-65]++;
        }
        for(int i=0;i<26;i++){

        }



    }
}
