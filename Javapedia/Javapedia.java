
import java.util.Scanner;

public class Javapedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n**********Javapedia**********");
        System.out.println("How many historical figures will you register?");

        int people = scan.nextInt();

        String[][] database = new String[people][3];

        // System.out.println("Database length: "+ database.length); // return number of rows 
        scan.nextLine();
        for(int i=0;i<database.length;i++){
            System.out.println("\n\tFigure " + (i+1)); 

            System.out.print("\t - Name: ");
            database[i][0] = scan.nextLine();
        
            System.out.print("\t - Date of birth: ");
            database[i][1] = scan.nextLine();

            System.out.print("\t - Occupation: ");
            database[i][2] = scan.nextLine();

            System.out.print("\n");
            
        }

        
        System.out.println("These are the values you stored:"); 
    
        print2DArray(database);
        System.out.print("\nWho do you want information on? ");  
        
        String user_input = scan.nextLine();

        for(int i=0;i<database.length;i++){
            if(database[i][0].equals(user_input)){
                    System.out.println("\t Name: "+ database[i][0]);
                    System.out.println("\t Date of Birth: "+ database[i][1]);
                    System.out.println("\t Occupation: "+ database[i][2]);
            }
        }      
        scan.close();
    }


     public static void print2DArray(String[][] array){
         for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j] + " " );
            }
            System.out.println();
         }
     }

}
