package com.oabraham.myrestapi.pojo;

public class CustomerResp {
    private final String statusMsg;
    private final int httpStatus;

    public CustomerResp(int httpStatus, String statusMsg) {
        this.httpStatus = httpStatus;
        this.statusMsg = statusMsg;
    }

    public String getStatusMsg() {
        return statusMsg;
    }

    public int getHttpStatus() { return httpStatus; }

}
