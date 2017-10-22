package ds4.instaaaaa.api.models;

import android.media.Image;

import com.google.gson.annotations.SerializedName;

/**
 * Created by M6700 on 22.10.2017.
 */

public class ImagesApiModel {
    @SerializedName("thumbnail")
    ImageApiModel thumbnail;
    @SerializedName("low_resolution")
    ImageApiModel lowResolution;
    @SerializedName("standart_resolution")
    ImageApiModel standartResolution;
}
