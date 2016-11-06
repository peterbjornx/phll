package nl.peterbjornx.phll.rrf.instr;

import nl.peterbjornx.phll.rrf.value.Register;
import nl.peterbjornx.phll.rrf.addr.MemoryAddress;

/**
 * Part of PortableHLL
 *
 * @author Peter Bosch <peterbosc@gmail.com>
 */
public class MemoryLoadInstruction extends LoadInstruction {
    private Register destination;
    private MemoryAddress address;

    public MemoryLoadInstruction(Register dest, MemoryAddress address) {

        this.destination = dest;
        this.address = address;
    }

    public String toString(){
        return "LD\t"+destination+",\t"+address;

    }
}
