
import java.util.Arrays;
import java.util.Scanner;
public class Dealership {
    private Car[] cars;
    Scanner sc= new Scanner(System.in);
    public Dealership(Car[] cars){
        this.cars =new Car[cars.length];
        for (int i = 0; i < cars.length; i++) {
            this.cars[i] = new Car(cars[i]);
        }
    }

    public void setCar(Car car, int index){
        this.cars[index] = new Car(car);
    }
    public Car getCar(int index){
        return new Car(this.cars[index]);  //this will create a copy of the car object so that outside value can't be changed
    }

    public void sell(int index){
        this.cars[index].drive();
        this.cars[index]= null;
    }

    public int search(String make, int budget){
        for(int i=0;i<this.cars.length;i++){
            if(this.cars[i]==null){
                continue;
            }else if(this.cars[i].getMake().equalsIgnoreCase(make) && this.cars[i].getPrice()<=budget){
                System.out.println("\n We found one in spot "+ i + "\n" + this.cars[i].toString()+ "\n If  you interested, type yes ");
                return i;
            }
        }
        System.out.println("Your search didn't match any result.");
        return 404;
    }

    public String toString(){
        String temp="";
        for(int i=0;i<this.cars.length;i++){
            temp += "Parking Spot: " + i + "\n";
            if(this.cars[i]==null){
                temp += "Empty for that car spot\n";
            }else
                temp += this.cars[i].toString() + "\n"; 
        }
        return temp;
    }
}


