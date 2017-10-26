package com.fbart.research.strategy.message;

public class MessageEntrance {


    public static void main(String[] args) {
        MessageService messageService = new MessageServiceImpl();

        MessageParamImpl messageParam = new MessageParamImpl();
        messageParam.setMobile("13561110111");
        messageService.send(messageParam);
    }
}
