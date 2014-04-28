package untref.aydoo.graficador.test;

import org.junit.Assert;
import org.junit.Test;
import untref.aydoo.graficador.FuncionConstante;

public class FuncionConstanteTest {

    @Test
    public void evaluarEn5DeberiaRetornar9CuandoConstanteEs9() {

        final float constante = 9.0f;
        float x = 6.0f;

        FuncionConstante funcionConstante = new FuncionConstante(constante);

        Assert.assertEquals(constante, funcionConstante.evaluarEn(x), 0.0001);

    }

    @Test
    public void evaluarEn6DeberiaRetornar0CuandoConstanteEs0() {

        final float constante = 0.0f;
        float x = 6.0f;

        FuncionConstante funcionConstante = new FuncionConstante(constante);

        Assert.assertEquals(constante, funcionConstante.evaluarEn(x), 0.0001);

    }


}