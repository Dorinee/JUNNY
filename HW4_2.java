import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HW4_2 {
    public static void main(String[] args )throws Exception{
        System.out.print("두 정수와 연산자를 입력하시오 >> ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s," ");
        int p1 = Integer.parseInt(st.nextToken());
        int p2 = Integer.parseInt(st.nextToken());
        String p3 = st.nextToken();
        Add a = new Add();
        Sub ss = new Sub();
        Mul mu = new Mul();
        Div dv = new Div();

       switch(p3){
           case "+": {
               a.setValue(p1,p2);
               a.calculate();
               break;
           }
           case "-": {
               ss.setValue(p1,p2);
               ss.calculate();
               break;
           }
           case "*": {
               mu.setValue(p1,p2);
               mu.calculate();
               break;
           }
           case "/": {
               dv.setValue(p1,p2);
               dv.calculate();
               break;
           }

       }

    }
}

class Add{
    int left, right;

    public void setValue(int left, int right) {
        this.left = left;
        this.right = right;
    }
    public void calculate() {
        System.out.println(this.left + this.right);
    }

}
class Sub{
    int left, right;

    public void setValue(int left, int right) {
        this.left = left;
        this.right = right;
    }
    public void calculate() {
        System.out.println(this.left - this.right);
    }

}
class Mul{
    int left, right;

    public void setValue(int left, int right) {
        this.left = left;
        this.right = right;
    }
    public void calculate() {
        System.out.println(this.left * this.right);
    }

}
class Div{
    int left, right;

    public void setValue(int left, int right) {
        this.left = left;
        this.right = right;
    }
    public void calculate() {
        try{
            System.out.println(this.left / this.right);
        }
        catch(ArithmeticException e){
            System.out.println("0으로 나눌수 없습니다.");
        }

    }

}