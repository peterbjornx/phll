package nl.peterbjornx.phll.ast;

import nl.peterbjornx.phll.rrf.CodeBlock;
import nl.peterbjornx.phll.rrf.Value;
import nl.peterbjornx.phll.type.Type;

/**
 * Part of PortableHLL
 *
 * @author Peter Bosch <peterbosc@gmail.com>
 */
public abstract class Expression {
    protected Type type;

    protected Expression(Type type) {
        this.type = type;
    }

    protected Expression() {
        this.type = null;
    }

    public Type getType() {
        return type;
    }

    public abstract Value generate(CodeBlock block);
}
