package nl.peterbjornx.phll.rrf.value;

import nl.peterbjornx.phll.rrf.CodeBlock;
import nl.peterbjornx.phll.rrf.Value;

/**
 * Part of PortableHLL
 *
 * @author Peter Bosch <peterbosc@gmail.com>
 */
public class Register extends Value {
    private int id;

    public Register(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public Register read(CodeBlock block) {
        return this;
    }

    public String toString(){
        return "r" + id;
    }
}
