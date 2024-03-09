package com.epam.myrestapi.pojo;

public class RootAPI {

    private final String statusMsg;
    private final String appVersion;
    private final int httpStatus;

    public RootAPI(int httpStatus, String statusMsg, String appVersion) {
        this.httpStatus = httpStatus;
        this.statusMsg = statusMsg;
        this.appVersion = appVersion;
    }

    public String getStatusMsg() {
        return statusMsg;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public int getHttpStatus() { return httpStatus; }
}