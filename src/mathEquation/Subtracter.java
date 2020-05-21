package mathEquation;

public class Subtracter extends CalculateBase {
    public Subtracter() {
    }

    public Subtracter(int leftVal, int rightVal) {
        super(leftVal, rightVal);
    }
    @Override
    public void calculate(){
        int value = getLeftVal() - getRightVal();
        setResult(value);
    }
}
