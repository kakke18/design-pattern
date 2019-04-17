package chapter05_Singlton;

public class TicketMaker {
    private int ticket = 1000;
    private static TicketMaker singlton = new TicketMaker();
    private TicketMaker() {}
    public static TicketMaker getInstance() {
        return singlton;
    }
    public synchronized int getNextTicketNumber() {
        return ticket++;
    }
}
