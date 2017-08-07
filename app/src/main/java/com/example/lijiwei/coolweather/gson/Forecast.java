package com.example.lijiwei.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lijiwei on 2017/8/7.
 */

public class Forecast {

    public String date;

    @SerializedName("cond")
    public More more;

    @SerializedName("tmp")
    public Temperature temperature;

    public class Temperature {
        public String max;
        public String min;
    }

    public class More {
        @SerializedName("txt_d")
        public String info;
    }

}
