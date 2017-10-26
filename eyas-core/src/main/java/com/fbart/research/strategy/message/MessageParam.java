package com.fbart.research.strategy.message;

import java.util.Map;

public interface MessageParam {
    String getMobile();

    Integer getMessageType();

    Map<String, String> getMessageParams();
}
