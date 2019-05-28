//Шилдт. Для просмотра работы алгоритма в Debug и выполнения задания

package Exceptions;
import java.io.IOException;

import static Exceptions.ShildtException.throwsShow.promt;

public class ShildtException {

    public static void main(String[] args) {

        //Пример обработки исключений
//        int nums[] = new int[4];
//        try {
//            System.out.println("До генерации исключений");
//            nums[1] = 10;
//            System.out.println("Если все ок");
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Выход за границы массива");
//        }
//        System.out.println("После оператора catch");


        //Пример необработки исключения
//        int nums[] = new int[4];
//        nums[6] = 10;


        //Обработка исключения не прерывающего работу программы
//        int n1[] = {8, 6, 24, 10, 36};
//        int n2[] = {4, 0, 8, 0, 12};
//        for (int i = 0; i < n1.length; i++) {
//            try {
//                System.out.println(n1[i] / n2[i]);
//            } catch (ArithmeticException e) {
//                System.out.println("Деление на 0");
//            }
//        }


        //Обработка различных типов исключений не прерывающего работу программы
//        int n1[] = {8, 6, 24, 10, 36, 48, 55};
//        int n2[] = {4, 0, 8, 0, 12};
//        for (int i = 0; i < n1.length; i++) {
//            try {
//                System.out.println(n1[i] + " / " + n2[i] + " = " + n1[i] / n2[i]);
//            } catch (ArithmeticException e) {
//                System.out.println(n1[i] + " / " + n2[i] + " = " + "Деление на 0");
//            } catch (ArrayIndexOutOfBoundsException e){
//                System.out.println("Разное количество элементов двух массивов");
//            }
//        }


        //Обработка различных типов исключений не прерывающего работу программы, с использованием исключений генерируемых подклассами  throwable/exception
//        int n1[] = {8, 6, 24, 10, 36, 48, 55};
//        int n2[] = {4, 0, 8, 0, 12};
//        for (int i = 0; i < n1.length; i++) {
//            try {
//                System.out.println(n1[i] + " / " + n2[i] + " = " + n1[i] / n2[i]);
//            } catch (ArithmeticException e) {
//                System.out.println(n1[i] + " / " + n2[i] + " = " + "Деление на 0");
//            } catch (Exception e) {
//                System.out.println("Исключение, но неизвестно какое");
//            }
//        }


        // Вложенные блоки try
//        int n1[] = {8, 6, 24, 10, 36, 48, 55};
//        int n2[] = {4, 0, 8, 0, 12};
//
//        try {
//            for (int i = 0; i < n1.length; i++) {
//                try {
//                    System.out.println(n1[i] + " / " + n2[i] + " = " + n1[i] / n2[i]);
//                } catch (ArithmeticException e) {
//                    System.out.println(n1[i] + " / " + n2[i] + " = " + "Деление на 0");
//                }
//            }
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Разное количество элементов двух массивов");
//        }


//        //генерирование исключение throw
//        try {
//            System.out.println("До оператора throw");
//            throw new ArithmeticException();
//        } catch (ArithmeticException e) {
//            System.out.println("Исключение перехвачено");
//        }
//        System.out.println("После блока try/catch");


//        // Повторное генерирование исключений throw
//        try {
//            Second.getException();
//        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Ошибка");
//        }


        //Использование ключевого слова throws
        char ch;
        try{
            ch = promt ("enter a letter");
        }
        catch (IOException e){
            System.out.println("proizoshlo iskluchenie vvoda-vivoda");
            ch = 'X';
        }
        System.out.println("vi najali klavishu " + ch);


    }

    static class throwsShow {
        public static char promt (String str)
                throws IOException {
            System.out.println(str+ ": ");
            return (char) System.in.read();
        }
    }
}


// Повторное генерирование исключений throw
//class Second {
//    public static void getException() {
//        int n1[] = {8, 6, 24, 10, 36, 48, 55};
//        int n2[] = {4, 0, 8, 0, 12};
//
//        for (int i = 0; i < n1.length; i++) {
//            try {
//                System.out.println(n1[i] + " / " + n2[i] + " = " + n1[i] / n2[i]);
//            } catch (ArithmeticException e) {
//                System.out.println(n1[i] + " / " + n2[i] + " = " + "Деление на 0");
//            } catch (ArrayIndexOutOfBoundsException e) {
//                System.out.println("Разное количество элементов двух массивов");
//                throw e;
//            }
//        }
//    }
//}