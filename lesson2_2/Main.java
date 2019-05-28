package lesson2_2;
/*
    1 Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
    2 Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение
MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
    3 В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и MyArrayDataException и вывести результат расчета.
*/

public class Main {
    public static void main(String[] args) {
        try {
            ArrGet.SumArr(new String[4][4]);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }
}

class MyArraySizeException extends Exception {
    String msg;

    public MyArraySizeException(String msg) {
        super(msg);
    }
}

class MyArrayDataException extends Exception {
    int aa, vv;
    String msg2;

    public MyArrayDataException(String msg2, int aa, int vv) {
        super(msg2);
        this.aa = aa;
        this.vv = vv;
    }
}

class ArrGet {
    public static void SumArr(String arr[][]) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr.length < 4) throw new MyArraySizeException("Нужен массив 4 на 4");
                count++;
                arr[i][j] = String.valueOf(count);
               //Здесь можно раскоментить строку, чтобы в массив добавить нечто, что нельзя преобразовать в int, чтобы убедиться, что исключение по ТЗ работает
                //arr[1][1] = "ff";
                System.out.print(arr[i][j] + " ");
                try {
                    sum = sum + Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Сумма не может быть подсчитана, т.к. данный символ не удалось преобразовать в int", i, j);
                }
            }
            System.out.println();
        }
        System.out.println(sum);
    }
}

