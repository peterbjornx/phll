package nl.peterbjornx.phll.rrf;

import nl.peterbjornx.phll.rrf.value.Register;

/**
 * Part of PortableHLL
 *
 * @author Peter Bosch <peterbosc@gmail.com>
 */
public abstract class Value {

    public abstract Register read(CodeBlock block);

    public void write(CodeBlock block, Value value)
    {
        throw new RuntimeException("Value is not an lvalue");
    }

}
