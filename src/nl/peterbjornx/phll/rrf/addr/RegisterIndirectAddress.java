package nl.peterbjornx.phll.rrf.addr;

import nl.peterbjornx.phll.rrf.value.Register;

/**
 * Part of PortableHLL
 *
 * @author Peter Bosch <peterbosc@gmail.com>
 */
public class RegisterIndirectAddress extends MemoryAddress {
    private Register base;

    public RegisterIndirectAddress(Register base) {
        this.base = base;
    }

    public String toString() {
        return "(" + base + ")";
    }

    public Register getBase() {
        return base;
    }
}
