public class Book extends Item{
    private int isbn_number;
    private String author;
    //getters
    public int getIsbn_number() {
        return isbn_number;
    }
    public String getAuthor(){
        return author;
    }
    //setters
    public void setIsbn_number(int newIsbn_number) {
        isbn_number=newIsbn_number;
    }
    public void setAuthor(String newAuthor) {
        author=newAuthor;
    }
    //Constructor
    public void newBook(){}
    //Overloaded Constructor
    public void newBook(int number,String name, String title){
        setIsbn_number(number);
        setAuthor(name);
        setTitle(title);
    }
    //new getListing()
    public String getListing(){
        return "Book Name - "+getTitle()+"\nAuthor - "+getAuthor()+"\nISBN # - "+getIsbn_number();
    }
}
