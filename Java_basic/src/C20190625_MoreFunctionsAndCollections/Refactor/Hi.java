package C20190625_MoreFunctionsAndCollections.Refactor;

public class Hi {

//    public void showHiJuan(){
//        System.out.println("Hi, Juan");
//    }
//
//    public void showHiMaria(){
//        System.out.println("Hi, Maria");
//    }

    public void showHi(String name){
        System.out.println("Hi, " + name);
    }

    public static void main(String[] args) {

        Hi sayingHi = new Hi();
//        sayingHi.showHiJuan();
//        sayingHi.showHiMaria();
        sayingHi.showHi( "José");

    }
}
