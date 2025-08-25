public class Main {
    public static void main(String[] args) {
 
        Veiculo veiculo1 = new Carro("Toyota", "Corolla", 4);
        Veiculo veiculo2 = new Caminhao("Volvo", "FH", 25.5);

        System.out.println(veiculo1.toString());
        System.out.println(veiculo2.toString());

        System.out.println("\nDescrição com método descricao():");
        System.out.println(veiculo1.descricao());
        System.out.println(veiculo2.descricao());
    }
}