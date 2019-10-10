import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
//백준 10815번 자바
public class One0815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s," ");
        int cnt =0;
        int p=0;
        int[] k = new int[n];
        while(st.hasMoreTokens()){
            k[cnt] = Integer.parseInt(st.nextToken());
            p = p+k[cnt];
            cnt++;
        }
        Arrays.sort(k);

        int m = Integer.parseInt(br.readLine());
        String b = br.readLine();
        StringTokenizer stt = new StringTokenizer(b," ");
        int cnt1=0;
        int p1 =0;
        int[] k1 = new int[m];
        while(stt.hasMoreTokens()){
            k1[cnt1] = Integer.parseInt(stt.nextToken());
            p1 = p1+k1[cnt1];
            cnt1++;
        }
        for(int i =0; i<m; i++){
            int f = 0;
            int max = n;
            int min = -1;
            int middle;
            while(max - min > 1){
                middle = (min+max)/2;
                if(k1[i] == k[middle]){
                    f = 1;
                    break;
                }
                if(k1[i] > k[middle]){
                    min = middle;
                }else if(k1[i] < k[middle]){
                    max = middle;
                }
            }

            System.out.print(f+" ");
        }
    }
}
