package mathEquation;

public class Multiplier extends CalculateBase {
    public Multiplier() {
    }

    public Multiplier(int leftVal, int rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    public void calculate() {
        int value = getLeftVal() * getRightVal();
        setResult(value);
    }
}
