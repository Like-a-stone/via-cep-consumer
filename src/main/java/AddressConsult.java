import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

//Classe responsavel pela consulta de enderecos
public class AddressConsult {

    public String consultAddressByCep(String cep){
        if (isCep(cep)) {
            try {
                String addressUrl = String.format("https://viacep.com.br/ws/%s/json/", cep);
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(addressUrl))
                        .build();

                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                return response.body();

            } catch (IOException | InterruptedException e) {
                System.out.println("Erro ao consultar o endereço: "+ e.getMessage());
                return null;
            }
        } else {
            System.out.printf("O CEP %s não possui um formato válido (xxxxxxxx).%n", cep);
            return null;
        }
    }

    // Metodo para realizar validaçao básica para entrada de cep
    private boolean isCep(String cep){
        if(cep.length() != 8){
            return false;
        }
        try{
            Integer.parseInt(cep);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
