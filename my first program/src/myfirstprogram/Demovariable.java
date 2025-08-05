package myfirstprogram;
public class Demovariable {
    // Instance variable
    String name = "instance variable";

    // Static variable
    static String name1 = "static variable";

    public static void main(String[] args) {
        Demovariable obj = new Demovariable();
        obj.print();
    }

    // Method declared correctly
    void print() {
        // Local variable
        String name2 = "local variable";
        System.out.println(name2);
    }
}