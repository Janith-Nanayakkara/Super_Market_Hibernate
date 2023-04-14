package lk.ijse.supermarket;

import lk.ijse.supermarket.entity.Item;
import lk.ijse.supermarket.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AppInitializer {
    public static void main(String[] args) {
        Item item1 = new Item();
        item1.setCode("I001");
        item1.setDescription("Biscuit");
        item1.setPrice(100);
        item1.setQty(5);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        //session.save(item1);
        session.update(item1);
        transaction.commit();
        session.close();

    }
}
