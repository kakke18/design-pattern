package chapter14_ChainOfResponsibility;

public abstract class Support {
    private String name;
    private Support next;

    public Support(String name) {
        this.name = name;
    }

    public Support serNext(Support next) {
        this.next = next;
        return next;
    }

    public final void support(Trouble trouble) {
//        if (resolve(trouble)) {
//            done(trouble);
//        } else if (next != null) {
//            next.support(trouble);
//        } else {
//            fail(trouble);
//        }
        /*--- 14-1 ---*/
        for (Support obj = this; true; obj = obj.next) {
            if (obj.resolve(trouble)) {
                obj.done(trouble);
                break;
            } else if (obj.next == null) {
                obj.fail(trouble);
                break;
            }
        }
    }

    public String toString() {
        return "[" + name + "]";
    }

    protected abstract boolean resolve(Trouble trouble);

    protected void done(Trouble trouble) {
        System.out.println(trouble + " is resoleved by " + this + ".");
    }

    protected void fail(Trouble trouble){
        System.out.println(trouble + " cannot be resolved.");
    }
}
