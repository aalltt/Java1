/*Еще пример по передачи объектов в метод
Написать метод swap, реализующий обмен содержиым между двумя экземплярами
 */

package Shildt6;

public class Test4 {
    int a;

    public Test4(int a) {
        this.a = a;
    }

    public void info() {
        System.out.println(a);
    }

    public void swap(Test4 t1, Test4 t2) {
        int j;
        j=t1.a;
        t1.a=t2.a;
        t2.a=j;

    }
}

class Main {
    public static void main(String[] args) {
        Test4 ob1 = new Test4(1);
        Test4 ob2 = new Test4(2);
        ob1.info();
        ob2.info();
        System.out.println();

        //Меняем объекты, подумать как вызывать swap для каждого экземпляра
        ob1.swap(ob1, ob2);
        ob2.swap(ob1, ob2);
        ob1.swap(ob1, ob2);

        ob1.info();
        ob2.info();

    }
}

