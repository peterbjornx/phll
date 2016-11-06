package nl.peterbjornx.phll.rrf;

import nl.peterbjornx.phll.rrf.value.Register;

/**
 * Part of PortableHLL
 *
 * @author Peter Bosch <peterbosc@gmail.com>
 */
public class RegisterManager {
    private int id_counter = 0;

    public Register createRegister()
    {
        return new Register(id_counter++);
    }
}
