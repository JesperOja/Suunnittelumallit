package CoR;

public class CEO extends Handler {

    public void processRequest(PayRise request) {
        System.out.println(
                "CEO would like to discuss with you about your pay rise request of "
                        + request.getRise() + "%");

    }
}
