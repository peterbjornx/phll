package nl.peterbjornx.phll.type;

import nl.peterbjornx.phll.sys.PlatformSettings;

/**
 * Part of PortableHLL
 *
 * @author Peter Bosch <peterbosc@gmail.com>
 */
public class BooleanType extends Type {

    @Override
    public boolean equals(Object o) {
        return true;
    }

    @Override
    public long sizeof() {
        return PlatformSettings.BOOLEAN_HW_TYPE.sizeof();
    }

    @Override
    public String getSignatureString() {
        return "B";
    }
}
