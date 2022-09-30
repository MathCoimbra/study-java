package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

    public static void main(String[] args) {

        List<String> numerosAleatorios = Arrays.asList("1", "0", "5", "9", "4", "6", "7");

        System.out.println("Todos os elementos da lista:");
        /* método para listar os valores da lista */
        numerosAleatorios.stream().forEach(System.out::println);

        System.out.println();

        System.out.println("Cinco primeiros números da lista dentro de uma outra lista (no caso abaixo um Set:)");
        numerosAleatorios.stream()
                /* método que limita o quanto será exibido */
                .limit(5)
                /* método que coleta os dados e armazena em outra lista do tipo Set*/
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println();

        System.out.println("Transformando a lista de strings em uma outra lista de números inteiros");
        List<Integer> numerosInteiros = numerosAleatorios.stream()
                /* método para transformar os itens da lista em inteiros */
                .map(Integer::parseInt)
                /*  método que coleta os dados e armazena em outra lista do tipo List */
                .collect(Collectors.toList());

        numerosInteiros.forEach(System.out::println);

        System.out.println();

        System.out.println("Nova lista com numeros pares e maiores que 2: ");
        List<Integer> listaParesMaioresQue2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> (i % 2 == 0 && i > 2))
                .collect(Collectors.toList());
        System.out.println(listaParesMaioresQue2);

        System.out.println();

        System.out.println("Média dos números");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println();

        System.out.println("Lista sem números impares");
        numerosInteiros.removeIf(i-> (i % 2 != 0));
        System.out.println(numerosInteiros);

        List<Integer> numerosPares = Arrays.asList(2, 3, 5, 7, 11, 13, 18, 34);

        numerosPares.removeIf(i -> (i % 2 == 0));

        System.out.print(numerosPares);
    }
}
