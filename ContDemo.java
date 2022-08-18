package com.livro;

public class ContDemo {

    public static void main(String[] args) {

        int i;
        System.out.println("Exibindo numeros pares \n");

        for (i = 0; i < 100; i++) {
            if ((i % 2) != 0) continue;

            System.out.println(i);
        }
    }
}
