import java.util.Arrays;

public class Car {
    private String make; // Fields should always be private. The field should never be left public otherwise it can be modified in the main 
    private double price;
    private int year;
    private String color;
    private String[] parts;

    // constructor
    public Car(String make, double price, int year, String color, String[] parts){
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
        this.parts = Arrays.copyOf(parts, parts.length); //this is necessary, because changing the parts field from outside will also change the array values.
    }

    public Car(Car source){
        this.make = source.make;
        this.price = source.price;
        this.year = source.year;
        this.color= source.color;
        this.parts = Arrays.copyOf(source.parts, source.parts.length);
    }

    public String getMake(){
        return this.make;
    }

    public double getPrice(){
        return this.price;
    }

    public int getYear(){
        return this.year;
    }

    public String getColor(){
        return this.color;
    }

    public String[] getParts(){
        return Arrays.copyOf(this.parts, this.parts.length);
    }

    public void setMake(){
        this.make = make;
    }
    public void setPrice(){
        this.price = price;
    }
    public void setYear(){
        this.year = year;
    }
    public void setColor(){
        this.color = color;
    }

    public void setParts(String[] parts){
        this.parts = Arrays.copyOf(parts, parts.length);
    }

    public String toString(){
        return "Make: " + this.make + ".\n" +
                "Price: " + this.price + ".\n"+
                "Year: " + this.year + ".\n" + 
                "Color: " + this.color + ".\n"+
                "Parts: " + Arrays.toString(parts) + ".\n";
    }

    
    public void drive(){
        System.out.println("You bought a beautiful "+ this.year + " " +  this.color+ " " + this.make + " for "+ this.price);
        System.out.println("Drive to the nearest exit point.");
    }

}
