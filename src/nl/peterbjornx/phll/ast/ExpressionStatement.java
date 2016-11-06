package nl.peterbjornx.phll.ast;

import nl.peterbjornx.phll.rrf.CodeBlock;

/**
 * Part of PortableHLL
 *
 * @author Peter Bosch <peterbosc@gmail.com>
 */
public class ExpressionStatement extends Statement {
    private Expression expression;

    public ExpressionStatement(Expression expression) {
        CodeBlock block = new CodeBlock();
        this.expression = expression;
    }

    @Override
    public void generate(CodeBlock block) {
        expression.generate(block);
    }
}
