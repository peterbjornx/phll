package nl.peterbjornx.phll.ast;

import nl.peterbjornx.phll.rrf.CodeBlock;
import nl.peterbjornx.phll.rrf.Value;

import java.util.List;

/**
 * Part of PortableHLL
 *
 * @author Peter Bosch <peterbosc@gmail.com>
 */
public class FunctionCallExpression extends Expression {
    private Expression             identifier;
    private List<Expression>    arguments;

    public FunctionCallExpression(Expression identifier, List<Expression> arguments) {
        super(null);
        this.identifier = identifier;
        this.arguments = arguments;
    }

    @Override
    public Value generate(CodeBlock block) {
        return null;
    }
}
