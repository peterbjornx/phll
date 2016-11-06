package nl.peterbjornx.phll.ast;

import nl.peterbjornx.phll.rrf.CodeBlock;
import nl.peterbjornx.phll.rrf.value.ImmediateValue;
import nl.peterbjornx.phll.rrf.Value;
import nl.peterbjornx.phll.type.NumericType;

/**
 * Part of PortableHLL
 *
 * @author Peter Bosch <peterbosc@gmail.com>
 */
public class NumericExpression extends ConstantExpression {
    private long value;

    public NumericExpression(String number) {
        type = new NumericType(32, true);
        value = Long.decode(number);
    }

    @Override
    public Value generate(CodeBlock block) {
        return new ImmediateValue(value);
    }
}
