package C20160625_FlowControl.Conditionals;

public class Switch2 {
    public static void main(String[] args) {

        String month = "JANUARY";

        int monthDays;

        switch (month.toLowerCase()){
            case "january":
                System.out.println("Is january");
                break;

            case "march":
                System.out.println("Is march");
                break;

            default:
                monthDays = 0;
                System.out.println("The month is not valid");
        }
    }
}
