package nl.peterbjornx.phll.symbol;

import nl.peterbjornx.phll.type.Type;

/**
 * Part of PortableHLL
 *
 * @author Peter Bosch <peterbosc@gmail.com>
 */
public abstract class Symbol {

    public abstract String getName();
    public abstract Type getType();

}
