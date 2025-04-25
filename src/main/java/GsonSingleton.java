import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

// Classe singleton para instanciar o Gson, garantindo acesso global.
public class GsonSingleton {
    private static final Gson GSON = new GsonBuilder()
//            .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
            .setPrettyPrinting()
            .create();

    public static Gson getInstance (){
        return GSON;
    }
}
