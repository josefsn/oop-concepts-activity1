
public class Driver
{
    public String name;
    public boolean driving;
    public Car currentCar;

    public Driver(String name){
        this.name = name;
        driving = false;
        System.out.println(name + " is a new driver.");
    }

    public void enterCar(Car car){
        if (currentCar != null){
            System.out.println(name + " is already inside the " + currentCar.name + "!!!");
            System.out.println("Exit the " + currentCar.name + " before entering another one!!!");
        }
        else {
            currentCar = car;
            currentCar.driver = this;
            System.out.println(name + " just entered the " + currentCar.name + "!!!");
        }
    }
    
    public void exitCar(){
        if (currentCar.moving){
            System.out.println(name + " can't exit the " + currentCar.name + " becaus it's moving!!!");
        }
        else {
            System.out.println(name + " exited the " + currentCar.name + ".");
            currentCar = null;
        }
    }
}
