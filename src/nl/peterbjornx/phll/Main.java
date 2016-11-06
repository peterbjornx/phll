package nl.peterbjornx.phll;

import nl.peterbjornx.phll.parse.HllParser;
import nl.peterbjornx.phll.parse.ParseException;
import nl.peterbjornx.phll.symbol.SymbolStore;
import nl.peterbjornx.phll.symbol.builtin.IntegerOperators;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Part of PortableHLL
 * @author Peter Bosch <peterbosc@gmail.com>
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException, ParseException {
        HllParser parser = new HllParser(new FileReader(args[0]));

        HllParser.store = new SymbolStore();
        IntegerOperators.setup(parser.store);

        parser.source_unit();
    }

}
