
package first_package;

public class ProductClass {
    private String name;
    private int id;
    private String date;
    private float price;
    private byte[] img;
    private int stock;
    
    public ProductClass() {
    }
    
    ProductClass(int Id, String Name, Float Price, String Date, byte[] img,int stock) {
        this.name = Name;
        this.id = Id;
        this.date = Date;
        this.price = Price;
        this.img = img;
        this.stock = stock;
    }
    
    public int getStock(){
     return stock;
    }

    public String getName() {
        return name;
    }

    public byte[] getImg() {        
        return img;
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public float getPrice() {
        return price;
    }        
}
