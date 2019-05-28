package lesson1_7;

public class Cat {
    private String name;
    private int appetite;
    boolean sitost = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public Cat(String name, int appetite, boolean sitost) {
        this.name = name;
        this.appetite = appetite;
        this.sitost = sitost;
    }

    public int getAppetite() {
        return appetite;
    }

    public String getName() {
        return name;
    }


    public void eat(Plate plate) {
        if (plate.getFood()<getAppetite()){
            System.out.println(name + " ne poel " + sitost);
        }
        else {
            plate.decreaseFood(appetite);
            sitost=true;
            System.out.println(name+ " poel " + sitost);
        }
     }


}
