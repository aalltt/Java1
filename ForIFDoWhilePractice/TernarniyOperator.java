package ForIFDoWhilePractice;

/*
Записать через оператор ?
if (x<0) y=10
else y=20;
 */

public class TernarniyOperator {
    public static void main(String[] args) {
        DoOperatorT(4);
    }

    static void DoOperatorT(int x) {
        int y = x < 0 ? 10 : 20;
        System.out.println(y);
    }
}
