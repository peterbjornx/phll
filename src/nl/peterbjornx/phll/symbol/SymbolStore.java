package nl.peterbjornx.phll.symbol;

import nl.peterbjornx.phll.lang.Operator;
import nl.peterbjornx.phll.type.Type;

import java.util.Collection;
import java.util.HashMap;

/**
 * Part of PortableHLL
 *
 * @author Peter Bosch <peterbosc@gmail.com>
 */
public class SymbolStore {
    private SymbolStore parent;
    private HashMap<OperatorSymbol.OperatorSignature, OperatorSymbol> operators = new HashMap<>();
    private HashMap<String, Symbol> symbols = new HashMap<>();

    public SymbolStore() {
        parent = null;
    }

    public SymbolStore(SymbolStore parent) {
        this.parent = parent;
    }

    public void addSymbol(OperatorSymbol os)
    {
        operators.put(os.getSignature(), os);
    }

    public void addSymbol(Symbol sym) {
        symbols.put(sym.getName(), sym);
    }

    public OperatorSymbol getOperator(Operator op, Type operand1, Type operand2){
        if (parent != null) {
            OperatorSymbol s = parent.getOperator(op, operand1, operand2);
            if ( s != null )
                return s;
        }
        return operators.get(new OperatorSymbol.OperatorSignature(op, null, operand1, operand2));
    }

    public OperatorSymbol getOperator(OperatorSymbol.OperatorSignature sig){
        if (parent != null) {
            OperatorSymbol s = parent.getOperator(sig);
            if ( s != null )
                return s;
        }
        return operators.get(sig);
    }

    public Symbol getSymbol(String name) {
        if (parent != null) {
            Symbol s = parent.getSymbol(name);
            if ( s != null )
                return s;
        }
        return symbols.get(name);
    }

    public SymbolStore getParent() {
        return parent;
    }

    public Collection<Symbol> getSymbols(){
        return symbols.values();
    }
}
