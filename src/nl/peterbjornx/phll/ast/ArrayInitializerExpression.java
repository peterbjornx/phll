package nl.peterbjornx.phll.ast;

import nl.peterbjornx.phll.rrf.CodeBlock;
import nl.peterbjornx.phll.rrf.Value;

/**
 * Part of PortableHLL
 *
 * @author Peter Bosch <peterbosc@gmail.com>
 */
public class ArrayInitializerExpression extends Expression {
    private String type;

    public ArrayInitializerExpression() {
        super(null);
    }

    @Override
    public Value generate(CodeBlock block) {
        return null;
    }
}
