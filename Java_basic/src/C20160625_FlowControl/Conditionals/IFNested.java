package C20160625_FlowControl;

public class IFNested {
    public static void main(String[] args) {

        boolean user = false;
        boolean password = true;
        boolean active = true;

        if (active){
            if (password){
                if (user){
                    System.out.println("Welcome!");
                }else {
                    System.out.println("Inactive account");
                }
            }else {
                System.out.println("Correct password");
            }
        }else {
            System.out.println("Add correct password");

        }

    }
}
