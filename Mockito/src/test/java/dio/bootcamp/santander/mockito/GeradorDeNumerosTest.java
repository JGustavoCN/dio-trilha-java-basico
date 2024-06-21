/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package dio.bootcamp.santander.mockito;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.when;

/**
 * Teste da classe {@Link GeradorDeNumeros} exemplificando testes de métodos estáticos
 * 
 * No Mockito, quando você usa mocks estáticos, você deve garantir que cada mock estático 
 * seja fechado adequadamente antes de criar um novo mock estático. Para resolver esse problema, 
 * você pode usar um bloco try-with-resources para garantir que o mock estático seja fechado corretamente após o uso.
 * 
 * @author José 
 */
@ExtendWith(MockitoExtension.class)
public class GeradorDeNumerosTest {

    @Test
    void validaGeracaoListaDeNumeros() {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8);

        try (MockedStatic<GeradorDeNumeros> gerador = Mockito.mockStatic(GeradorDeNumeros.class)) {
            gerador.when(() -> GeradorDeNumeros.geraNumerosAleatorios(anyInt())).thenReturn(integers);

            assertEquals(integers, GeradorDeNumeros.geraNumerosAleatorios(8));
        }
    }

    @Test
    void validaGeracaoListaDeNumerosSemInformarTamanho() {
        List<Integer> integers = List.of(10, 9, 8, 6);

        try (MockedStatic<GeradorDeNumeros> gerador = Mockito.mockStatic(GeradorDeNumeros.class)) {
            gerador.when(GeradorDeNumeros::geraNumerosAleatorios).thenReturn(integers);

            assertEquals(integers, GeradorDeNumeros.geraNumerosAleatorios());
        }
    }
}
