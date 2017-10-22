package ds4.instaaaaa.api.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by M6700 on 23.10.2017.
 */

public class ItemsApiModel {
    @SerializedName("items")
    List<PostApiModel> items;

}
