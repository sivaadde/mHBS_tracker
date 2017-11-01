package org.hisp.dhis.client.sdk.ui.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;
import java.util.Map;

import static org.hisp.dhis.client.sdk.utils.Preconditions.isNull;

public class ReportEntity implements Parcelable {
    private final String id;
    private final Status status;

    private final Map<String, String> dataElementMap;

    public ReportEntity(String id, Status status, Map<String, String> dataElementMap) {
        this.id = isNull(id, "id must not be null");
        this.status = isNull(status, "status must not be null");
        this.dataElementMap = dataElementMap;
    }

    public String getId() {
        return id;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(id);
        dest.writeString(status.name());
        dest.writeMap(dataElementMap);
    }

    public static final Parcelable.Creator<ReportEntity> CREATOR
            = new Parcelable.Creator<ReportEntity>() {
        public ReportEntity createFromParcel(Parcel in) {
            return new ReportEntity(in);
        }

        public ReportEntity[] newArray(int size) {
            return new ReportEntity[size];
        }
    };

    private ReportEntity(Parcel in) {
        id = in.readString();
        status = Status.valueOf(in.readString());
        dataElementMap = new HashMap<>();
        in.readMap(dataElementMap, null);
    }

    public String getValueForDataElement(String uid) {

        if (!dataElementMap.containsKey(uid)) {
            return "none";
        }

        return dataElementMap.get(uid);
    }

    public enum Status {
        SENT, TO_UPDATE, TO_POST, ERROR
    }
}
