import java.util.ArrayList;
import java.util.List;

class Main{
    public static void main(String[] args) {
        //Stream
        List<String> funcionarios = List.of("Gabriel","Lucas","Victor","Ana");


        // filter: filtra apenas os nomes que possuem tamanho menor ou igual a 5 caracteres
        List<String> filtragemNome = funcionarios
                .stream()
                .filter(element -> element.length() <= 5).toList();


        System.out.println(funcionarios);
        System.out.println(filtragemNome);


        List<Double> valorVendas = List.of(500.0,400.0,200.0);

        // map: transforma cada valor da lista
        List<Double> comissao = valorVendas
                .stream()
                .map(valor -> (valor * 0.05)).toList();

        System.out.println(valorVendas);
        System.out.println(comissao);

        // reduce: reduz todos os valores da lista para um único valor
        double totalVendas = valorVendas
                .stream()
                .reduce(0.0,Double::sum);

        System.out.println("Total valor das vendas: " + totalVendas);
    }
}