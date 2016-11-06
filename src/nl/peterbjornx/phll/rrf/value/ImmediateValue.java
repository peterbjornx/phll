package nl.peterbjornx.phll.rrf.value;

import nl.peterbjornx.phll.rrf.CodeBlock;
import nl.peterbjornx.phll.rrf.Value;
import nl.peterbjornx.phll.rrf.instr.IMMLoadInstruction;
import nl.peterbjornx.phll.rrf.value.Register;

/**
 * Part of PortableHLL
 *
 * @author Peter Bosch <peterbosc@gmail.com>
 */
public class ImmediateValue extends Value {

    private long value;

    public ImmediateValue(long value) {
        this.value = value;

    }

    public long getValue() {
        return value;
    }

    @Override
    public Register read(CodeBlock block) {
        Register r = block.getRegisterManager().createRegister();
        block.addInstruction(new IMMLoadInstruction(r, value));
        return r;
    }

    public String toString(){
        return Long.toString(value);
    }

}
