import database.Products;
import tables.ProductTable;

public class Main {

    public static void main(String[] args) {
        Products products = new Products();
        ProductTable productRow = new ProductTable("fhg","p_description","XL",123.79,1,1);
        products.insertProduct(productRow);

    }
}
