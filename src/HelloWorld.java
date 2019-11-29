public class HelloWorld{

    public static void main(String[] args){
        Hi();
        hiRobert();
        String loco = "MEH";

        for(int i =0; i<=5; i++){
        System.out.println("Ninoooo");        }
    }

    public static void Hi(){
        System.out.println("HAiiii");
    }

    public static void hiRobert(){
        System.out.println("Hello Robert");
        Hi();
    }
}
