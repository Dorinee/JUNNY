package com.company;
import java.io.*;

public class One0989 {

    public static void main(String[] args) throws IOException {

        InputStreamReader aa = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(aa);

        int n = Integer.valueOf(br.readLine());
        int[] array = new int[10001];
        while(n-->0) {
            int i = Integer.valueOf(br.readLine());
            array[i] += 1;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int j=1; j<=10000; j++) {
            if (array[j]>0) {
                int times = array[j];
                while(times-->0) {
                    bw.write(""+j);
                    bw.write(System.lineSeparator());
                }
            }
        }
        bw.close();
    }

}