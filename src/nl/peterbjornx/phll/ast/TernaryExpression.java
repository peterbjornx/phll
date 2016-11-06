package nl.peterbjornx.phll.ast;

import nl.peterbjornx.phll.rrf.CodeBlock;
import nl.peterbjornx.phll.rrf.Value;

/**
 * Part of PortableHLL
 *
 * @author Peter Bosch <peterbosc@gmail.com>
 */
public class TernaryExpression extends Expression {
    private Expression condition;
    private Expression true_expression;
    private Expression false_expression;

    public TernaryExpression(Expression condition, Expression true_expression, Expression false_expression) {
        super(null);
        this.condition = condition;
        this.true_expression = true_expression;
        this.false_expression = false_expression;
    }

    @Override
    public Value generate(CodeBlock block) {
        return null;
    }
}
