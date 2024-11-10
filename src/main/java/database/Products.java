package database;

import tables.ProductTable;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Products {
    static private String tableName = "products";
    public  Products(){
    }

    public void insertProduct(ProductTable productTable){
        String query = "INSERT INTO %s (name,description,size,price,stock,category_id) VALUES (\"%s\",\"%s\",\"%s\",%f,%d,%d)".formatted(tableName,productTable.getName(),productTable.getDescription(),productTable.getSize(),productTable.getPrice(),productTable.getStock(),productTable.getCategory_id());
        try {
            Dbconnection dbconnection = new Dbconnection();
            Connection connection = dbconnection.getConnection();
            Statement statement = connection.createStatement();
            boolean isInserted = statement.execute(query);
            showProductTable();

        } catch (Exception e){
            e.printStackTrace();
        }
        showProductTable();
    }
    static private void showProductTable(){
        String query = "SELECT * FROM %s".formatted(tableName);
        try {
            Dbconnection dbconnection = new Dbconnection();
            Connection connection = dbconnection.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            System.out.println(" product_id || name || description || size || price || stock || category_id ");
            while (resultSet.next()){
                System.out.printf("%s ||  %s || %s || %s || %f || %d || %d \n",
                        resultSet.getString("product_id"),
                        resultSet.getString("name"),
                        resultSet.getString("description"),
                        resultSet.getString("size"),
                        Double.parseDouble( resultSet.getString("price")),
                        Integer.parseInt( resultSet.getString("stock")),
                        Integer.parseInt( resultSet.getString("category_id")));
            }

        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public void deleteProductRow(ProductTable productTable){
        String query = "";
    }


}
