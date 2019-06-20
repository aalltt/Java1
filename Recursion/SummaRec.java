package Recursion;
/* Дано натуральное число N. Вычислите сумму его цифр*/

public class SummaRec {
    static int getRec(int n) {
       int result;
        if (n == 0)
            return 0;
       result=n+getRec(n-1);
       return result;
    }

    public static void main(String[] args) {
        System.out.println(getRec(6));
    }
}

