package C20160625_FlowControl.Conditionals;

public class Switch3 {
    public static void main(String[] args) {

        char letter = 'a';

        switch (letter){
            case 'a':
                System.out.println("Letter A");
                break;
            case 'b':
                System.out.println("Letter B");
                break;
            case 'c':
                System.out.println("Letter C");
                break;
            default:
                System.out.println("Is not a valid letter");
                break;
        }
    }
}
