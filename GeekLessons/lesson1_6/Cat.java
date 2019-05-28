package lesson1_6;

public class Cat extends Animal {


    public Cat(String name, int dlina_zabega, float visota_prizka, int dlina_zapliva) {
        super(name, dlina_zabega, visota_prizka, dlina_zapliva);
    }

    public Cat(String name, int dlina_zabega, float visota_prizka) {
        super(name, dlina_zabega, visota_prizka, 40);
    }


    @Override
    public boolean Swim(int dlina_zapliva_i) {
        return false;
    }


}




