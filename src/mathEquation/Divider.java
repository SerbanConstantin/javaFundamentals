package mathEquation;

public class Divider extends CalculateBase {
    public Divider() {
    }

    public Divider(int leftVal, int rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    public void calculate() {
        int value = getLeftVal() / getRightVal();
        setResult(value);
    }
}
