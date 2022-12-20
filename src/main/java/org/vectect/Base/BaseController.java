package org.vectect.Base;

import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;

public class BaseController {
    protected static final MediaType JSON = MediaType.get("application/json");
    protected OkHttpClient client = new OkHttpClient();
    protected ObjectMapper mapper = new ObjectMapper();
    public static HttpUrl petStoreUrl = new HttpUrl.Builder()
            .scheme("https")
            .host("petstore.swagger.io")
            .build();
}
