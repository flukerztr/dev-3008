public class Fish extends Animal {
    public Fish(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(name + " swims");
    }

    @Override
    public void sound() {
        System.out.println(name + " cannot make sound");
    }

}
