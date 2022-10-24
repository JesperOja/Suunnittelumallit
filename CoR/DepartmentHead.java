package CoR;

public class DepartmentHead extends Handler {
    private final double ALLOWABLE = 5;
    
    public void processRequest(PayRise request){
        if(request.getRise() < ALLOWABLE){
            System.out.println(
                "Head of Department will approve your request for pay rise 0f "
                + request.getRise() + "%");
        }else{
            super.processRequest(request);
        }

    }
}
