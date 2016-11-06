package nl.peterbjornx.phll.rrf;

import java.util.LinkedList;

/**
 * Part of PortableHLL
 *
 * @author Peter Bosch <peterbosc@gmail.com>
 */
public class CodeBlock {
    private LinkedList<IntermediateInstruction> instructions = new LinkedList<>();
    private RegisterManager registerManager;

    public void addInstruction(IntermediateInstruction instr)
    {
        instructions.add(instr);
    }

    public void addInstructions(CodeBlock block)
    {
        instructions.addAll(block.instructions);
    }

    public RegisterManager getRegisterManager() {
        return registerManager;
    }

    public CodeBlock createChild(){
        return new CodeBlock(registerManager);
    }

    public CodeBlock(){
        registerManager = new RegisterManager();
    }

    private CodeBlock(RegisterManager man){
        registerManager = man;
    }

    public String toString()
    {
        String list = "";
        for (IntermediateInstruction i : instructions)
            list += i + "\n";
        return list;
    }


}
