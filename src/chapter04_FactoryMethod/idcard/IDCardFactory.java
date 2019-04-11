package chapter04_FactoryMethod.idcard;

import chapter04_FactoryMethod.framework.Factory;
import chapter04_FactoryMethod.framework.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

public class IDCardFactory extends Factory {
    /*--- ArrayListを用いた実装 ---*/
//    private List owners = new ArrayList();
//
//    @Override
//    protected Product createProduct(String owner) {
//        return new IDCard(owner);
//    }
//
//    @Override
//    protected void registerProduct(Product product) {
//        owners.add(((IDCard)product).getOwner());
//    }
//
//    public List getOwners() {
//        return owners;
//    }

    /*--- HashMapを用いた実装 ---*/
    private HashMap database = new HashMap();
    private int serial = 100;

    @Override
    protected synchronized Product createProduct(String owner) {
        return new IDCard(owner, serial++);
    }

    @Override
    protected void registerProduct(Product product) {
        IDCard card = (IDCard)product;
        database.put(new Integer(card.getSerial()), card.getOwner());
    }
}
