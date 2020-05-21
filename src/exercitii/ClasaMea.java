package exercitii;

public class ClasaMea {
    int modelYear;
    String modelName;

    public ClasaMea(int modelYear, String modelName) {
        this.modelYear = modelYear;
        this.modelName = modelName;
    }

    public static void main(String[] args) {
        ClasaMea clasaMea = new ClasaMea(2008, "Honda");
        System.out.println(clasaMea.modelName + " " + clasaMea.modelYear);
    }
}
