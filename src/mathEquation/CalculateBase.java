package mathEquation;

public abstract class CalculateBase {

    private int leftVal;
    private int rightVal;
    private int result;

    public int getLeftVal() {
        return leftVal;
    }

    public void setLeftVal(int leftVal) {
        this.leftVal = leftVal;
    }

    public int getRightVal() {
        return rightVal;
    }

    public void setRightVal(int rightVal) {
        this.rightVal = rightVal;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public CalculateBase(){
    }

    public CalculateBase(int leftVal, int rightVal){
        this.leftVal = leftVal;
        this.rightVal = rightVal;

    }

    public abstract void calculate();

}
