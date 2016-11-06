package nl.peterbjornx.phll.symbol;

import nl.peterbjornx.phll.lang.Operator;
import nl.peterbjornx.phll.rrf.CodeBlock;
import nl.peterbjornx.phll.rrf.Value;
import nl.peterbjornx.phll.type.Type;

/**
 * Part of PortableHLL
 *
 * @author Peter Bosch <peterbosc@gmail.com>
 */
public abstract class OperatorSymbol extends Symbol {

    private OperatorSignature signature;

    public OperatorSymbol(OperatorSignature signature) {
        this.signature = signature;
    }

    public Type getType(){
        return signature.getType();
    }

    public OperatorSignature getSignature() {
        return signature;
    }

    @Override
    public String getName() {
        return "operator_" + signature.toString();
    }

    public abstract Value generate(CodeBlock block, Value val);
    public abstract Value generate(CodeBlock block, Value a, Value b);

    public static  class OperatorSignature {
        private Operator operator;
        private Type type;
        private Type operand1;
        private Type operand2;

        public OperatorSignature(Operator operator, Type type, Type operand1, Type operand2) {
            this.operator = operator;
            this.type = type;
            this.operand1 = operand1;
            this.operand2 = operand2;
        }

        public String toString() {
            return operator.toString() + "_" + operand1.getSignatureString() + "_" +
                    (operand2 == null ? "_V" : operand2.getSignatureString());
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            OperatorSignature that = (OperatorSignature) o;

            return operator == that.operator &&
                    operand1.equals(that.operand1) &&
                    !(operand2 != null ? !operand2.equals(that.operand2) : that.operand2 != null);

        }

        @Override
        public int hashCode() {
            int result = operator.hashCode();
            result = 31 * result + operand1.hashCode();
            result = 31 * result + (operand2 != null ? operand2.hashCode() : 0);
            return result;
        }

        public Type getType() {
            return type;
        }
    }

}
