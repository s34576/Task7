public class Car extends Vehicle {
    private int numberOfSeats;
    public void getNumberOfSeats() {
        System.out.println("Number of Seats in Car: " + numberOfSeats);
    }
    @Override
    public void start()
    {
       // super.start();
        System.out.println("Car started");
    }
    @Override
    public void stop()
    {
        //super.stop();
        System.out.println("Car stopped");
    }

}
