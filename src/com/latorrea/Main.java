package com.latorrea;

public class Main {
    public static void main(String[] args) {

        String[] nombres={"Juan", "Maria", "lucia","Alberto","Julian"};

        concatena(nombres);





    }
    static void concatena (String nombres[]) {
        String concNom="";
        for (int i = 0; i < nombres.length; i++) {
            concNom =concNom + nombres[i];

        }
        System.out.println(concNom);
    }
}