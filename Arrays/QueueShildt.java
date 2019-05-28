package Arrays;

//Шилдт. Алгоритм очереди (для просмотра работы алгоритма в Debug и выполнения задания ***)

class Queue {
    private char q[]; // массив для хранения элементов очереди
    private int putloc, getloc; // индексы для вставки и извлечениям элементов очереди

    Queue(int size) {
        q = new char[size]; // выделить память для очереди
        putloc = getloc = 0;
    }

    // Поместить символ в очередь
    void put(char ch) {
        if (putloc == q.length) {
            System.out.println(" -- Очередь заполнена.");
            return;
        }
        q[putloc++] = ch;
    }

    // Извлечь символ из очередми
    char get() {
        if (getloc == putloc) {
            System.out.println(" -- Очередь пуста");
            return (char) 0;
        }

        return q[getloc++];
    }
}

class QueueShildt {
    public static void main(String args[]) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(8);
        char ch;
        int i;

        System.out.println("использование bigQ для сохранения алфавита");
        // Поместить буквенные символы в bigQ
        for (i = 0; i < 26; i++)
            bigQ.put((char) ('A' + i));

        // Извлечь буквенные символы из bigQ для сохранения алфавита
        System.out.print("Содержимое bigQ: ");
        for (i = 0; i < 26; i++) {
            ch = bigQ.get();
            if (ch != (char) 0) System.out.print(ch);
        }

        System.out.println("\n");


        System.out.println("Использование smallQ для генерации ошибок");
        // Now, use smallQ to generate some errors
        for (i = 0; i < 8; i++) {
            System.out.print("Попытка сохранения " +
                    (char) ('Z' - i));

            smallQ.put((char) ('Z' - i));

            System.out.println();
        }
        System.out.println();

        // more errors on smallQ
        System.out.print("Содержимое smallQ: ");
        for (i = 0; i < 8; i++) {
            ch = smallQ.get();
            if (ch != (char) 0) System.out.print(ch);
        }
    }
}
