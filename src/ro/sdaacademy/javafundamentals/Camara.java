package ro.sdaacademy.javafundamentals;

public class Camara {
    public static void main(String[] args) {
        Borcan borcan1 = new Borcan("castraveti");
        System.out.println(borcan1.getContinut());
        System.out.println(borcan1.totalBorcane);//1

        Borcan borcan2 = new Borcan("castraveti");
        System.out.println(borcan2.totalBorcane);//2
        System.out.println(borcan1.totalBorcane);//2
        System.out.println(Borcan.totalBorcane--);//2
        System.out.println(borcan1.totalBorcane);//1


        System.out.println(borcan1.equals(borcan2));








    }
}
