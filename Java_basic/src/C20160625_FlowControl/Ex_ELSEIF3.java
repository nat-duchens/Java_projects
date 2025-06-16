package C20160625_FlowControl;

public class Ex_ELSEIF3 {
    public static void main(String[] args) {

        String user = "admin";
        String password = "<PASSWORD>";

        //With && (AND) both conditions must be met
        //With || (OR) only one conditions must to be met

        if (user.equals("admin") && password.equals("123")){
            System.out.println("Welcome!");
        } else {
            System.out.println("Enter password");
        }


        
    }
}
