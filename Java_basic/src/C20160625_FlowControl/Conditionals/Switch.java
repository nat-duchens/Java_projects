package C20160625_FlowControl.Conditionals;

public class Switch {
    public static void main(String[] args) {

        int day = 1;
        String dayName;

        switch (day){
            case 1: dayName = "Monday";
            break;
            case 2: dayName = "Tuesday";
            break;
            case 3: dayName = "Wednesday";
            break;
            case 4: dayName = "Thursday";
            break;
            case 5: dayName = "Friday";
            break;
            case 6: dayName = "Saturday";
            break;
            case 7: dayName = "Sunday";
            break;

            default: dayName = "Not defined";
            break;

        }
        System.out.println("Today is " + dayName);

    }
}
