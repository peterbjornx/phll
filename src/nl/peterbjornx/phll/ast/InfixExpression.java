package nl.peterbjornx.phll.ast;

import nl.peterbjornx.phll.lang.Operator;
import nl.peterbjornx.phll.rrf.CodeBlock;
import nl.peterbjornx.phll.rrf.Value;
import nl.peterbjornx.phll.symbol.OperatorSymbol;
import nl.peterbjornx.phll.symbol.SymbolStore;

/**
 * Part of PortableHLL
 *
 * @author Peter Bosch <peterbosc@gmail.com>
 */
public class InfixExpression extends Expression {
    private OperatorSymbol symbol;
    private SymbolStore store;
    private Operator    operator;
    private Expression  left_operand;
    private Expression  right_operand;

    public InfixExpression(SymbolStore store, Operator operator, Expression left_operand, Expression right_operand) {
        this.store = store;
        this.operator = operator;
        this.left_operand = left_operand;
        this.right_operand = right_operand;
        switch (operator) {
            case MOD_ASSIGN:
                right_operand = new InfixExpression(store, Operator.MOD, left_operand, right_operand);
                type = left_operand.getType();
                operator = Operator.ASSIGN;
                break;
            case DIV_ASSIGN:
                right_operand = new InfixExpression(store, Operator.DIV, left_operand, right_operand);
                type = left_operand.getType();
                operator = Operator.ASSIGN;
                break;
            case MUL_ASSIGN:
                right_operand = new InfixExpression(store, Operator.MUL, left_operand, right_operand);
                type = left_operand.getType();
                operator = Operator.ASSIGN;
                break;
            case SUB_ASSIGN:
                right_operand = new InfixExpression(store, Operator.SUB, left_operand, right_operand);
                type = right_operand.getType();
                operator = Operator.ASSIGN;
                break;
            case ADD_ASSIGN:
                right_operand = new InfixExpression(store, Operator.SUM, left_operand, right_operand);
                type = left_operand.getType();
                operator = Operator.ASSIGN;
                break;
            case XOR_ASSIGN:
                right_operand = new InfixExpression(store, Operator.XOR, left_operand, right_operand);
                type = left_operand.getType();
                operator = Operator.ASSIGN;
                break;
            case OR_ASSIGN:
                right_operand = new InfixExpression(store, Operator.OR, left_operand, right_operand);
                type = left_operand.getType();
                operator = Operator.ASSIGN;
                break;
            case AND_ASSIGN:
                right_operand = new InfixExpression(store, Operator.AND, left_operand, right_operand);
                type = left_operand.getType();
                operator = Operator.ASSIGN;
                break;
        }
        symbol = store.getOperator(operator, left_operand.getType(), right_operand.getType());
        if (symbol == null)
            throw new RuntimeException("Could not find symbol for " + operator + "(" + left_operand.getType() + "," + right_operand.getType() + ")");
        type = symbol.getSignature().getType();
    }

    @Override
    public Value generate(CodeBlock block) {
        return symbol.generate(block, left_operand.generate(block), right_operand.generate(block));
    }
}
