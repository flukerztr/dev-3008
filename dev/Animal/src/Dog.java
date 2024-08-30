public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(name + " runs");
    }

    @Override
    public void sound() {
        System.out.println(name + "barks");
    }

    
}
