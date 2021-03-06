package org.hisp.dhis.client.sdk.android.program;

import org.hisp.dhis.client.sdk.models.program.ProgramTrackedEntityAttribute;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

public interface ProgramTrackedEntityAttributeApiClientRetrofit {
    @GET("programTrackedEntityAttributes")
    Call<Map<String, List<ProgramTrackedEntityAttribute>>> getProgramTrackedEntityAttributes(@QueryMap Map<String, String> queryMap,
                                                                              @Query("filter") List<String> filters);
}
