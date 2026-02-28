package Strings;

public class StringsPractice {
    public static void main(String[] args) {

         String name = "sundram";
         String name2 = "sundram";

         String name3 = new String("sundram");

        System.out.println(name==name2); //true
        System.out.println(name == name3); //false
        System.out.println(name.equals(name3)); //true

    }
}
