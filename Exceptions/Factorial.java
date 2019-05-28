package Exceptions;

//Вычисление факториала с использование собственного созданного исключения

public class Factorial {
    public static void main(String[] args) {
        try {
            int result = FactorialDo.getFactorial(-19);
        } catch (FactorialException e) {
            e.printStackTrace();
        }
        //     System.out.println(e.getMessage());
    }
}


class FactorialException extends Exception {
    int number;

    public FactorialException(String msg, int number) {
        super(msg);
        this.number = number;
    }
}

class FactorialDo {
    public static int getFactorial(int num) throws FactorialException {
        int res = 1;
        if (num < 1) throw new FactorialException("Число не может быть меньше 1", num);
        for (int i = 1; i <= num; i++) {
            res *= 1;
        }
        return res;
    }
}
