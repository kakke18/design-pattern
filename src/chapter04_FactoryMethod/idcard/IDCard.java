package chapter04_FactoryMethod.idcard;

import chapter04_FactoryMethod.framework.Product;

public class IDCard extends Product {
    /*--- ArrayListを用いた実装 ---*/
//    private String owner;
//    IDCard(String owner) {
//        System.out.println(owner + "のカードを作ります。");
//        this.owner = owner;
//    }
//
//    @Override
//    public void use() {
//        System.out.println(owner + "のカードを使います。");
//    }
//
//    public String getOwner() {
//        return owner;
//    }

    /*--- HashMapを用いた実装 ---*/
    private String owner;
    private int serial;
    IDCard(String owner, int serial) {
        System.out.println(owner + "（" + serial + "）" + "のカードを作ります。");
        this.owner = owner;
        this.serial = serial;
    }

    @Override
    public void use() {
        System.out.println(owner + "（" + serial + "）" + "のカードを使います。");
    }

    public String getOwner() {
        return owner;
    }

    public  int getSerial() {
        return serial;
    }
}
