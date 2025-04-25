import java.io.FileWriter;
import java.io.IOException;

//Classe destinada a escrever o resultado de consultas de CEP
public class AddressWriter {

    public void writeAddress (String cep, String cepContent) {
        Address address = GsonSingleton.getInstance().fromJson(cepContent, Address.class);

        try (FileWriter writer = new FileWriter(String.format("%s.json", cep))){
            writer.write(GsonSingleton.getInstance().toJson(address));

        }catch (IOException e){
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
