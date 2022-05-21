import java.util.Scanner;

public class Blackjack {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see..");
        System.out.println("..Ready? Press anything to begin!");
        
        scan.nextLine();
        
        int card1 = drawRandomCard();
        int card2 = drawRandomCard();
        System.out.println("You get a \n" + cardString(card1) + "\n and a \n " + cardString(card2));



        int myCardSum = Math.min(card1,10) + Math.min(card2,10) ;
        System.out.println("Your total is: " + myCardSum);

      

        int dealerCard1 = drawRandomCard();
        int dealerCard2 = drawRandomCard();
        System.out.println("The dealer shows \n" + cardString(dealerCard1) + " \n and has a card facing down \n" + faceDown());
        int sumdealerCard = Math.min(dealerCard1,10) + Math.min(dealerCard2,10);
        System.out.println("The dealers total is hidden.");

        boolean gameOn = true;

        System.out.print("Would you like to Hit or Stay: ");
        scan.nextLine();

        while(gameOn){

            System.out.print("Please mention Hit or Stay: ");
            String playerInput = scan.next();

            if (playerInput.equals("hit")){
                int newcard = drawRandomCard();
                myCardSum += Math.min(newcard,10);
                System.out.println("You get a \n"+ cardString(newcard));
                System.out.println("Your new total is: "+ myCardSum);
                if (myCardSum>21){
                    System.out.println("Bust! You Lose... ");
                    break;
                }
            }
            if (playerInput.equals("stay")){
                System.out.println("Dealer's Turn");
                System.out.println("The dealer cards are \n" + cardString(dealerCard1) + " \n and  \n" + cardString(dealerCard2));
                while (sumdealerCard<17){
                    int delalercard = drawRandomCard();
                    System.out.println("Dealer gets a \n" + cardString(delalercard));   
                    sumdealerCard += Math.min(delalercard,10);
                }

                System.out.println("Dealer's total is: "+ sumdealerCard);
                if (sumdealerCard>21){
                    System.out.println("Bust! Dealer loses");
                    System.exit(0);
                }

                if(myCardSum > sumdealerCard){
                    System.out.println("You Win !");
                }
                else {
                    System.out.println("Dealer Win !");
                }
                gameOn= false;
            }
            
        }
    
         scan.close();

    }

     public static int drawRandomCard(){
         double randomNumber = Math.random()*13;
         randomNumber +=1;
         int randomInt = (int) randomNumber;
        return randomInt; 
     }


    public static String cardString(int cardNumber){

        switch(cardNumber){

             case 1:
                return "   _____\n"+
                   "  |A _  |\n"+ 
                   "  | ( ) |\n"+
                   "  |(_'_)|\n"+
                   "  |  |  |\n"+
                   "  |____V|\n";
            
            case 2:
                return "   _____\n"+              
                    "  |2    |\n"+ 
                    "  |  o  |\n"+
                    "  |     |\n"+
                    "  |  o  |\n"+
                    "  |____Z|\n";
                
            case 3:
                return "   _____\n" +
                  "  |3    |\n"+
                  "  | o o |\n"+
                  "  |     |\n"+
                  "  |  o  |\n"+
                  "  |____E|\n";

            case 4:
                return "   _____\n" +
                   "  |4    |\n"+
                   "  | o o |\n"+
                   "  |     |\n"+
                   "  | o o |\n"+
                   "  |____h|\n";

            case 5:
                return "   _____ \n" +
                    "  |5    |\n" +
                    "  | o o |\n" +
                    "  |  o  |\n" +
                    "  | o o |\n" +
                    "  |____S|\n";

            case 6:
                return "   _____ \n" +
                    "  |6    |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  |____6|\n";

            case 7:
                return  "   _____ \n" +
                    "  |7    |\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |____7|\n";
                
            case 8:
                return "   _____ \n" +
                    "  |8    |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  |____8|\n";

            case 9:
                return "   _____ \n" +
                    "  |9    |\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |____9|\n";

            case 10:
                return "   _____ \n" +
                    "  |10  o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |___10|\n";

            case 11:
                return  "   _____\n" +
                    "  |J  ww|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o% |\n"+ 
                    "  | | % |\n"+ 
                    "  |__%%[|\n";

            case 12:
                return  "   _____\n" +
                    "  |Q  ww|\n"+ 
                    "  | o {(|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%O|\n";

            case 13:
                return "   _____\n" +
                    "  |K  WW|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%>|\n";

            default:
                return "Nothing";
        }
    }
    public static String faceDown() {
        return
        "   _____\n"+
        "  |     |\n"+ 
        "  |  J  |\n"+
        "  | JJJ |\n"+
        "  |  J  |\n"+
        "  |_____|\n";
    }
}
    

