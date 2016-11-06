package nl.peterbjornx.phll.rrf.value;

import nl.peterbjornx.phll.rrf.CodeBlock;
import nl.peterbjornx.phll.rrf.Value;
import nl.peterbjornx.phll.rrf.addr.MemoryAddress;
import nl.peterbjornx.phll.rrf.instr.MemoryLoadInstruction;
import nl.peterbjornx.phll.rrf.instr.MemoryWriteInstruction;

/**
 * Part of PortableHLL
 *
 * @author Peter Bosch <peterbosc@gmail.com>
 */
public class MemoryReference extends Reference {
    private MemoryAddress address;

    public MemoryReference(MemoryAddress address) {
        this.address = address;
    }

    @Override
    public Register read(CodeBlock block) {
        Register r = block.getRegisterManager().createRegister();
        block.addInstruction(new MemoryLoadInstruction(r, address));
        return r;
    }

    @Override
    public void write(CodeBlock block, Value v){
        Register r = v.read(block);
        block.addInstruction(new MemoryWriteInstruction(r, address));
    }
}
