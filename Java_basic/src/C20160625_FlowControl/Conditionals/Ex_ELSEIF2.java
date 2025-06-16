package C20160625_FlowControl;

public class Ex_ELSEIF2 {
    public static void main(String[] args) {

        int note = 65;

        if (note >= 70 ) {
            System.out.println("Approved");            
        } else if (note >= 60) {
            System.out.println("Outstanding");
        } else if (note >= 50) {
            System.out.println("Good");
        } else {
            if (note >= 40) {
                System.out.println("Failed");
            }
        }
    }
}
