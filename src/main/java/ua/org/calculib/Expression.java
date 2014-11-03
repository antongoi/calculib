package ua.org.calculib;

import java.math.BigInteger;
import java.util.Stack;

/**
 * Created by Anton Goi on 11.10.2014.
 */
public class Expression {

    private Stack<ICalculatable> expressionStack;
    private Stack<ICalculatable> processingStack;

    public Expression() {
    }

    public Expression(String sExpression) {
    }

    //TODO: fix bug with signed numbers
    private static String optimizeSpaces(String expression) {
        String result = "";
        char[] chars = expression.trim().toCharArray(); //.replace(',', '.').toCharArray();
        boolean ignoreLeftSpace = false;
        for (char c : chars) {
            if (Character.isDigit(c) || Character.isLetter(c) || c == '.') result += c;
            else if (c == ' ') continue;
            else {
                result += (ignoreLeftSpace ? "" : " ") + c + " ";
                ignoreLeftSpace = true;
                continue;
            }
            ignoreLeftSpace = false;
        }

        return result.trim();
    }

    //TODO: performance research for int, Integer, Long, float, double, BigDecimal, BigInteger... and edit following method
    private static Operand parseOperand(String sOperand) {
        if (sOperand.indexOf('\"') < 0) {
            return new Operand(sOperand.substring(1, sOperand.length() - 2), String.class);
        }

        if (sOperand.indexOf('.') < 0) {
            if (sOperand.length() < 10) {
                try {
                    return new Operand(Integer.parseInt(sOperand), Integer.class);
                } catch (NumberFormatException e) {
                    //TODO: process exception
                }
            } else if (sOperand.length() < 19) {
                try {
                    return new Operand(Long.parseLong(sOperand), Long.class);
                } catch (NumberFormatException e) {
                    //TODO: process exception
                }
            } else {
                try {
                    return new Operand(new BigInteger(sOperand), BigInteger.class);
                } catch (NumberFormatException e) {
                    //TODO: process exception
                }
            }
        } else {
            if (sOperand.length() < 10) {
                try {
                    return new Operand(Integer.parseInt(sOperand), Integer.class);
                } catch (NumberFormatException e) {
                    //TODO: process exception
                }
            } else if (sOperand.length() < 19) {
                try {
                    return new Operand(Long.parseLong(sOperand), Long.class);
                } catch (NumberFormatException e) {
                    //TODO: process exception
                }
            } else {
                try {
                    return new Operand(new BigInteger(sOperand), BigInteger.class);
                } catch (NumberFormatException e) {
                    //TODO: process exception
                }
            }
        }

        return null;
    }

    /**
     * Shunting-yard algorithm by Edsger Wybe Dijkstra
     * Converting expression in prefix-infix notation to RPN
     * and returns RPN expression represented in stack of operands and operators
     * */
    private static Stack<ICalculatable> parseExpression(String sExpression) {
        String [] symbols = optimizeSpaces(sExpression).split(" ");
        for (String s : symbols){

        }

        return null;
    }

}
