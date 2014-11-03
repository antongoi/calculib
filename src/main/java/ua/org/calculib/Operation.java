package ua.org.calculib;

/**
 * Created by Anton Goi on 03.11.2014.
 */
public abstract class Operation implements ICalculatable {

    private int arity;

    private int precedence;

    private EAssociativity associativity;

    /**
     * notation can be infix (true) or prefix (false)
     * it's important only when you converting expression to RPN
     * but when you processing RPN it doesn't matter
     * because all operations in RPN are in postfix notation
    * */
    private boolean infix;

    public Operation(int arity, int precedence, EAssociativity associativity, boolean infix) {
        this.arity = arity;
        this.precedence = precedence;
        this.associativity = associativity;
        this.infix = infix;
    }

    @Override
    public Object getResult(Operand... operands) {
        return null;
    }


}
