package ForIFDoWhilePractice;

/*
Преобразовать строчные в прописные и наооборот.
Конец работы программмы - ввод точки
реализовать счетчик числа символов, для которых изменен регистр
*/

public class ChangeRegister {
    public static void main(String[] args)
            throws java.io.IOException {
        char a;
        int count = 0;
        do {
            a = (char) System.in.read();
            if (a >= 'A' && a <= 'Z') {
                char b = (char) (a + 32);
                System.out.print(b);
                count++;
            }
            if (a >= 'a' && a <= 'z') {
                a = (char) (a - 32);
                System.out.print(a);
                count++;
            }
        }
        while (a != '.');
        System.out.println(count);
    }
}



