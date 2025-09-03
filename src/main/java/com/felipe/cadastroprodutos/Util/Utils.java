package com.felipe.cadastroprodutos.Util;

import java.math.BigDecimal;

public class Utils {

    public static String validaTextoNumero(String texto) {

        if (texto == null || texto.trim().isEmpty() || !texto.matches("[\\p{L}\\p{N} ,.-]+")) {
            throw new IllegalArgumentException("Texto inválido.");

        }
        return texto;
    }

    public static BigDecimal validaValor(BigDecimal valor) {
        if (valor == null || valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw  new IllegalArgumentException("Valor inválido.");

        }
        return valor;
    }

    public static double validaPeso(Double peso){
        if (peso == null || peso <= 0){
            throw new IllegalArgumentException("Peso inválido.");
        }
        return peso;
    }
}