package C20160625_FlowControl.Conditionals;

public class Switch {
    public static void main(String[] args) {

        int day = 1;
        String dayName;

        switch (day){
            case 1: dayName = "Monday"; break;
            case 2: dayName = "Tuesday"; break;
            case 3: dayName = "Wednesday"; break;

            default: dayName = "No defined"; break;

        }
        System.out.println("Today is " + dayName);

    }
}
