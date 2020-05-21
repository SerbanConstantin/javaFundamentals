package exercitii;

public class MyClassMain extends MyClass {

    // Change the value of x to 25 in myObj2, and leave x in myObj1 unchanged:

    public static void main(String[] args) {

        MyClass myObj = new MyClass();
        MyClass myObj2 = new MyClass();
        myObj2.x = 25;

        System.out.println(myObj.x);
        System.out.println(myObj2.x);

        myMethod();


    }


}
