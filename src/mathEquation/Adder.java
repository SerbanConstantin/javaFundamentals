package mathEquation;

public class Adder extends CalculateBase {
    public Adder() {
    }

    public Adder(int leftVal, int rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    public void calculate() {
        int value = getLeftVal() + getRightVal();
        setResult(value);

    }
}
