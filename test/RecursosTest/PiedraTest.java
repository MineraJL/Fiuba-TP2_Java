package RecursosTest;

import Modelo.Excepciones.HerramientaDesgastadaExcepcion;
import Modelo.Herramientas.*;
import Modelo.MateriaPrima.MPPiedra;
import Modelo.MateriaPrima.MateriaPrima;
import Modelo.Recursos.*;
import Modelo.TipoMaterial.*;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PiedraTest {
        // Piedra Durabilidad
        @Test
        public void test01PiedraSeCreaConDurabilidad30() {
            Recurso piedra = new Piedra();
            assertEquals(30, piedra.durabilidad());

        }

        // Piedra reduce durabilidad
        @Test
        public void test02PiedraAlSerGolpeadoReduceSuDurabilidadEn4() {
            Recurso piedra = new Piedra();
            piedra.reducirDurabilidadEn(4);
            assertEquals(26, piedra.durabilidad());
        }


        // GOLPES HACHA

        // Golpe hacha de madera
        @Test
        public void test03PiedraNoReduceSuDurabilidadSiEsGolpeadoPorHachaDeMadera() throws HerramientaDesgastadaExcepcion {
            TipoMadera materialMadera = new TipoMadera();
            Herramienta hacha = new Hacha(materialMadera);
            Recurso piedra = new Piedra();
            hacha.golpear(piedra);
            assertEquals(30, piedra.durabilidad());
        }

        // Golpe hacha de Piedra
        @Test
        public void test04PiedraNoReduceSuDurabilidadSiEsGolpeadoPorHachaDePiedra() throws HerramientaDesgastadaExcepcion {
            TipoPiedra materialPiedra = new TipoPiedra();
            Herramienta hacha = new Hacha(materialPiedra);
            Recurso piedra = new Piedra();
            hacha.golpear(piedra);
            assertEquals(30, piedra.durabilidad());
        }

        // Golpe hacha de Metal
        @Test
        public void test05PiedraNoReduceSuDurabilidadEnDosSiEsGolpeadoPorHachaDeMetal() throws HerramientaDesgastadaExcepcion {
            TipoMetal materialMetal = new TipoMetal();
            Herramienta hacha = new Hacha(materialMetal);
            Recurso piedra = new Piedra();
            hacha.golpear(piedra);
            assertEquals(30, piedra.durabilidad());
        }

        // GOLPES PICO
        // Golpe Pico de Madera
        @Test
        public void test06PiedraReduceSuDurabilidadEn2SiEsGolpeadoPorPicoMadera() throws HerramientaDesgastadaExcepcion {
            TipoMadera materialMadera = new TipoMadera();
            Herramienta pico = new Pico(materialMadera);
            Recurso piedra = new Piedra();
            pico.golpear(piedra);
            assertEquals(28, piedra.durabilidad());
        }

        // Golpe Pico de Piedra
        @Test
        public void test07PiedraReduceSuDurabilidadEn4SiEsGolpeadoPorPicoPiedra() throws HerramientaDesgastadaExcepcion {
            TipoPiedra materialPiedra = new TipoPiedra();
            Herramienta pico = new Pico(materialPiedra);
            Recurso piedra = new Piedra();
            pico.golpear(piedra);
            assertEquals(26, piedra.durabilidad());
        }

        // Golpe Pico de Metal
        @Test
        public void test08PiedraReduceSuDurabilidadEn12SiEsGolpeadoPorPicoMetal() throws HerramientaDesgastadaExcepcion {
            TipoMetal materialMetal = new TipoMetal();
            Herramienta pico = new Pico(materialMetal);
            Recurso piedra = new Piedra();
            pico.golpear(piedra);
            assertEquals(18, piedra.durabilidad());
        }

        // GOLPES PICO FINO
        @Test
        public void test09PiedraNoReduceSuDurabilidadSiEsGolpeadoPorPicoFino() throws HerramientaDesgastadaExcepcion {
            TipoMetalYPiedra materialMetalYPiedra = new TipoMetalYPiedra();
            Herramienta pico = new PicoFino(materialMetalYPiedra);
            Recurso piedra = new Piedra();
            pico.golpear(piedra);
            assertEquals(30, piedra.durabilidad());
        }

        @Test
        public void test10RecursoPiedraSeTransformaEnMateriaPrimaPiedra() {
            Recurso piedra = new Piedra();
            MateriaPrima mpPiedra = new MPPiedra();

            piedra.reducirDurabilidadEn(30);

            assertEquals(mpPiedra, piedra.obtenerCasillero().ocupante());
        }

        @Test
        public void test11ocupantePiedraDevuelveSuNombre(){
            Piedra piedra = new Piedra();
            String nombre = piedra.obtenerNombreOcupante();
            assertEquals("Piedra",nombre);
        }


}
