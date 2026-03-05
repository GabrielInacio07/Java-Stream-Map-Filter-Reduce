import java.util.*;

class Main{
    public static void main(String[] args) {

        //LIST
        List<String> funcionarios = new ArrayList<>();

        funcionarios.add("João");
        funcionarios.add("Maria");
        funcionarios.add("Pedro");

        System.out.println(funcionarios.get(2));

        //Set
        Set<String> produtos = new HashSet<>();

        produtos.add("Agua");
        produtos.add("H20 limão");
        produtos.add("Agua");

        System.out.println(produtos );

        //Map
        Map<Integer,String> cliente = new HashMap<>();

        cliente.put(1,"Gabriel");
        cliente.put(2,"Lucas");
        cliente.put(3,"Sérgio");

        System.out.println(cliente);
    }
}