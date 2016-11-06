package nl.peterbjornx.phll.type;

/**
 * Part of PortableHLL
 *
 * @author Peter Bosch <peterbosc@gmail.com>
 */
public class NumericType extends Type {
    private int     width;
    private boolean signed;

    public NumericType(int width, boolean signed) {
        this.width = width;
        this.signed = signed;
    }

    @Override
    public boolean equals(Object o) {
        NumericType t;
        if ( !( o instanceof NumericType ) )
            return false;
        t = ( NumericType ) o;
        return t.signed == signed && t.width == width;
    }

    public boolean canImplicityCast(Type o) {
        NumericType t;
        if ( !( o instanceof NumericType ) )
            return false;
        t = ( NumericType ) o;
        return t.signed == signed && t.width <= width;
    }

    public long sizeof(){
        return width/4;
    }

    @Override
    public String getSignatureString() {
        return (signed?"I":"U") + width;
    }

    @Override
    public int hashCode() {
        int result = 12*31+width;
        result = 31 * result + (signed ? 1 : 0);
        return result;
    }

    public String toString(){
        return (signed ? "": "u")+"int"+width;
    }
}
