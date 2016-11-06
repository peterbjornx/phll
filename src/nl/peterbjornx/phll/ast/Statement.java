package nl.peterbjornx.phll.ast;

import nl.peterbjornx.phll.rrf.CodeBlock;

/**
 * Part of PortableHLL
 *
 * @author Peter Bosch <peterbosc@gmail.com>
 */
public abstract class Statement {
    public abstract void generate(CodeBlock block);
}
