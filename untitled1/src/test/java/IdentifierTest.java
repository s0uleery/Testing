import Identifier.Identifier;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IdentifierTest {

    @Test
    public void testPrimerIdentificador(){
        Identifier id = new Identifier();
        boolean resultado = id.validateIdentifier( "a1");
        assertEquals(true,resultado);
    }
    @Test
    public void testSegundoIdentificador(){
        Identifier id = new Identifier();
        boolean resultado = id.validateIdentifier( "");
        assertEquals(true,resultado);
    }
    @Test
    public void testTercerIdentificador(){
        Identifier id = new Identifier();
        boolean resultado = id.validateIdentifier( "A1b2C3d");
        assertEquals(true,resultado);
    }
    @Test
    public void testCuartoIdentificador(){
        Identifier id = new Identifier();
        boolean resultado = id.validateIdentifier( "2B3");
        assertEquals(true,resultado);
    }
    @Test
    public void testQuintoIdentificador(){
        Identifier id = new Identifier();
        boolean resultado = id.validateIdentifier( "Z#12");
        assertEquals(true,resultado);
    }
}
