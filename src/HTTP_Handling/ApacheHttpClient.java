package HTTP_Handling;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;

import java.net.URI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
/**5
 * Created by sebas97012 on 5/26/17.
 */
public class ApacheHttpClient {
    /**
     * Clase interna encargada de llevar a cabo un delete con cuerpo
     */
    private static class HttpDeleteWithBody extends HttpEntityEnclosingRequestBase {
        public static final String METHOD_NAME = "DELETE";

        public String getMethod() {
            return METHOD_NAME;
        }

        public HttpDeleteWithBody(final String uri) {
            super();
            setURI(URI.create(uri));
        }

        public HttpDeleteWithBody(final URI uri) {
            super();
            setURI(uri);
        }

        public HttpDeleteWithBody() {
            super();
        }
    }

    /**
     * Metodo que lleva a cabo un GET
     *
     * @param url URL del servicio
     * @return La respuesta enviada por el servidor
     */
    public static String httpGet(String url) {
        String output = "";

        try {
            DefaultHttpClient httpClient = new DefaultHttpClient();
            HttpGet getRequest = new HttpGet(url);
            getRequest.addHeader("accept", "application/json");
            HttpResponse response = httpClient.execute(getRequest);

            if (response.getStatusLine().getStatusCode() != 200) { //Caso en el que no se realizo correctamente el GET
                throw new RuntimeException("Failed : HTTP error code : " + response.getStatusLine().getStatusCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
            output = br.readLine();

            httpClient.getConnectionManager().shutdown();

        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return output;
    }

    /**
     * Metodo encargado de llevar a cabo un POST
     *
     * @param url  URL del servicio
     * @param json Json que se desea enviar
     * @return La respuesta enviada por el servidor
     */
    public static String httpPost(String url, String json) {
        String output = "";

        try {
            DefaultHttpClient httpClient = new DefaultHttpClient();
            HttpPost postRequest = new HttpPost(url);
            StringEntity input = new StringEntity(json);
            input.setContentType("application/json");
            postRequest.setEntity(input);

            HttpResponse response = httpClient.execute(postRequest);

            if (response.getStatusLine().getStatusCode() != 200) { //Caso en el que no se realizo correctamente el POST
                throw new RuntimeException("Failed : HTTP error code : " + response.getStatusLine().getStatusCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
            output = br.readLine();

            httpClient.getConnectionManager().shutdown();

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return output;
    }

    /**
     * Metodo encargado de llevar a cabo un PUT
     *
     * @param url  URL del servicio
     * @param json Json que se desea enviar
     * @return La respuesta enviada por el servidor
     */
    public static String httpPut(String url, String json) {
        String output = "";

        try {
            DefaultHttpClient httpClient = new DefaultHttpClient();
            HttpPut putRequest = new HttpPut(url);
            StringEntity input = new StringEntity(json);
            input.setContentType("application/json");
            putRequest.setEntity(input);

            HttpResponse response = httpClient.execute(putRequest);

            if (response.getStatusLine().getStatusCode() != 200) { //Caso en el que no se realizo correctamente el GET
                throw new RuntimeException("Failed : HTTP error code : " + response.getStatusLine().getStatusCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
            output = br.readLine();

            httpClient.getConnectionManager().shutdown();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return output;
    }

    /**
     * Metodo encargado de llevar a cabo un DELETE
     *
     * @param url  URL del servicio
     * @param json Json que se desea enviar
     * @return La respuesta enviada por el servidor
     */
    public static String httpDelete(String url, String json) {
        String output = "";

        try {
            DefaultHttpClient httpClient = new DefaultHttpClient();
            HttpDeleteWithBody deleteRequest = new HttpDeleteWithBody(url);

            StringEntity input = new StringEntity(json);
            input.setContentType("application/json");
            deleteRequest.setEntity(input);

            HttpResponse response = httpClient.execute(deleteRequest);

            if (response.getStatusLine().getStatusCode() != 200) { //Caso en el que no se realizo correctamente el GET
                throw new RuntimeException("Failed : HTTP error code : " + response.getStatusLine().getStatusCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
            output = br.readLine();

            httpClient.getConnectionManager().shutdown();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return output;
    }
}