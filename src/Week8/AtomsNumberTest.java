package Week8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AtomsNumberTest {

    @Test
    void test1() {
        Atoms_Number obj= new Atoms_Number();
        String res = obj.getFormula("Mg3(OH2)2");
        assertEquals(res,"H4Mg3O2");
    }

    @Test
    void test2() {
        Atoms_Number obj= new Atoms_Number();
        String res = obj.getFormula("Mg(OH)2");
        assertEquals(res,"H2MgO2");
    }

    @Test
    void test3() {
        Atoms_Number obj= new Atoms_Number();
        String res = obj.getFormula("H2O");
        assertEquals(res,"H2O");
    }
}