package nl.peterbjornx.phll.ast;

import nl.peterbjornx.phll.lang.Operator;
import nl.peterbjornx.phll.parse.ParseException;
import nl.peterbjornx.phll.rrf.CodeBlock;
import nl.peterbjornx.phll.rrf.Value;
import nl.peterbjornx.phll.symbol.OperatorSymbol;
import nl.peterbjornx.phll.symbol.SymbolStore;
import nl.peterbjornx.phll.type.PointerType;
import nl.peterbjornx.phll.type.Type;

/**
 * Part of PortableHLL
 *
 * @author Peter Bosch <peterbosc@gmail.com>
 */
public class UnaryExpression extends Expression {
    private OperatorSymbol  symbol;
    private Operator        operator;
    private Expression      expression;

    public UnaryExpression(SymbolStore store, Operator operator, Expression expression) throws ParseException {
        Type innerType;
        this.operator = operator;
        this.expression = expression;
        innerType = expression.getType();
        switch (operator){
            case PREINC:
            case PREDEC:
            case POSTDEC:
            case POSTINC:
            case NEGATE:
            case NOT:
            case INV:
            case NOOP:
                symbol = store.getOperator(operator, innerType, null);
                type   = symbol.getSignature().getType();
                break;
            case ADDR_OF:
                //TODO: Check whether expression is a SymbolReferenceExpression
                type = new PointerType(expression.getType());
                break;
            case DEREF:
                if ( ! ( expression.getType() instanceof  PointerType) )
                    throw new ParseException("Can not dereference non-pointer expression of type: "+expression.getType());
                PointerType t = (PointerType) expression.getType();
                type = t.getInnerType();
                break;
            default:
                throw new ParseException("IMPLEMENTATION ERROR: UNKNOWN UNARY OP PASSED TO UnaryExpression()");

        }
    }

    @Override
    public Value generate(CodeBlock block) {
        Value val;
        switch (operator) {
            case DEREF:
                return null;//TODO:return new MemoryReference()
            case ADDR_OF:
                return null;//TODO:return new ConstantExpression(symbol address)
            case PREINC:
            case PREDEC:
            case POSTDEC:
            case POSTINC:
            case NEGATE:
            case NOT:
            case INV:
            case NOOP:
                val = expression.generate(block);
                return symbol.generate(block, val);
        }
        return null;
    }
}
