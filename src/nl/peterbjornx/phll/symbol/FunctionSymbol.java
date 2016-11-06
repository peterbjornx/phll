package nl.peterbjornx.phll.symbol;

import nl.peterbjornx.phll.ast.FunctionImplementation;
import nl.peterbjornx.phll.type.Type;

/**
 * Part of PortableHLL
 *
 * @author Peter Bosch <peterbosc@gmail.com>
 */
public class FunctionSymbol extends VariableSymbol {
    private final FunctionImplementation function;

    public FunctionSymbol(FunctionImplementation fi) {
        super(fi.getName(), fi.getType());
        function = fi;
    }

    public FunctionImplementation getFunction() {
        return function;
    }
}
