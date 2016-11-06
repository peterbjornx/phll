package nl.peterbjornx.phll.rrf.instr;

import nl.peterbjornx.phll.rrf.value.Register;
import nl.peterbjornx.phll.rrf.addr.MemoryAddress;

/**
 * Part of PortableHLL
 *
 * @author Peter Bosch <peterbosc@gmail.com>
 */
public class MemoryWriteInstruction extends StoreInstruction {
    private final Register source;
    private final MemoryAddress address;

    public MemoryWriteInstruction(Register source, MemoryAddress address) {

        this.source = source;
        this.address = address;
    }

    public String toString(){
        return "ST\t"+source+",\t"+address;

    }
}
