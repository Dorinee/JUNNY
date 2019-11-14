import java.util.*;
import java.io.*;
public class Algorithm {
    public static void main(String[] args){
        System.out.println("알고리즘 퀴즈 9-1 과제입니다. ");
       // Quiz_9_1 quiz = new Quiz_9_1();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("행렬 경로: 1, 도미노: 2, LCS: 3 ,종료: 4 >>");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    Quiz_9_1.runMatrix();
                    break;
                case 2:
                    Quiz_9_1.runDomino();
                    break;
                case 3:
                    Quiz_9_1.runLCS();
                    break;
                case 4:
                    System.out.println("과제를 종료합니다.");
            }
            if(num == 4)  break;
        }
    }
}
class Quiz_9_1 {
    private static int[] dynprog; // dynamic programming
    static void runMatrix() {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("행렬의 크기를 정해주세요");
        n = scan.nextInt();
        int[][] mat = new int[n][n]; // 매트릭스 mat은 n*n행렬이니까 이중 배열로 만들어줌
        int[][] Memory = new int[n][n];  // 메모이제이션을 하기위해 같은 크리의 이중배열 하나더 만든다
        System.out.println("행렬의 원소들을 적어주세요");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = scan.nextInt(); // 이중 for문을 이용해서 행렬의 원소들을 하나씩 적는다.
            }
        }
        Memory[0][0] = mat[0][0]; //mat의 맨위 왼쪽원소를 Memory의 맨위 왼쪽원소라고 해둔다.
        System.out.println("Answer: " + MatrixPath(mat, n - 1, n - 1, Memory));
    }

    static int MatrixPath(int[][] mat, int i, int j, int[][] Memory) {
        if (i == 0 && j == 0) return Memory[0][0];//i,j 둘다 0이면 아까 써놨던 Memory[0][0] 리턴
        if (i == 0) { // i만 0이면 // 맨윗줄
            if(Memory[0][j-1] != 0){
                Memory[i][j] = Memory[0][j - 1] + mat[0][j];
            }
            else{
                Memory[i][j] = MatrixPath(mat,0,j-1,Memory)+mat[0][j];
            }
            return Memory[i][j];
        }
        if (j == 0) {
            if(Memory[i-1][0] != 0){
                Memory[i][j] = Memory[i-1][0] + mat[i][0];
            }
            else{
                Memory[i][j] = MatrixPath(mat,i-1,0,Memory)+mat[i][0];
            }
            return Memory[i][j];
        } else {
            if(Memory[i-1][j-1] != 0){
                Memory[i][j] = Memory[i-1][j-1] + mat[i][j];
            }
            else{
                Memory[i][j] = MatrixPath(mat,i-1,j-1,Memory)+mat[i][j-1];
            }
            return Memory[i][j];
        }
    }


    static void runDomino() { // 왜 이게 피보나치가 되는지를 설명을 해줘야댐
        Scanner scanner = new Scanner(System.in);
        System.out.println("도미노 가로 n 길이 : ");
        int n = scanner.nextInt();
        dynprog = new int[n + 1];
        System.out.println("n 번째 도미노 개수 :" + Domino(n));
    }

    private static int Domino(int n) {

        if(n<=2) return 1;
        if( dynprog[n] !=0) return dynprog[n];
        else{
            dynprog[n] = Domino(n-1)+Domino(n-2);
            return dynprog[n];
        }

    }

    static void runLCS() { //Longest Common Subsequence 최장 공통부분 수열
        Scanner scan = new Scanner(System.in);
        System.out.println("첫번째 문자열");
        char[] alpha = scan.nextLine().toCharArray(); // nextline으로 받은 스트링을 char형태의 array로 바꾼것
        System.out.println("두번째 문자열");
        char[] beta = scan.nextLine().toCharArray();
        int[][] lcs = new int[alpha.length + 1][beta.length + 1];
        String[][] solution = new String[alpha.length + 1][beta.length + 1];
        for (int i = 1; i <= alpha.length; i++) {
            for (int j = 1; j <= beta.length; j++) {
                if (alpha[i - 1] == beta[j - 1]) {
                    lcs[i][j] = lcs[i - 1][j - 1] + 1;
                    solution[i][j] = "down";
                } else {
                    lcs[i][j] = Math.max(lcs[i - 1][j], lcs[i][j - 1]);
                    if (lcs[i][j] == lcs[i - 1][j]) {
                        solution[i][j] = "top";
                    } else {
                        solution[i][j] = "left";
                    }
                }
            }
        }
        int n = alpha.length;
        int m = beta.length;
        StringBuilder sb = new StringBuilder();
        while (solution[n][m] != null) {
            if (solution[n][m].equals("down")) {
                sb.append(alpha[n - 1]);
                n--;
                m--;
            } else if (solution[n][m].equals("top")) {
                n--;
            } else if (solution[n][m].equals("left")) {
                m--;
            }
        }
        System.out.println("LCS의 길이는 "+lcs[alpha.length][beta.length]);
        System.out.println("LCS는 "+sb.reverse().toString());
    }

}


