package com.company;

//11004번
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class One1004 {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stt = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(stt.nextToken());
        int k = Integer.parseInt(stt.nextToken());
        StringTokenizer st = new StringTokenizer(in.readLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);
        System.out.print(arr[k-1]);
    }
}