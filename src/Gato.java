public class Gato extends Animal{

    Gato(String nome, int idade){
        super(nome, idade);
    }
    @Override
    public void fazerSom(){
        System.out.println("O gato mia: Miau!");
    }
}

