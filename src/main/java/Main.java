import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        AddressConsult addressConsult = new AddressConsult();
        AddressWriter addressWriter = new AddressWriter();
        Scanner scan = new Scanner(System.in);
        String userInput = "";

        while (true){
            System.out.println("Digite o cep que deseja salvar informações ou digite sair para terminar: ");
            userInput = scan.nextLine().trim();
            System.out.println("Você digitou: " + userInput);

            if (userInput.equalsIgnoreCase("sair")) break;

            String response = addressConsult.consultAddressByCep(userInput);
            if (response != null){
                addressWriter.writeAddress(userInput, response);
                System.out.println("Endereço salvo com sucesso!");
            }
        }
        scan.close();
        System.out.println("Programa encerrado. Até logo!");
    }
}
