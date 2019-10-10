import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
// 백준 1300번 자바
public class One300 {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int[] Karma = new int[a*a];
        int n =1;
        for(int i=0;i<a;i++){
            Karma[i] = i+1;
        }
        while(n<a){
        for(int j=n*a;j<(n+1)*a;j++){
            Karma[j] = (j+1-(n*a))*(n+1);
          }
        n++;
        }
        Arrays.sort(Karma);
        BufferedReader brr = new BufferedReader(new InputStreamReader(System.in));
        int aa = Integer.parseInt(brr.readLine());
        System.out.println(Karma[aa-1]);

        BufferedReader brrr = new BufferedReader(new InputStreamReader(System.in));
        int aaa = Integer.parseInt(brrr.readLine());
        int l = Integer.parseInt(brrr.readLine());
        sol sl = new sol(aaa,l);
        System.out.println(sl.koala(aaa,l));
    }
}


class sol {
    int a;
    int l;
    public sol(int a, int l){
        this.a = a;
        this.l = l;
    }

    public int koala(int a, int l){
        int high = l;
        int low = 1;
        int mid = 0;
        int sum = 0;
        int answer = 0;
        while(low <= high) {
            mid = (high + low) / 2;
            sum = 0;

            for(int i = 1; i <= a; i++)
                sum += Math.min(mid / i, a);

            if(sum >= l) {
                high = mid - 1;
                answer = mid;
            }else
                low = mid + 1;
        }
        return answer;
    }
}
