package nl.peterbjornx.phll.type;

import nl.peterbjornx.phll.sys.PlatformSettings;

/**
 * Part of PortableHLL
 *
 * @author Peter Bosch <peterbosc@gmail.com>
 */
public class PointerType extends Type {
    private Type inner;

    public PointerType(Type inner) {
        super();
        this.inner = inner;
    }

    @Override
    public long sizeof() {
        return PlatformSettings.POINTER_HW_TYPE.sizeof();
    }

    @Override
    public String getSignatureString() {
        return "P"+inner.getSignatureString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PointerType that = (PointerType) o;

        return inner.equals(that.inner);

    }

    @Override
    public int hashCode() {
        return inner.hashCode() + 11 * 31;
    }

    public Type getInnerType() {
        return inner;
    }
}
