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

        //save items
        session.save(item1);

        //update item
        //session.update(item1);

        //get items
       /* Item i1 = session.get(Item.class, "I001");
        System.out.println(i1);*/

       // delete items 1st patterns

     /*   Item i001 = session.get(Item.class, "I001");
        session.delete(i001);*/

        // delete items seconds pattens

  /*      Item item = new Item();
        item.setCode("I001");
        session.delete(item);
*/

        transaction.commit();
        session.close();

    }
}
