package CoR;

public abstract class Handler {
    private Handler successor;

    public void setSuccersor(Handler s) {
        successor = s;
    }

    public void processRequest(PayRise request) {
        if (successor != null) {
            successor.processRequest(request);
        }
    }
}
