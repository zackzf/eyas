package com.fbart.research.strategy.message;

import java.util.Map;

public class MessageParamImpl implements MessageParam{
    private String mobile;

    private Integer messageType;

    private Map<String, String> messageParams;

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setMessageType(Integer messageType) {
        this.messageType = messageType;
    }

    public void setMessageParams(Map<String, String> messageParams) {
        this.messageParams = messageParams;
    }

    @Override
    public String getMobile() {
        return this.mobile;
    }

    @Override
    public Integer getMessageType() {
        return this.messageType;
    }

    @Override
    public Map<String, String> getMessageParams() {
        return this.messageParams;
    }
}
