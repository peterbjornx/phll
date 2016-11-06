package nl.peterbjornx.phll.rrf.instr;

import nl.peterbjornx.phll.rrf.value.Register;

/**
 * Part of PortableHLL
 *
 * @author Peter Bosch <peterbosc@gmail.com>
 */
public class IMMLoadInstruction extends LoadInstruction {
    private final Register register;
    private final long value;

    public IMMLoadInstruction(Register r, long value) {
        this.register = r;
        this.value = value;
    }

    public String toString()
    {
        return "LOADIMM\t"+register+",\t#"+Long.toHexString(value)+"h";
    }
    // private NumericConstant
}
