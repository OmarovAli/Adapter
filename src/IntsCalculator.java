public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }
    @Override
    public int sum(int arg0, int arg1) {
        target.newFormula().addOperand(arg0);
        target.newFormula().addOperand(arg1);
      target.newFormula().calculate(Calculator.Operation.SUM);
    }

    @Override
    public int mult(int arg0, int arg1) {
        target.newFormula().addOperand(arg0);
        target.newFormula().addOperand(arg1);
        target.newFormula().calculate(Calculator.Operation.MULT);
        return target.newFormula().result.intValue();
    }

    @Override
    public int pow(int a, int b) {
        target.newFormula().addOperand(a);
        target.newFormula().addOperand(b);
        target.newFormula().calculate(Calculator.Operation.POW);
        return target.newFormula().result.intValue();
    }
}
