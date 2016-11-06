package nl.peterbjornx.phll.ast;

import nl.peterbjornx.phll.rrf.CodeBlock;

import java.util.List;

/**
 * Part of PortableHLL
 *
 * @author Peter Bosch <peterbosc@gmail.com>
 */
public class CompoundStatement extends Statement {
    private List<Statement> statements;

    public CompoundStatement(List<Statement> statements) {
        this.statements = statements;
    }

    @Override
    public void generate(CodeBlock block) {
        for (Statement s : statements)
            s.generate(block);
    }
}
