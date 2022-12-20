
class Animal {
    private double weight;
    private int age;

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal() {
        this.weight = 0.0d;
        this.age = 0;
    }

    public String say() {
        return "хрю!";
    }
}

class Fox extends Animal{
    private String color;

    public String getColor() {
        return color;
    }

    public Fox(String color) {
        this.color = color;
    }
// научите лису говорить
}

public class Main {
    public static void main(String[] args) {
        Fox fox = new Fox("рыжий");
        fox.setWeight(5.93d);
        fox.setAge(5);
        System.out.println("Вес лисы - " + fox.getWeight());
        System.out.println("Возраст лисы - " + fox.getAge());
        System.out.println("Цвет лисы - " + fox.getColor());
        System.out.println("Лиса говорит - " + fox.say());
    }
}
