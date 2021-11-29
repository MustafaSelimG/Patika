public class Notebook {
    private String brandName;
    private int brandId;

    private int id;
    private String name;
    private double price;
    private double discount;
    private int stock;
    private int storage;
    private double size;
    private int ram;
    private String color;

    public Notebook(String brandName, int brandId, int id, String name, double price, double discount, int stock, int storage, double size, int ram, String color) {
        this.brandName = brandName;
        this.brandId = brandId;
        this.id = id;
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.stock = stock;
        this.storage = storage;
        this.size = size;
        this.ram = ram;
        this.color = color;
    }

    public String toString(){
        return getBrandName()+" - "
                +getName() +"\t\t"+" | "
                +getId() +"\t\t"+" | "
                +getTotal() +"TL \t\t"+" | "
                +getStorage() +"\t\t"+" | "
                +getSize()+"\t\t"+" | "
                +getRam()+"\t\t"+" | "
                +getColor()+"\t\t"+" | "
                +getStock();
    }

    public double getTotal(){
        return this.price-(this.price*this.discount/100);
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
