import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
public class TWO805 {
    public static void main(String[] args) throws Exception {
        func Function = new func();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stt = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(stt.nextToken()); // 나무 개수
        int k = Integer.parseInt(stt.nextToken()); // 가져가려는 나무 길이
        StringTokenizer st = new StringTokenizer(in.readLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr); // 이진탐색을 하려면 오름차순으로 정렬되어있어야됨

        int heightMax = arr[n-1];  // 절단기 최대높이를 배열 맨 마지막값으로 정의
        int heightMin = 0; // 절단기 최소 높이
        long Answer = Function.find(heightMax,heightMin,arr,k);
        System.out.println(Answer); // 절단기에 설정할 수 있는 높이의 최댓값
    }
}

class func {
    long find(int max, int min, int[] S, int k) { // 최대값, 최소값, 들어갈 배열, k(가져가려는 나무 길이)
        int middle; // 중간값
        while (max >= min) { // 이진탐색 시작
            middle = (min + max) / 2; // 반띵한게 middle
            long remainder; // 절단기로 짤린 남은 나무길이. 숫자가 오지게 커서 long으로 바꿔둠
            long sumremainder = 0; // 자른 나무들 합. 얘도 클거같아서 long으로 바꿈
            for (int i : S) { // 배열에 하나씩 들어가서 커질때
                remainder = i - middle; // 이진탐색으로 찾아들어감
                if (remainder < 0)  remainder = 0; // 마이너스는 중간보다 작다는거니까 remainder = 0
                sumremainder += remainder;
            }
            if (sumremainder >= k)  min = middle + 1; // 잘려진 애들의 sum이 많이 짤렸을때-> sum을 최소한으로 가져가야댐(환경관심많대)
            else  max = middle - 1; // 적게 짤렸을때 -> 절단기 높이를 줄여야 더 썰리지
        }
        return  max;
    }

}
