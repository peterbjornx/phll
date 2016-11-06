package nl.peterbjornx.phll.rrf.instr;

import nl.peterbjornx.phll.rrf.IntermediateInstruction;
import nl.peterbjornx.phll.rrf.value.Register;

/**
 * Part of PortableHLL
 *
 * @author Peter Bosch <peterbosc@gmail.com>
 */
public abstract class LoadInstruction extends IntermediateInstruction{
    private Register destination;
}
