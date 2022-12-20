package org.vectect.Controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.*;
import org.vectect.Base.BaseController;
import org.vectect.model.PetStore.Pet;

import java.io.IOException;

public class PetStoreController extends BaseController {

    public Response getPet(int id) throws IOException {
        HttpUrl url = petStoreUrl.newBuilder()
                .addPathSegments("v2/pet")
                .addPathSegment(Integer.toString(id))
                .build();
        Request req = new Request.Builder().url(url).get().build();
        Call call = client.newCall(req);
        Response response = call.execute();
        return response;
    }

    public Response addPet(Pet pet) throws IOException {
        HttpUrl url = new HttpUrl.Builder()
                .scheme("https")
                .host("petstore.swagger.io")
                .addPathSegments("v2/pet")
                .build();
        RequestBody body = RequestBody.Companion.create(mapper.writeValueAsString(pet), JSON);
        Request req = new Request.Builder().url(url).post(body).build();
        System.out.println(mapper.writeValueAsString(pet));
        Call call = client.newCall(req);
        Response response = call.execute();
        return response;
    }

}
