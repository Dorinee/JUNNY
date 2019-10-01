package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class SEPHW {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int po = Integer.parseInt(in.readLine());
        int HI[][]= new int[po][2];
      for(int i=0;i<po;i++){

          StringTokenizer stt = new StringTokenizer(in.readLine()," ");
          //hi[i] = new HI(stt.nextToken(),stt.nextToken());
          HI[i][0] = Integer.parseInt(stt.nextToken());
          HI[i][1] =  Integer.parseInt(stt.nextToken());
      }
      Arrays.sort(HI,new Comparator<int[]>(){
          @Override
          public int compare(final int[] a, final int[] b) {
              if(a[0]==b[0]){
                  return Integer.compare(a[1],b[1]);
              }
              else{
                  return Integer.compare(a[0],b[0]);
              }

          }
              }
              );
        //int[] arr = new int[n];
        //arr[i] = Integer.parseInt(st.nextToken());
     for(int i=0; i<po;i++){
         System.out.println(HI[i][0]+" "+HI[i][1]);
     }
        //System.out.print(arr[k-1]);



        /*for(int i=0;i<po;i++){

        }*/
        /*StringTokenizer stt = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(stt.nextToken());
        int k = Integer.parseInt(stt.nextToken());
        StringTokenizer st = new StringTokenizer(in.readLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);
        System.out.print(arr[k-1]);*/



    }
}
/*class HI{
    String q,w;
    public HI(String q, String w) {
        this.q =q;
        this.w = w;
    }
}*/


