package com.manco.sample.util;

import static com.manco.sample.util.Global.ConnectState.AUTHENTICATE_FAILURE;
import static com.manco.sample.util.Global.ConnectState.CONNECT_FAILURE;
import static com.manco.sample.util.Global.ConnectState.CONNECT_SUCCESS;
import static com.manco.sample.util.Global.ConnectState.REFERESH;
import static com.manco.sample.util.Global.WiFiState.WIFI_DISABLED;
import static com.manco.sample.util.Global.WiFiState.WIFI_ENABLED;
import static com.manco.sample.util.Global.WiFiState.WIFI_ENABLEING;

/**
 * Created by Manco on 2016/10/9.
 */
public class Global {
    public static final int UNKNOWN = -10;
    public static final int AP_AVAILABLE = 0;

    public static final class WiFiState {
        public static final int WIFI_ENABLED = 1;
        public static final int WIFI_ENABLEING = 2;
        public static final int WIFI_DISABLED = 3;
    }

    public static final class ConnectState {
        public static final int AUTHENTICATE_FAILURE =4;
        public static final int CONNECT_SUCCESS = 5;
        public static final int CONNECT_FAILURE = 6;
        public static final int REFERESH = 7;
    }

    public static String getState(int state){
        String result = "";
        switch (state){
            case AP_AVAILABLE:
                result = "AP_AVAILABLE";
                break;
            case UNKNOWN:
                result = "UNKNOWN";
                break;
            case WIFI_ENABLED:
                result = "WIFI_ENABLED";
                break;
            case WIFI_ENABLEING:
                result = "WIFI_ENABLEING";
                break;
            case WIFI_DISABLED:
                result = "WIFI_DISABLED";
                break;
            case AUTHENTICATE_FAILURE:
                result = "AUTHENTICATE_FAILURE";
                break;
            case CONNECT_SUCCESS:
                result = "CONNECT_SUCCESS";
                break;
            case CONNECT_FAILURE:
                result = "CONNECT_FAILURE";
                break;
            case REFERESH:
                result = "REFERESH";
                break;
            default:
                break;
        }
        return result;
    }
}
