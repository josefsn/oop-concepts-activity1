
public class Car
{
    public String name;
    public boolean moving;
    public int direction;
    public Driver currentDriver;

    public Car(String name){
        this.name = name;
        moving = false;
        direction = 0;
    }

    public void move(){
        move(true);
    }
    
    public void move(boolean forward){
        if (moving) {
            System.out.println("The " + name + " is already moving!!!");
        }
        else if (currentDriver == null){
            System.out.println("The " + name + " can't move without a driver!!!");
        }
        else {
            moving = true;
            if (!forward)
                direction += 180;
            showMovement();
        }
    }
    
    public void stop(){
        if (!moving) {
            System.out.println("The " + name + " is not moving!!!");
        }
        else {
            moving = false;
            showMovement();
        }
    }
    
    public void turnLeft(){
        if (!moving) {
            System.out.println("The " + name + " can't turn left before start moving!!!");
        }
        else if (currentDriver == null){
            System.out.println("The " + name + " can't turn left without a driver!!!");
        }
        else {
            direction += 90;
            showMovement();
        }
    }
    
    public void turnRight(){
        if (!moving) {
            System.out.println("The " + name + " can't turn right before start moving!!!");
        }
        else if (currentDriver == null){
            System.out.println("The " + name + " can't turn right without a driver!!!");
        }
        else {
            direction -= 90;
            showMovement();
        }
    }
    
    private void showMovement(){
        if (!moving){
            System.out.println("The " + name + " is not moving.");
        }
        else {
            switch(direction % 360){
                case 0:
                    System.out.println(currentDriver.name + " is driving the " + name + " and is moving east.");
                    break;
                case -270: case 90:
                    System.out.println(currentDriver.name + " is driving the " + name + " and is moving north.");
                    break;
                case -180: case 180:
                    System.out.println(currentDriver.name + " is driving the " + name + " and is moving west.");
                    break;
                case -90: case 270:
                    System.out.println(currentDriver.name + " is driving the " + name + " and is moving south.");
                    break;
            }
        }
     }
}
