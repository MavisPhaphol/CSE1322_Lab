//Use Item, Book, Periodical
import java.util.*;
public class Lab5 {
    public static void main (String[]args){
        Scanner userInput=new Scanner(System.in);
        Item[] items=new Item[5];
        for (int index=0;index<items.length;index++){
            System.out.println("Please enter B for Book or P for Periodical");
            String userPick=userInput.nextLine();
            if (userPick.equals("B")){
                Book book=new Book();
                //book title
                System.out.println("Please enter the name of the Book");
                String title=userInput.nextLine();
                book.setTitle(title);
                //book author
                System.out.println("Please enter the author of the Book");
                String author=userInput.nextLine();
                book.setAuthor(author);
                //book isbn
                System.out.println("Please enter the ISBN of the Book");
                int number=userInput.nextInt();
                book.setIsbn_number(number);
                if (items[index]!=null){
                    index+=1;
                }
                items[index]=book;
            }
            else if (userPick.equals("P")){
                Periodical periodical=new Periodical();
                if (items[index]!=null){
                    index+=1;
                }
                //periodical title
                System.out.println("Please enter the name of Periodical");
                String name=userInput.nextLine();
                periodical.setTitle(name);
                //periodical issue number
                System.out.println("Please enter the issue number");
                int issue=userInput.nextInt();
                periodical.setIssueNum(issue);
                items[index]=periodical;
            }
            userInput.nextLine();
        }
        System.out.println("Your Items:");
        for (int number=0;number< items.length;number++){
            System.out.println(items[number].getListing());
            System.out.println();
        }
    }
}
