package exercitii;

public class Dog {
    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void dogBarths() {
        System.out.println("ham, ham");
    }
    public void dogBarthsNew(){
        System.out.println("Woof, woof");
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Grivei", 11);

        if (dog.age < 10){
            dog.dogBarths();
        }else {
            dog.dogBarthsNew();
        }


        System.out.println(dog.age + " " + dog.name);
    }
}
