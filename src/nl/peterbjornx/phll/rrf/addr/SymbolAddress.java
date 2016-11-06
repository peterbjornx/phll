package nl.peterbjornx.phll.rrf.addr;

import nl.peterbjornx.phll.symbol.Symbol;

/**
 * Part of PortableHLL
 *
 * @author Peter Bosch <peterbosc@gmail.com>
 */
public class SymbolAddress extends MemoryAddress {
    private Symbol symbol;

    public SymbolAddress(Symbol symbol) {
        this.symbol = symbol;
    }

    public String toString(){
        return "(&"+symbol.toString()+")";
    }
}
