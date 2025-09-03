package com.felipe.cadastroprodutos.Util;

public class Utils {

    public static String validaTextoNumero(String texto) {

            if (texto == null || texto.trim().isEmpty() || !texto.matches("[\\p{L}\\p{N} ,.-]+")) {
            throw new IllegalArgumentException("Texto inválido.");

        }
            return texto;
    }
}
