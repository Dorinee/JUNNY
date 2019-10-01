package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Song class 객체 배열 작석 and 검색
public class Main {


    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("노래 수>>");
        int a =  Integer.parseInt(br.readLine());
        BufferedReader brr = new BufferedReader(new InputStreamReader(System.in));

        Song[] song = new Song[a];
        for(int i=0;i<a;i++){
            String[] mm = new String[a];
            System.out.print("제목 , 가수 >>");
            mm[i] = brr.readLine();
            StringTokenizer st = new StringTokenizer( mm[i], " ");
            song[i] = new Song(st.nextToken(),st.nextToken());

        } System.out.println("저장되었습니다...");
        for(int i=0;i<a;i++){
            song[i].search();
        }

    }
}
class Song{
    String title,artist;
    Song(String title,String artist){
        this.artist = artist;
        this.title = title;
    }
    void search() throws IOException {
        BufferedReader bri = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("검색할 이름 >>"  );
        String kk = bri.readLine();
        if(kk.equals(artist)){
            System.out.println(kk+"의 대표곡은"+" " +title +" "+"입니다.");
        }
        else if(kk.equals("그만")){
            System.exit(0);
        }
        else{
            System.out.println(kk+"의 노래는 없습니다.");
        }
    }

}