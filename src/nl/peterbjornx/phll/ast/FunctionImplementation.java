package nl.peterbjornx.phll.ast;

import nl.peterbjornx.phll.symbol.Symbol;
import nl.peterbjornx.phll.symbol.SymbolStore;
import nl.peterbjornx.phll.symbol.VariableSymbol;
import nl.peterbjornx.phll.type.Type;

import java.util.List;

/**
 * Part of PortableHLL
 *
 * @author Peter Bosch <peterbosc@gmail.com>
 */
public class FunctionImplementation {
    private String          name;
    private List<Statement> statementList;
    private List<VariableSymbol> parameterList;
    private Type type;
    private SymbolStore     localStore;

    public FunctionImplementation(SymbolStore store) {
        this.localStore = new SymbolStore(store);
    }

    public void addSymbol(Symbol symbol) {
        this.localStore.addSymbol(symbol);
    }

    public void setStatementList(List<Statement> statementList) {
        this.statementList = statementList;
    }

    public List<Statement> getStatementList() {
        return statementList;
    }

    public SymbolStore getLocalStore() {
        return localStore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<VariableSymbol> getParameterList() {
        return parameterList;
    }

    public void setParameterList(List<VariableSymbol> parameterList) {
        this.parameterList = parameterList;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
