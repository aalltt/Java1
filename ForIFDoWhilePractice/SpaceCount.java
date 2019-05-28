package ForIFDoWhilePractice;

/*
Напишите программу, которая получает символы, введеные с клавиатуры, до тех пор, пока не встретится точка
Предусмотрите в программе счетчик пробелов.
Сведения о количестве пробелов должны ввыводится в конце программы.
*/

public class SpaceCount {
    public static void main(String[] args)
            throws java.io.IOException {
        char a;
        char tochka = '.';
        int count = 0;
        System.out.println("Вводите символы пока не встретится точка");
        do {
            a = (char) System.in.read();
            if (a == ' ') count++;
        }
        while (a != tochka);
        System.out.println("Количество пробелов " + count);

    }
}

