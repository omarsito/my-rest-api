package com.epam.myrestapi.pojo;

public class RootAPI {

    private final String statusMsg;
    private final String appVersion;
    private final int httpStatus;
    private final String apiName;

    public RootAPI(int httpStatus, String statusMsg, String appVersion, String apiName) {
        this.httpStatus = httpStatus;
        this.statusMsg = statusMsg;
        this.appVersion = appVersion;
        this.apiName = apiName;
    }

    public String getStatusMsg() {
        return statusMsg;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public int getHttpStatus() { return httpStatus; }

    public String getApiName() { return apiName; }
}