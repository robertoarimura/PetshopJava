import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int quantidade;

        do{
            System.out.print("Quantos animais deseja cadastrar?: ");
            quantidade = sc.nextInt();
            sc.nextLine();

            if(quantidade <= 0){
                System.out.println("Você deve cadastrar pelo menos 1 animal");
            }
        }while(quantidade <=0);


        for(int i = 0; i < quantidade; i++){
            System.out.printf("\nAnimal %d:\n", i + 1);
            System.out.print("É um cachorro ou gato?: ");
            String tipo = sc.nextLine().trim().toLowerCase();

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();
            sc.nextLine();

            if(tipo.equals("cachorro")){
                list.add(new Cachorro(nome, idade));
            }else if(tipo.equals("gato")){
                list.add(new Gato(nome, idade));
            }else{
                System.out.print("Animal inválido!");
            }
        }

        System.out.println("---------------------------");
        System.out.println("Lista de Animais cadastrados");
        System.out.println("---------------------------");

        for (Animal animal : list){
            animal.exibirDados();
            animal.fazerSom();
            System.out.println();
        }
    }
}
