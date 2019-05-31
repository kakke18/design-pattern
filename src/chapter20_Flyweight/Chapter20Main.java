package chapter20_Flyweight;

public class Chapter20Main {
    private static BigString[] bsarray = new BigString[1000];

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java Main digits");
            System.out.println("Example: java Main 1212123");
            System.exit(0);
        }

//        BigString bs = new BigString(args[0]);
//        bs.print();

        /*-- kadai20-1 ---*/
//        BigString bs;
//        bs = new BigString(args[0], false);
//        System.out.println("----------Unshared----------");
//        bs.print();
//
//        bs = new BigString(args[0], true);
//        System.out.println("-----------Shared-----------");
//        bs.print();

        /*-- kadai20-2 ---*/
        System.out.println("共有した場合: ");
        testAllocation(true);
        System.out.println("共有しない場合: ");
        testAllocation(false);

    }

    /*-- kadai20-2 ---*/
    public static void testAllocation(boolean shared) {
        for (int i = 0; i < bsarray.length; i++) {
            bsarray[i] = new BigString("1212123", shared);
        }
        showMemory();
    }

    public static void showMemory() {
        Runtime.getRuntime().gc();
        long used = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println(" 使用メモリ = " + used);
    }
}
