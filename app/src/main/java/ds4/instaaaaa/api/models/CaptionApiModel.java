package ds4.instaaaaa.api.models;

import android.provider.ContactsContract;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.security.Timestamp;

/**
 * Created by M6700 on 21.10.2017.
 */

public class CaptionApiModel {
    @SerializedName("id")
    String id;
    @SerializedName("text")
    String text;
    @SerializedName("created_time")
    String created;
    @SerializedName("from")
    ContactsContract.Profile author;

    public CaptionApiModel() {

    }

    public CaptionApiModel(String id, String text, String created, ContactsContract.Profile author) {
        this.id = id;
        this.text = text;
        this.created = created;
        this.author = author;
    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getCreated() {
        return created;
    }

    public ContactsContract.Profile getAuthor() {
        return author;
    }
}
