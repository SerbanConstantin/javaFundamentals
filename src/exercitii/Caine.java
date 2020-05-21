package exercitii;

public class Caine {
    // Add private fields to the class , like name , age , gender , race, weigth

    private String name;
    private int age;
    private String gender;
    private String race;
    private int weigth;

    // Create additional constructor , that will accept only gender and race. It should call main
    // constructor with default values

//    public Caine(String gender, String race) {
//        this.gender = gender;
//        this.race = race;
//    }

    //  Create getters and setters for age and weigth

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeigth() {
        return weigth;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    // Create constructor that accepts all of the class fields
    public Caine(String name, int age, String gender, String race, int weigth) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.race = race;
        this.weigth = weigth;


    }
    // Create object of class Dog. Verify if everything works as expected

    public static void main(String[] args) {
        Caine caine = new Caine("Ursache", 10, "baiat","pichinez", 20);
//        caine.setAge(20);
//        caine.setWeigth(10);
//        caine.setGender("male");
//        caine.setRace("ucigas");
//        caine.setName("Ursache");
        System.out.println(caine.getName() +" " +caine.getGender() +" "+ caine.getRace() +" "+ caine.getAge() +" "+  caine.getWeigth() );


    }

}
