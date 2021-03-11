package kyu6;

import kyu6.AntiCamel;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AntiCamelTest {
    @Test
    public void tests() {
        assertEquals( "Incorrect", "camel Casing", AntiCamel.camelCase("camelCasing"));
        assertEquals( "Incorrect", "camel Casing Test", AntiCamel.camelCase("camelCasingTest"));
        assertEquals( "Incorrect", "camelcasingtest", AntiCamel.camelCase("camelcasingtest"));
    }
}
