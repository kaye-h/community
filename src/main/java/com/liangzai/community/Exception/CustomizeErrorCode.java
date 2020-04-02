package com.liangzai.community.Exception;

public enum CustomizeErrorCode implements ICustomizeErrorCode {
    QUESTION_NOT_FROUND("你找的问题不在了，要不要换个试试？");
    private String message;

    CustomizeErrorCode(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
