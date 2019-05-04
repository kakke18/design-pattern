package chapter10_Strategy.question4;

public class Chapter10Main2 {
    public static void main(String[] args) {
        String[] data = {
                "Dumpty", "Bowman", "Carrol", "Elfland", "Alice",
        };
//        SortAndPrint sap = new SortAndPrint(data, new SelectionSorter());
        /*--- 問題10-4 ---*/
        SortAndPrint sap = new SortAndPrint(data, new QuickSorter());
        sap.execute();
    }
}
