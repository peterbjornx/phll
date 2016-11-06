package nl.peterbjornx.phll.rrf.instr;

import nl.peterbjornx.phll.lang.Operator;
import nl.peterbjornx.phll.rrf.IntermediateInstruction;
import nl.peterbjornx.phll.rrf.value.Register;

/**
 * Part of PortableHLL
 *
 * @author Peter Bosch <peterbosc@gmail.com>
 */
public class RegisterInstruction extends IntermediateInstruction {
    private final Operator operator;
    private Register    destination;
    private Register    operand1;
    private Register    operand2;

    public RegisterInstruction(Operator op, Register destination, Register operand1, Register operand2) {
        this.destination = destination;
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operator = op;
    }

    public String toString(){
        return operator.toString()+"\t" +destination+ ",\t"+operand1+",\t"+operand2;
    }

}
