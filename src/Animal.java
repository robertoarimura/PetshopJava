public class Animal {
    String nome;
    int idade;

    Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void fazerSom(){
        System.out.println("Som genérico do animal");
    }

    public void exibirDados(){
        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Idade: %d\n", idade);
    }
}
