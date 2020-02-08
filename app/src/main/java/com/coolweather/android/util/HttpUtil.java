package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by liujie on 2020/2/8.
 * 工具类处理http请求
 */

public class HttpUtil {
    /**
     * @param address 传入请求的地址
     * @param callback 回调处理服务器响应
     */
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
