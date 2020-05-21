package mathEquation;

//CalcEngine with Classes and Methods
public class MathEquation {

    private int leftVals;
    private int rightVals;
    private char opCode;
    private int result;

    public int getLeftVals() {
        return leftVals;
    }

    public void setLeftVals(int leftVals) {
        this.leftVals = leftVals;
    }

    public int getRightVals() {
        return rightVals;
    }

    public void setRightVals(int rightVals) {
        this.rightVals = rightVals;
    }

    public char getOpCode() {
        return opCode;
    }

    public void setOpCode(char opCode) {
        this.opCode = opCode;
    }

    public int getResult() {
        return result;
    }

    public MathEquation(){}

    public MathEquation(char opCode){
        this.opCode = opCode;

    }

    public MathEquation(int leftVals, int rightVals, char opCode) {
        this(opCode);
        this.leftVals = leftVals;
        this.rightVals = rightVals;


    }

    public void execute(int leftVals, int rightVals) {
        this.leftVals= leftVals;
        this.rightVals = rightVals;

        execute();
    }
//    public void execute(int leftVals, int rightVals) {
//        this.leftVals= leftVals;
//        this.rightVals = rightVals;
//
//        execute();
//
//        result = (int)result;

//    }

    public void execute() {

        switch (opCode) {
            case 'a':
                result = leftVals + rightVals;
                break;
            case 's':
                result = leftVals - rightVals;
                break;
            case 'd':
                result = rightVals != 0 ? leftVals / rightVals : 0;
                break;
            case 'm':
                result = leftVals * rightVals;
                break;
            default:
                System.out.println("Error - invalid opCode");
                result = 0;
                break;
        }
    }
}
