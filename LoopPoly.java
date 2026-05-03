abstract class Animal {
abstract void sound();
}
class Dog extends Animal {
    void sound() { System.out.println("Dog barks"); }
}
class Cat extends Animal {
    void sound() { System.out.println("Cat meows"); }
}
class AnimalLoopDemo {
    public static void main(String[] args) {
        Animal[] animals = { new Dog(), new Cat() };

        for (Animal a : animals) {
            a.sound();
        }
    }
}

