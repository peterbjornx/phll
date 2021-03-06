package nl.peterbjornx.phll.symbol;

import nl.peterbjornx.phll.type.Type;

/**
 * Part of PortableHLL
 *
 * @author Peter Bosch <peterbosc@gmail.com>
 */
public class VariableSymbol extends Symbol {
    private String name;
    private Type type;

    public VariableSymbol(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    public String toString() { return getName();}

    @Override
    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }
}
