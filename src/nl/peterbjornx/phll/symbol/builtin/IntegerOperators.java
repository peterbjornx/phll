package nl.peterbjornx.phll.symbol.builtin;

import nl.peterbjornx.phll.lang.Operator;
import nl.peterbjornx.phll.rrf.*;
import nl.peterbjornx.phll.rrf.instr.RegisterInstruction;
import nl.peterbjornx.phll.rrf.value.ImmediateValue;
import nl.peterbjornx.phll.rrf.value.Register;
import nl.peterbjornx.phll.symbol.OperatorSymbol;
import nl.peterbjornx.phll.symbol.SymbolStore;
import nl.peterbjornx.phll.type.NumericType;

/**
 * Part of PortableHLL
 *
 * @author Peter Bosch <peterbosc@gmail.com>
 */
public class IntegerOperators {

    public static void setup(SymbolStore store ){
        NumericType u32 = new NumericType(32, false);
        NumericType s32 = new NumericType(32, true);
        store.addSymbol(new OperatorSymbol(new OperatorSymbol.OperatorSignature(Operator.AND,s32,s32,s32)) {
            @Override
            public Value generate(CodeBlock block, Value val) {
                throw new RuntimeException("Error");
            }

            @Override
            public Value generate(CodeBlock block, Value a, Value b) {

                if ( a instanceof ImmediateValue && b instanceof ImmediateValue )
                    return new ImmediateValue(((ImmediateValue) a).getValue() & ((ImmediateValue) b).getValue());

                Register _a = a.read(block);
                Register _b = b.read(block);

                Register d = block.getRegisterManager().createRegister();

                block.addInstruction(new RegisterInstruction(Operator.AND, d, _a, _b));

                return d;
            }
        });
        store.addSymbol(new OperatorSymbol(new OperatorSymbol.OperatorSignature(Operator.OR,s32,s32,s32)) {
            @Override
            public Value generate(CodeBlock block, Value val) {
                throw new RuntimeException("Error");
            }

            @Override
            public Value generate(CodeBlock block, Value a, Value b) {

                if ( a instanceof ImmediateValue && b instanceof ImmediateValue )
                    return new ImmediateValue(((ImmediateValue) a).getValue() | ((ImmediateValue) b).getValue());

                Register _a = a.read(block);
                Register _b = b.read(block);

                Register d = block.getRegisterManager().createRegister();

                block.addInstruction(new RegisterInstruction(Operator.OR, d, _a, _b));

                return d;
            }
        });
        store.addSymbol(new OperatorSymbol(new OperatorSymbol.OperatorSignature(Operator.XOR,s32,s32,s32)) {
            @Override
            public Value generate(CodeBlock block, Value val) {
                throw new RuntimeException("Error");
            }

            @Override
            public Value generate(CodeBlock block, Value a, Value b) {

                if ( a instanceof ImmediateValue && b instanceof ImmediateValue )
                    return new ImmediateValue(((ImmediateValue) a).getValue() ^ ((ImmediateValue) b).getValue());

                Register _a = a.read(block);
                Register _b = b.read(block);

                Register d = block.getRegisterManager().createRegister();

                block.addInstruction(new RegisterInstruction(Operator.XOR, d, _a, _b));

                return d;
            }
        });
        store.addSymbol(new OperatorSymbol(new OperatorSymbol.OperatorSignature(Operator.SUM,s32,s32,s32)) {
            @Override
            public Value generate(CodeBlock block, Value val) {
                throw new RuntimeException("Error");
            }

            @Override
            public Value generate(CodeBlock block, Value a, Value b) {

                if ( a instanceof ImmediateValue && b instanceof ImmediateValue )
                    return new ImmediateValue((((ImmediateValue) a).getValue()) +
                            (((ImmediateValue) b).getValue()) );

                Register _a = a.read(block);
                Register _b = b.read(block);

                Register d = block.getRegisterManager().createRegister();

                block.addInstruction(new RegisterInstruction(Operator.SUM, d, _a, _b));

                return d;
            }
        });
        store.addSymbol(new OperatorSymbol(new OperatorSymbol.OperatorSignature(Operator.SUB,s32,s32,s32)) {
            @Override
            public Value generate(CodeBlock block, Value val) {
                throw new RuntimeException("Error");
            }

            @Override
            public Value generate(CodeBlock block, Value a, Value b) {

                if ( a instanceof ImmediateValue && b instanceof ImmediateValue )
                    return new ImmediateValue((((ImmediateValue) a).getValue()) -
                            (((ImmediateValue) b).getValue()) );

                Register _a = a.read(block);
                Register _b = b.read(block);

                Register d = block.getRegisterManager().createRegister();

                block.addInstruction(new RegisterInstruction(Operator.SUB, d, _a, _b));

                return d;
            }
        });
        store.addSymbol(new OperatorSymbol(new OperatorSymbol.OperatorSignature(Operator.MUL,s32,s32,s32)) {
            @Override
            public Value generate(CodeBlock block, Value val) {
                throw new RuntimeException("Error");
            }

            @Override
            public Value generate(CodeBlock block, Value a, Value b) {

                if ( a instanceof ImmediateValue && b instanceof ImmediateValue )
                    return new ImmediateValue((((ImmediateValue) a).getValue()) *
                            (((ImmediateValue) b).getValue()) );

                Register _a = a.read(block);
                Register _b = b.read(block);

                Register d = block.getRegisterManager().createRegister();

                block.addInstruction(new RegisterInstruction(Operator.MUL, d, _a, _b));

                return d;
            }
        });
        store.addSymbol(new OperatorSymbol(new OperatorSymbol.OperatorSignature(Operator.DIV,s32,s32,s32)) {
            @Override
            public Value generate(CodeBlock block, Value val) {
                throw new RuntimeException("Error");
            }

            @Override
            public Value generate(CodeBlock block, Value a, Value b) {

                if ( a instanceof ImmediateValue && b instanceof ImmediateValue )
                    return new ImmediateValue((((ImmediateValue) a).getValue()) /
                            (((ImmediateValue) b).getValue()) );

                Register _a = a.read(block);
                Register _b = b.read(block);

                Register d = block.getRegisterManager().createRegister();

                block.addInstruction(new RegisterInstruction(Operator.DIV, d, _a, _b));

                return d;
            }
        });
        store.addSymbol(new OperatorSymbol(new OperatorSymbol.OperatorSignature(Operator.MOD,s32,s32,s32)) {
            @Override
            public Value generate(CodeBlock block, Value val) {
                throw new RuntimeException("Error");
            }

            @Override
            public Value generate(CodeBlock block, Value a, Value b) {

                if ( a instanceof ImmediateValue && b instanceof ImmediateValue )
                    return new ImmediateValue((((ImmediateValue) a).getValue()) +
                            (((ImmediateValue) b).getValue()) );

                Register _a = a.read(block);
                Register _b = b.read(block);

                Register d = block.getRegisterManager().createRegister();

                block.addInstruction(new RegisterInstruction(Operator.MOD, d, _a, _b));

                return d;
            }
        });
        store.addSymbol(new OperatorSymbol(new OperatorSymbol.OperatorSignature(Operator.AND,u32,u32,u32)) {
            @Override
            public Value generate(CodeBlock block, Value val) {
                throw new RuntimeException("Error");
            }

            @Override
            public Value generate(CodeBlock block, Value a, Value b) {

                if ( a instanceof ImmediateValue && b instanceof ImmediateValue )
                    return new ImmediateValue(((ImmediateValue) a).getValue() & ((ImmediateValue) b).getValue());

                Register _a = a.read(block);
                Register _b = b.read(block);

                Register d = block.getRegisterManager().createRegister();

                block.addInstruction(new RegisterInstruction(Operator.AND, d, _a, _b));

                return d;
            }
        });
        store.addSymbol(new OperatorSymbol(new OperatorSymbol.OperatorSignature(Operator.OR,u32,u32,u32)) {
            @Override
            public Value generate(CodeBlock block, Value val) {
                throw new RuntimeException("Error");
            }

            @Override
            public Value generate(CodeBlock block, Value a, Value b) {

                if ( a instanceof ImmediateValue && b instanceof ImmediateValue )
                    return new ImmediateValue(((ImmediateValue) a).getValue() | ((ImmediateValue) b).getValue());

                Register _a = a.read(block);
                Register _b = b.read(block);

                Register d = block.getRegisterManager().createRegister();

                block.addInstruction(new RegisterInstruction(Operator.OR, d, _a, _b));

                return d;
            }
        });
        store.addSymbol(new OperatorSymbol(new OperatorSymbol.OperatorSignature(Operator.XOR,u32,u32,u32)) {
            @Override
            public Value generate(CodeBlock block, Value val) {
                throw new RuntimeException("Error");
            }

            @Override
            public Value generate(CodeBlock block, Value a, Value b) {

                if ( a instanceof ImmediateValue && b instanceof ImmediateValue )
                    return new ImmediateValue(((ImmediateValue) a).getValue() ^ ((ImmediateValue) b).getValue());

                Register _a = a.read(block);
                Register _b = b.read(block);

                Register d = block.getRegisterManager().createRegister();

                block.addInstruction(new RegisterInstruction(Operator.XOR, d, _a, _b));

                return d;
            }
        });
        store.addSymbol(new OperatorSymbol(new OperatorSymbol.OperatorSignature(Operator.SUM,u32,u32,u32)) {
            @Override
            public Value generate(CodeBlock block, Value val) {
                throw new RuntimeException("Error");
            }

            @Override
            public Value generate(CodeBlock block, Value a, Value b) {

                if ( a instanceof ImmediateValue && b instanceof ImmediateValue )
                    return new ImmediateValue((((ImmediateValue) a).getValue()&0xFFFFFFFFL) +
                                              (((ImmediateValue) b).getValue()&0xFFFFFFFFL) );

                Register _a = a.read(block);
                Register _b = b.read(block);

                Register d = block.getRegisterManager().createRegister();

                block.addInstruction(new RegisterInstruction(Operator.SUM, d, _a, _b));

                return d;
            }
        });
        store.addSymbol(new OperatorSymbol(new OperatorSymbol.OperatorSignature(Operator.SUB,u32,u32,u32)) {
            @Override
            public Value generate(CodeBlock block, Value val) {
                throw new RuntimeException("Error");
            }

            @Override
            public Value generate(CodeBlock block, Value a, Value b) {

                if ( a instanceof ImmediateValue && b instanceof ImmediateValue )
                    return new ImmediateValue((((ImmediateValue) a).getValue()&0xFFFFFFFFL) -
                            (((ImmediateValue) b).getValue()&0xFFFFFFFFL) );

                Register _a = a.read(block);
                Register _b = b.read(block);

                Register d = block.getRegisterManager().createRegister();

                block.addInstruction(new RegisterInstruction(Operator.SUB, d, _a, _b));

                return d;
            }
        });
        store.addSymbol(new OperatorSymbol(new OperatorSymbol.OperatorSignature(Operator.MUL,u32,u32,u32)) {
            @Override
            public Value generate(CodeBlock block, Value val) {
                throw new RuntimeException("Error");
            }

            @Override
            public Value generate(CodeBlock block, Value a, Value b) {

                if ( a instanceof ImmediateValue && b instanceof ImmediateValue )
                    return new ImmediateValue((((ImmediateValue) a).getValue()&0xFFFFFFFFL) *
                            (((ImmediateValue) b).getValue()&0xFFFFFFFFL) );

                Register _a = a.read(block);
                Register _b = b.read(block);

                Register d = block.getRegisterManager().createRegister();

                block.addInstruction(new RegisterInstruction(Operator.MUL, d, _a, _b));

                return d;
            }
        });
        store.addSymbol(new OperatorSymbol(new OperatorSymbol.OperatorSignature(Operator.DIV,u32,u32,u32)) {
            @Override
            public Value generate(CodeBlock block, Value val) {
                throw new RuntimeException("Error");
            }

            @Override
            public Value generate(CodeBlock block, Value a, Value b) {

                if ( a instanceof ImmediateValue && b instanceof ImmediateValue )
                    return new ImmediateValue((((ImmediateValue) a).getValue()&0xFFFFFFFFL) /
                            (((ImmediateValue) b).getValue()&0xFFFFFFFFL) );

                Register _a = a.read(block);
                Register _b = b.read(block);

                Register d = block.getRegisterManager().createRegister();

                block.addInstruction(new RegisterInstruction(Operator.DIV, d, _a, _b));

                return d;
            }
        });
        store.addSymbol(new OperatorSymbol(new OperatorSymbol.OperatorSignature(Operator.MOD,u32,u32,u32)) {
            @Override
            public Value generate(CodeBlock block, Value val) {
                throw new RuntimeException("Error");
            }

            @Override
            public Value generate(CodeBlock block, Value a, Value b) {

                if ( a instanceof ImmediateValue && b instanceof ImmediateValue )
                    return new ImmediateValue((((ImmediateValue) a).getValue()&0xFFFFFFFFL) +
                            (((ImmediateValue) b).getValue()&0xFFFFFFFFL) );

                Register _a = a.read(block);
                Register _b = b.read(block);

                Register d = block.getRegisterManager().createRegister();

                block.addInstruction(new RegisterInstruction(Operator.MOD, d, _a, _b));

                return d;
            }
        });
        store.addSymbol(new OperatorSymbol(new OperatorSymbol.OperatorSignature(Operator.ASSIGN,u32,u32,u32)) {
            @Override
            public Value generate(CodeBlock block, Value val) {
                throw new RuntimeException("Error");
            }

            @Override
            public Value generate(CodeBlock block, Value a, Value b) {

                a.write(block, b);

                return b;

            }
        });
        store.addSymbol(new OperatorSymbol(new OperatorSymbol.OperatorSignature(Operator.ASSIGN,s32,s32,s32)) {
            @Override
            public Value generate(CodeBlock block, Value val) {
                throw new RuntimeException("Error");
            }

            @Override
            public Value generate(CodeBlock block, Value a, Value b) {

                a.write(block, b);

                return b;

            }
        });
    }

}
