package HTTP_Handling;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

/**
 * Created by Arturo on 18/5/2017.
 */
public class JsonManager<T> {
    public static final ObjectMapper JSON_MAPPER = new ObjectMapper();

    public T jsonToObject(String jsonString, Class<T> clazz){
        T objeto = null;
        try {
            objeto = JSON_MAPPER.readValue(jsonString, clazz); //Se lee el json y se crea el objeto
        } catch (IOException e) {
            e.printStackTrace();
        }

        return objeto;
    }


    public String objectToJson(T objeto) {
        String jsonString = null;

        try {
            jsonString = JSON_MAPPER.writeValueAsString(objeto); //Se crea un string con el json de la instancia
        } catch (IOException e) {
            e.printStackTrace();
        }

        return jsonString;
    }
}