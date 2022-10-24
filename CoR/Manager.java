package CoR;

public class Manager extends Handler{
    private final double ALLOWABLE = 2;
    
    public void processRequest(PayRise request){
        if(request.getRise() < ALLOWABLE){
            System.out.println(
                "Manager will approve your request for pay rise 0f "
                + request.getRise() + "%");
        }else{
            super.processRequest(request);
        }

    }
    
}
