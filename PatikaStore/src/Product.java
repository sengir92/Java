//Define abstract product class

public abstract class Product {
    private int id,discount,stock,ram,memory;
    private String name,brandName;
    private double price,screenSize;
//Create constructor method
    public Product(int id, String name, double price, String brandName, int memory, double screenSize, int ram) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.brandName = brandName;
        this.memory = memory;
        this.screenSize = screenSize;
        this.ram = ram;
    }
   //Getter and setter methods
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName() {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(int Price) {
        this.price = price;
    }
    public String getBrandName() {
        return brandName;
    }
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
    public int getMemory() {
        return memory;
    }
    public void setMemory(int memory) {
        this.memory = memory;
    }
    public double getScreenSize() {
        return screenSize;
    }
    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }
    public int getRam() {
        return ram;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }
    public int getDiscount() {
        return discount;
    }
    public void setDiscount(int discount) {
        this.discount = discount;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }


}
