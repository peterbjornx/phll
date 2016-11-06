package nl.peterbjornx.phll.ast;

import nl.peterbjornx.phll.rrf.CodeBlock;
import nl.peterbjornx.phll.rrf.Value;
import nl.peterbjornx.phll.rrf.addr.SymbolAddress;
import nl.peterbjornx.phll.rrf.value.MemoryReference;
import nl.peterbjornx.phll.symbol.Symbol;
import nl.peterbjornx.phll.symbol.SymbolStore;

/**
 * Part of PortableHLL
 *
 * @author Peter Bosch <peterbosc@gmail.com>
 */
public class SymbolReferenceExpression extends Expression {
    private Symbol symbol;

    public SymbolReferenceExpression(SymbolStore store, String name) {
        symbol = store.getSymbol(name);
        if (symbol == null)
            throw new RuntimeException("Could not find symbol for "+name);
        type = symbol.getType();
    }

    @Override
    public Value generate(CodeBlock block) {
        return new MemoryReference(new SymbolAddress(symbol));
    }
}
