import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        System.out.println("Ex03");

        List<String> usuarios = new ArrayList<>(List.of("Admin", "Gabriel", "João"));

        Scanner input = new Scanner(System.in);

        System.out.print("Digite qual a colocação de usuário que deseja buscar: ");
        int posicao = Integer.parseInt(input.nextLine()) -1;

        if(posicao >= usuarios.size() || posicao < 0){
            throw new IllegalArgumentException("[Inválido] posição não coerente número de usuários: " + usuarios.size());
        }

        String busca = usuarios.get(posicao);
        System.out.println("Usuário encontrado: " + busca);
        System.out.println("Total de usuários: " + usuarios.size());


        input.close();
    }
}