//use StockItem file
import java.util.Scanner;
public class Lab2 {
    public static void main(String[] args) {
        //Scanner
        Scanner userInput = new Scanner(System.in);
        //milk bread stock
        StockItem milk = new StockItem("1 Gallon of Milk", 3.60f, 15);
        StockItem bread = new StockItem("1 Loaf of Bread", 1.98f, 30);
        int userChoice = 0;
        while (userChoice != 8) {
            //presented menu
            System.out.println("1. Sold One Milk\n2. Sold One Bread\n3. Change price of Milk\n4. Change price of Bread\n5. Add Milk to Inventory\n6. Add Bread to Inventory\n7. See Inventory\n8. Quit");
            userChoice = userInput.nextInt();
            //1 and 2 need lowerQuantity. 5 and 6 need raisingQuantity
            if (userChoice==1){//one milk sold
                milk.lowerQuantity();
            }
            else if (userChoice==2) {//one bread sold
                bread.lowerQuantity();
            }
            else if (userChoice==3){//adjusting price for milk
                System.out.println("What is the new price for Milk?");
                float price=userInput.nextFloat();
                milk.setPrice(price);
            }
            else if (userChoice==4){//adjusting price for bread
                System.out.println("What is the new price for Bread?");
                float price=userInput.nextFloat();
                bread.setPrice(price);
            }
            else if (userChoice==5){//adding milk stock
                System.out.println("How many milk did we get?");
                int addingQuantity=userInput.nextInt();
                milk.RaisingQuantity(addingQuantity);
            }
            else if (userChoice==6){//adding bread stock
                System.out.println("How many bread did we get?");
                int addingQuantity=userInput.nextInt();
                bread.RaisingQuantity(addingQuantity);
            }
            else if (userChoice==7){//see inventory
                System.out.println("Milk: "+milk.toString());
                System.out.println("Bread: "+bread.toString());
            }
        }
    }
}
