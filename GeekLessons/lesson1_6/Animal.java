package lesson1_6;

abstract class Animal implements AnimalAction {
    String name;
    int dlina_zabega;
    float visota_prizka;
    int dlina_zapliva;

    public Animal(String name, int dlina_zabega, float visota_prizka, int dlina_zapliva) {
        this.name = name;
        this.dlina_zabega = dlina_zabega;
        this.visota_prizka = visota_prizka;
        this.dlina_zapliva = dlina_zapliva;
    }

    void info() {
        System.out.println("Марафон бежит " + name);
    }

    @Override
    public boolean Run(int dlina_zabega_i) {
        if (dlina_zabega_i <= dlina_zabega)
            return true;
        else
            return false;
    }

    @Override
    public boolean Jump(float visota_prizka_i) {
        if (visota_prizka_i <= visota_prizka)
            return true;
        else
            return false;
    }

    @Override
    public boolean Swim(int dlina_zapliva_i) {
        if (dlina_zapliva_i <= dlina_zapliva)
            return true;
        else
            return false;
    }

}
