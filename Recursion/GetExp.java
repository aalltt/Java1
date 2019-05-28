package Recursion;

/*
Возведение в степень с помощью рекурсии
 */

public class GetExp {
    int Exp(int a, int b) {
        int result;
        if (b == 0) return 1;
        result = a*Exp(a,b-1);
        return result;

    }
}


class GetExpMain {
    public static void main(String[] args) {
        GetExp e = new GetExp();

        System.out.println(e.Exp(2,3));
    }

}

