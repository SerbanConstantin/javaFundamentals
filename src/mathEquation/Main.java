package mathEquation;

//CalcEngine with Classes and Methods
public class Main {

    public static void main(String[] args) {

//        int[] leftVals = {100, 25, 225, 11};
//        int[] rightVals = {50, 92, 17, 3};
//        char[] opCodes = {'d', 'a', 's', 'm'};
//        int[] results = new int[opCodes.length];

        MathEquation[] equations = new MathEquation[4];
        equations[0] = create(100, 50, 'd');
        equations[1] = create(25, 92, 'a');
        equations[2] = create(225, 17, 's');
        equations[3] = create(11, 3, 'm');


        for (MathEquation equation : equations) {
            equation.execute();
            System.out.print("result = ");
            System.out.println(equation.getResult());

        }

        System.out.println();
        System.out.println("Using Overloards");
        System.out.println();

        int leftDouble = 9;
        int rightDouble = 4;
        int leftInt = 9;
        int rightint = 4;

        MathEquation equationOverloard = new MathEquation('d');

        equationOverloard.execute(leftDouble, rightDouble);
        System.out.print("result = ");
        System.out.println(equationOverloard.getResult());

        equationOverloard.execute(leftInt, rightint);
        System.out.print("result = ");
        System.out.println(equationOverloard.getResult());

        equationOverloard.execute(leftDouble, rightDouble);
        System.out.print("result = ");
        System.out.println(equationOverloard.getResult());

        System.out.println();
        System.out.print("Using Inheritance");
        System.out.println();

        CalculateBase[] calculators = {
                new Divider(100, 50),
                new Adder(25, 92),
                new Subtracter(225, 17),
                new Multiplier(11, 3)
        };

        for (CalculateBase calculator:calculators){
            calculator.calculate();
            System.out.println("result= ");
            System.out.println(calculator.getResult());
        }


    }

    public static MathEquation create(int leftVal, int rightVal, char opcode) {
        MathEquation equation = new MathEquation();
        equation.setLeftVals(leftVal);
        equation.setRightVals(rightVal);
        equation.setOpCode(opcode);
        return equation;


    }

}
