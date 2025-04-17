public class Main {
    public static void main(String[] args) {
       Car car = new Car();
       car.start();
       car.stop();
       car.getNumberOfSeats();
        System.out.println("________________________");
        Feline feline = new Feline();
        Animal animal = new Animal();

       Lion lion = new Lion();
       feline.roam();
        animal.makeNoise();
       lion.makeNoise();

       Cat cat = new Cat();
       cat.makeNoise();

       Canine canine = new Canine();
       canine.roam();
        animal.makeNoise();
       Wolf wolf = new Wolf();
       wolf.makeNoise();

       Dog dog = new Dog();
       dog.makeNoise();



    }
}