package com.pappayaed.data.remote;

import com.pappayaed.data.listener.DataListener;

/**
 * Created by yasar on 22/3/18.
 */

public interface RemoteDataSource {


    void login(String json, DataListener dataListener);

    void getStudentProfile(String json, DataListener dataListener);

    void getAllProfile(String json, DataListener dataListener);

    void getStudentFeeList(String json, DataListener dataListener);

    void getStudentAtttendanceList(String json, DataListener dataListener);

    void getCircularAndHomeWork(String json, DataListener dataListener);

    void getAttachment_id_data(String json, DataListener dataListener);

    void getStandard_fee_collection(String json, DataListener dataListener);


}
