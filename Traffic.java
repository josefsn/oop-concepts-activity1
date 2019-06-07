public class Traffic
{
    public static void main(String[] args) {
        Driver driver1 = new Driver("José");
        Car car1 = new Car("Ferrari");
        
        driver1.enterCar(car1);
        driver1.currentCar.turnLeft();
        driver1.currentCar.stop();
        driver1.currentCar.move();
        driver1.currentCar.turnLeft();
        driver1.currentCar.turnLeft();
        driver1.currentCar.turnRight();
        driver1.currentCar.turnLeft();
        driver1.exitCar();
        driver1.currentCar.stop();
        driver1.exitCar();
    }
}
