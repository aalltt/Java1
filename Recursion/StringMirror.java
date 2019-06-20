package Recursion;
/*Вывести строку в обратном порядке*/

class StringMirror {
    String tt;

    public StringMirror(String tt) {
        this.tt = tt;
    }

    void Mirror(int i) {
        if (i != tt.length() - 1)
            Mirror(i + 1);
        System.out.print(tt.charAt(i));
    }
}

class StringMirrorMain {
    public static void main(String[] args) {
        StringMirror stm = new StringMirror("qwerty");
        stm.Mirror(3);
    }
}
