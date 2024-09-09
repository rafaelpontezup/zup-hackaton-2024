package br.com.zup.hackton.palindromo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromoTest {

    /**
     * Cenário Happy-path
     *
     * Usa exemplos de palavras como estas:
     *  - ana, arara, mussum, mirim, ovo, reviver, socos, salas, ralar
     */
    @Test
    @DisplayName("deve ser um palindromo")
    public void t1() {
        // cenário
        Palindromo palindromo = new Palindromo();

        // ação e validação
        assertTrue(palindromo.isPalidromo("ana"));
        assertTrue(palindromo.isPalidromo("arara"));
        assertTrue(palindromo.isPalidromo("mussum"));
        assertTrue(palindromo.isPalidromo("mirim"));
        assertTrue(palindromo.isPalidromo("ovo"));
        assertTrue(palindromo.isPalidromo("reviver"));
        assertTrue(palindromo.isPalidromo("socos"));
        assertTrue(palindromo.isPalidromo("salas"));
        assertTrue(palindromo.isPalidromo("ralar"));
        assertTrue(palindromo.isPalidromo("e2e"));
        assertTrue(palindromo.isPalidromo("1-a-1"));
    }

    /**
     * Cenário de palavras óbvias que NÃO são palindromos
     */
    @Test
    @DisplayName("não deve ser um palindromo")
    public void t2() {
        // cenário
        Palindromo palindromo = new Palindromo();

        // ação e validação
        assertFalse(palindromo.isPalidromo("rafael"));
        assertFalse(palindromo.isPalidromo("guilhaume"));
        assertFalse(palindromo.isPalidromo("hackaton"));
        assertFalse(palindromo.isPalidromo("java"));
    }

    /**
     * Cenário Happy-path 2
     *
     * Usa exemplos de frase como estas:
     *  - Anotaram a data da maratona
     *  - Socorram-me subi no onibus em Marrocos
     */
    @Test
    @DisplayName("deve ser um palindromo quando texto for uma frase")
    public void t3() {
        // cenário
        Palindromo palindromo = new Palindromo();

        // ação e validação
        assertTrue(palindromo.isPalidromo("anotaram a data da maratona"));
        assertTrue(palindromo.isPalidromo("socorram-me subi no onibus em marrocos"));
    }

    /**
     * Cenário de case-insensitive
     */
    @Test
    @DisplayName("deve ser um palindromo quando texto possuir letras minusculas e maiusculas")
    public void t4() {
        // cenário
        Palindromo palindromo = new Palindromo();

        // ação e validação
        assertTrue(palindromo.isPalidromo("Ana"));
        assertTrue(palindromo.isPalidromo("ovO"));
        assertTrue(palindromo.isPalidromo("ARarA"));
        assertTrue(palindromo.isPalidromo("reVivER"));
        assertTrue(palindromo.isPalidromo("socorram-me subi no onibus em marrocos"));
    }

    /**
     * Cenário de caracteres acentuados
     */
    @Test
    @DisplayName("deve ser um palindromo quando texto possuir caracteres acentuados")
    public void t5() {
        // cenário
        Palindromo palindromo = new Palindromo();

        // ação e validação
        assertTrue(palindromo.isPalidromo("ána"));
        assertTrue(palindromo.isPalidromo("ôvo"));
        assertTrue(palindromo.isPalidromo("ôvó"));
        assertTrue(palindromo.isPalidromo("Socorram-me subi no ônibus em Marrocos"));
    }

    /**
     * TDD - Test-Driven Development
     *
     * Cenário de validação básica (não confie no seu usuário)
     */
    @Test
    @DisplayName("não deve ser um palindromo quando texto for nulo ou vazio")
    public void t7() {
        // cenário
        Palindromo palindromo = new Palindromo();

        // ação e validação
        assertFalse(palindromo.isPalidromo(null));
        assertFalse(palindromo.isPalidromo(""));
        assertFalse(palindromo.isPalidromo("".repeat(100)));
    }

}