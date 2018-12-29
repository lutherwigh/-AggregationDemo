package outlook.luxi96.module_gank.model.converter;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Converter;

public class CustomGsonResponseBodyConvert<T> implements Converter<ResponseBody,T> {

    private final String TAG = getClass().getSimpleName();

    private final Gson gson;
    private final TypeAdapter<T> adapter;

    CustomGsonResponseBodyConvert(Gson gson, TypeAdapter<T> adapter) {
        this.gson = gson;
        this.adapter = adapter;
    }
    @Override public T convert(ResponseBody value) throws IOException {
        JsonReader jsonReader = gson.newJsonReader(value.charStream());
        Log.d(TAG,"response " + value.toString());
        jsonReader.setLenient(true);
        try {
            return adapter.read(jsonReader);
        }
        finally {
            value.close();
        }
    }

}
