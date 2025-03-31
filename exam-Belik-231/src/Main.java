

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DataBase db = new DataBase();
        db.isConnection();
        db.createTable("shop");
        db.addTable("shop", 1, "Milk", 1400, "14.02.2005");
        db.addTable("shop", 2, "pateto", 500, "14.02.2005");
        db.addTable("shop", 3, "beer", 750, "14.02.2005");
        db.addTable("shop", 4, "egg", 350, "14.02.2005");
        db.addTable("shop", 5, "paper", 2556, "14.02.2005");
        db.addTable("shop", 6, "bread", 6780, "14.02.2005");
        db.addTable("shop", 7, "cheese", 3000, "14.02.2005");
        db.addTable("shop", 8, "tea", 100, "14.02.2005");
        db.addTable("shop", 9, "Meat", 780, "14.02.2005");
        db.addTable("shop", 10, "sugar", 300, "14.02.2005");
        db.selectTable("shop");
        db.summProducts("shop");

    }
}