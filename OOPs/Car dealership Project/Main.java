import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        String[] parts = {"tyres", "keys"};
        Scanner sc = new Scanner(System.in);
        Car cars[] = new Car[] {
                new Car("Nissan", 5000, 2007, "Yellow", new String[] { "tyres", "keys" }),
                new Car("Dodge", 8000, 2000, "Blue", parts),
                new Car("Nissan", 5000, 2007, "orange", parts),
        };

        Dealership dealership = new Dealership(cars);

        System.out.println("\n ****** JAVA DEALERSHIP! ****** \n");
        System.out.print("Welcome! Enter the type of car you're looking for: ");
        // pick up make
        String make = sc.nextLine();
        System.out.print("Enter your budget: ");
        // pick up budget
        int budget = sc.nextInt();

        int result = dealership.search(make, budget);

        System.out.println(result);
        if(result == 404){
            System.out.println("Feel free to browse through our collection of cars. \n");
            System.out.println(dealership);
        }else{
            sc.nextLine();
            String userInput = sc.nextLine();
            if(userInput.equalsIgnoreCase("yes"))
                dealership.sell(result);
        }


        // test codes 

        // Car nissan = new Car("Nissan", 5000, 2007, "Yellow", parts);

        // Car dodge = new Car("Dodge", 8000, 2000, "Blue", parts);

        // Car nissan2 = new Car(obj1);

      


        // Car obj2 = obj1; //this will make the obj2 change the obj1 value, not do

        // obj1.make = "Nissan";
        // obj1.price = 340000.23;
        // obj1.year = 2007;
        // obj1.color = "Red";
        // obj1.passport = new String[] { obj1.make,  obj1.color};

        // System.out.println(obj1.getMake());
        // System.out.println(obj1.getPrice());
        // System.out.println(obj1.getYear());
        // System.out.println(obj1.getColor());
        // System.out.println(Arrays.toString(obj1.passport));
        // System.out.println("The car make of obj1: "+obj1.getMake() + "the price is : "+ obj1.getPrice()+"the year of make is"+obj1.getYear()+"the color of the car: "+obj1.getColor());
        // System.out.println("The car make of obj2: " + obj2.getMake() + "the price is : " + obj2.getPrice()
        //         + "the year of make is" + obj2.getYear() + "the color of the car: " + obj2.getColor());

        // obj1.setColor = "Blue";

        // obj1.drive();
        // obj2.drive();
        // System.out.println(Arrays.toString(obj1.getParts()));
        // System.out.println(Arrays.toString(obj2.getParts()));
        // obj2.setParts(new String[] {"filter"});
        // System.out.println(Arrays.toString(obj2.getParts()));
        // String[] randomArray = obj1.getParts();
        // randomArray[1] = "Keys";
        // System.out.println(Arrays.toString(obj1.getParts()));//not clear
        // System.out.println(Arrays.toString(obj2.getParts()));

        // System.out.println(obj1.toString());
        // System.out.println(obj2);

        // dealership.setCar(nissan, 0);
        // dealership.setCar(dodge, 1);
        // Dealership dealership = new Dealership(cars);

        // for(int i=0;i<cars.length;i++){
        //     dealership.setCar(cars[i],i);
        // }

        // Car newCar = dealership.getCar(0);
        // System.out.println(newCar);

        // dealership.sell(1);

        // // Car newCar1 = dealership.getCar(2);
        // // System.out.println(newCar1);
        // System.out.println(dealership.search("Dodge", 80000));

        // System.out.println(dealership);
        
        // Dealership dealership = new Dealership(cars);
        // System.out.println(dealership);
       


    }
    
}
