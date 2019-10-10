import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// 백준 2512번 자바
public class TWOFIVE12 {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int[] k = new int[a];
        int cnt = 0;
        StringTokenizer st = new StringTokenizer(s, " ");
        while (st.hasMoreTokens()) {
            k[cnt] = Integer.parseInt(st.nextToken());
            cnt++;
        }
        int mx = Integer.parseInt(br.readLine());
        int l = 0;
        int r = 0;
        for (int i = 0; i < a; i++) {
             r = Math.max(k[i], r);
        }
        while (l < r) {
        int sum = 0;
            System.out.println("for문 밖에서 sum값"+sum);
        int m = (l + r + 1) / 2;
            System.out.println("for문 밖에서 m값"+m);
        for (int i = 0; i < a; i++) {
            if (k[i] > m) {
                sum  = sum+m;
            }
            else{
                sum = sum+k[i];
            }
            System.out.println("for문 안에서 sum값"+sum);
        }
        if (mx < sum){
            r = m - 1;
        }
        else {
            l = m;
        }
            System.out.println("while문 끝에서 l,r값"+l+" "+r);
    }
        System.out.println(l);

  }
}
