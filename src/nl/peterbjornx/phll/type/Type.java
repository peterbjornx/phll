package nl.peterbjornx.phll.type;

/**
 * Part of PortableHLL
 *
 * @author Peter Bosch <peterbosc@gmail.com>
 */
public abstract class Type {

    public abstract long sizeof();

    public abstract String getSignatureString();
}
