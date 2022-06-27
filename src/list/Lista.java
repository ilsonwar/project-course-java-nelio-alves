package list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();


        list.add("MARIA");
        list.add("ALEX");
        list.add("BOB");
        list.add("ANNA");
        list.add(2,"MARY");

        System.out.println(list.size()); //mostra tamnho da lista

        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("----------------");
       // list.remove(1);
        list.removeIf(x -> x.charAt(0) == 'M'); //remove todos com caracter especificado

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("-------------------------");
        System.out.println("Index of bob: "+list.indexOf("BOB")); //PROCURAR ONDE ESTÁ O NOME NA LISTA

        System.out.println("----------------------");
        List<String> result = list.stream().filter(x ->x.charAt(0) == 'A').collect(Collectors.toList());
        //filtra somente os nomes qe começam com A, e cria uma nova lista
        for (String x : result) {
            System.out.println(x);
        }
        System.out.println("----------------------");

        String name = list.stream().filter(x ->x.charAt(0) == 'A').findFirst().orElse("Nome não encontrado");
        System.out.println(name);

    }
}
