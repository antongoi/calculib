package ua.org.calculib;

/**
 * Created by Anton Goi on 03.11.2014.
 */
public class Operand implements ICalculatable {

    private Class type;
    private Object value;

    public Operand(Object value, Class type) {
        this.type = type;
        this.value = value;
    }

    @Override
    public Object getResult(Operand... operands) {
        return null;
    }

}
