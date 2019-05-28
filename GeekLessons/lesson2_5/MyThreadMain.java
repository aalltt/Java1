package lesson2_5;
/*
Дан массив. Сравнить время выполнения двух методов.
Первый метод заполняет массив единицами, далее заполняет массив значениями, вычисленными по формуле
Второй метод заполняет массив по формуле с ипользованием потоков
 */

public class MyThreadMain {
    static final int size = 10000000;
    static final int h = size / 2;

    public static void main(String[] args) {
        FirstArr(size);
        SecondArr(h);
    }

    public static void FirstArr(int size) {
        float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        long a = System.currentTimeMillis();
        System.out.println("Время заполнения массива единицами " + a);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("Время заполнения массива значениями, вычисленными по формуле "+ System.currentTimeMillis());
        System.out.println("Разница во времени " + (System.currentTimeMillis() - a));
    }

    public static void SecondArr(int h) {
        float[] arr = new float[size];
        float[] a1 = new float[h];
        float[] a2 = new float[h];
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < a1.length; i++) {
                    a1[i] = (float) (a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < a2.length; i++) {
                    a2[i] = (float) (a2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);
        System.out.println("Время заполнения массива значениями, вычисленными по формуле, с использованием потоков " + System.currentTimeMillis());
    }

}



