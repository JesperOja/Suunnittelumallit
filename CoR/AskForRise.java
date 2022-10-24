package CoR;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AskForRise {
    public static void main(String[] args){
        CEO ceo = new CEO();
        DepartmentHead head = new DepartmentHead();
        Manager manager = new Manager();
        manager.setSuccersor(head);
        head.setSuccersor(ceo);

        try{
            
            System.out.println("Enter the pay rise % you are asking.");
            System.out.print(">");
            double d = Double.parseDouble(new BufferedReader(
            new InputStreamReader(System.in)).readLine());

            manager.processRequest(new PayRise(d));
        }catch(Exception e){
            System.exit(1);
        }
    }
}
