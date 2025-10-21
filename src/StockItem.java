//For Lab2
public class StockItem {
    String description;
    int ID=0;
    float price;
    int quantity;
    static int uniqueID=0;
    //default constructor
    StockItem(){
        description="";
        price=0;
        quantity=0;
    }
    //overload
    StockItem(String desc, float cost, int currentQuantity){
        description=desc;
        price=cost;
        quantity=currentQuantity;
        ID=uniqueID++;
    }
    //getters
    public String getDescription() {
        return description;
    }
    public int getID() {
        return ID;
    }
    public float getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    //setters

    public void setPrice(float price) {
        if (price<0){
            System.out.println("Error");
        }
        this.price = price;
    }
    //lower quantity
    public void lowerQuantity(){
        quantity-=1;
    }
    //raising quantity
    public void RaisingQuantity(int addingQuantity) {
        quantity+=addingQuantity;
    }
    @Override
    public String toString(){
        return "Item number: "+ID+" is "+description+" has price "+ price+" we currently have "+quantity+" in stock";
    }
}

