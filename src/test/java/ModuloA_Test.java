import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Ecolon on 2/6/2016.
 */
public class ModuloA_Test {

    @Test
    public void test(){

        ModuloA moduloa = new ModuloA();

        assertEquals("El resultado debe ser -1",-1,moduloa.return_num());

    }


    @Test

    public void test2(){

        ModuloA moduloa = new ModuloA();

        assertEquals("El resultado debe ser 0",0,moduloa.return_num() + 1);

    }
}
