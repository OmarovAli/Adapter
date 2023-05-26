public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }
    @Override
    public int sum(int arg0, int arg1) {
        Calculator.Formula a =  target.newFormula();
        a.addOperand(arg1);
        a.addOperand(arg0);
        a.calculate(Calculator.Operation.SUM);
        return a.result.intValue();
    }

    @Override
    public int mult(int arg0, int arg1) {
     Calculator.Formula a =  target.newFormula();
         a.addOperand(arg1);
         a.addOperand(arg0);
        a.calculate(Calculator.Operation.MULT);
        return a.result.intValue();
    }

    @Override
    public int pow(int a, int b) {
        Calculator.Formula $ =  target.newFormula();
        $.addOperand(a);
        $.addOperand(b);
        $.calculate(Calculator.Operation.POW);
        return $.result.intValue();
    }
}
