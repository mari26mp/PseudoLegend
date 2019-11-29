public class Names {

    public void main(String[] args){
        boolean shit = true;

        String name1= "Robert";
        String name2 = "Derek";
        String name3 = "Reynaldo";
        String name4 = "Mari";
        String name5 = "Aletsis";
        String name6 = "Payo";
        String name7 = "Nani";
        String name8 = "Lela";

        checkNameForR(name1);
        checkNameForR(name2);
        checkNameForR(name3);

/*        if(name1.contains("r") && name2.contains("r") && name3.contains("R")){
            System.out.println("-----------------------------------");
            System.out.println(name1);
            System.out.println(name2);
            System.out.println(name3);
        }

        while(shit){

        }*/
    }

    public void checkNameForR(String name){
        if(name.contains("r")||name.contains("R")){
            System.out.println(name);
        }
    }

}
