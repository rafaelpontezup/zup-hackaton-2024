package br.com.zup.hackton.palindromo;

import org.apache.commons.lang3.StringUtils;

/**
 * Algumas palavras e frases:
 *
 * ana, arara, mussum, mirim, ovo, reviver, socos, salas, ralar, e2e, 1-a-1
 * anotaram a data da maratona
 * socorram-me subi no onibus em marrocos
 *
 * https://codepen.io/jeffreypoland/pen/iuItG
 * https://gist.github.com/marufsiddiqui/9938268
 * https://gist.github.com/rponte/893494
 * https://www.baeldung.com/java-remove-accents-from-text
 */
public class Palindromo {

    /**
     * Passos importantes para conduzir:
     *
     * - Passo-1: implementa SOMENTE algoritimo para Palavra;
     * - Passo-2: implementa SOMENTE algoritimo para Palavra com case-insensitive;
     * - Passo-3: implementa algoritimo para Frase com espaços em branco e outros caracteres;
     * -- TDD - aplicar e explicar --
     * - Passo-4: implementa algoritimo para lidar com acentuação;
     *      - 4.1. ou remove os acentos ANTES do replaceAll()
     *      - 4.2. ou remove os acentos DEPOIS do replaceAll() mas trocando para regex "[^\\p{L}\\p{N}]"
     * - Passo-5: implementa validação para texto nulo ou vazio;
     */
    public boolean isPalidromo(String texto) {

        if (texto == null || texto.isBlank()) {
            return false;
        }

        texto = texto.toLowerCase(); // passo 2
        texto = StringUtils.stripAccents(texto); // passo 4
        texto = texto.replaceAll("[^a-zA-Z0-9]", ""); // passo 3

        // passo 4
        // texto = texto.replaceAll("[^\\p{L}\\p{N}]", ""); // passo 4
        // texto = StringUtils.stripAccents(texto);

        // passo 1
        int tamanho = texto.length();
        for (int i=0; i < tamanho; i++) {
            int finalDoTexto = (tamanho - 1 - i);
            if (texto.charAt(i) != texto.charAt(finalDoTexto)) {
                return false;
            }
        }

        return true;
        // passo 1: refactoring
//        return texto.equals(new StringBuilder(texto).reverse().toString());
    }

}
