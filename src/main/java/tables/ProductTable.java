package tables;

public class ProductTable {

    private int id ;
    private  String name;
    private String description;
    private String size;
    private double price;
    private int stock;
    private int category_id;


    public ProductTable(String _name, String _description, String _size, double _price,int _stock,int _category_id){
        name =_name;
        description =_description;
        size=_size;
        price=_price;
        stock=_stock;
        category_id=_category_id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public int getCategory_id() {
        return category_id;
    }
}
