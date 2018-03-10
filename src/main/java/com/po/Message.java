package com.po;

import java.sql.Timestamp;

public class Message extends BaseEntity {
    public static final int MESSAGE_IS_READ = 1;
    public static final int MESSAGE_IS_NOT_READ = 0;
    public static final int MESSAGE_IS_TAG = 2;
    public static final int MESSAGE_IS_DELETED = 1;
    public static final int MESSAGE_IS_NOT_DELETED = 0;

    private int id;
    private MsgType msgType;
    private String msgTheme;
    private String msgInfo;
    private Integer createMsgId;
    private Integer MessageIsDeleted;
    private Integer MessageIsRead;
    private Timestamp messageCreateTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public MsgType getMsgType() {
        return msgType;
    }

    public void setMsgType(MsgType msgType) {
        this.msgType = msgType;
    }

    public String getMsgTheme() {
        return msgTheme;
    }

    public void setMsgTheme(String msgTheme) {
        this.msgTheme = msgTheme;
    }

    public String getMsgInfo() {
        return msgInfo;
    }

    public void setMsgInfo(String msgInfo) {
        this.msgInfo = msgInfo;
    }

    public Integer getCreateMsgId() {
        return createMsgId;
    }

    public void setCreateMsgId(Integer createMsgId) {
        this.createMsgId = createMsgId;
    }

    public Integer getMessageIsDeleted() {
        return MessageIsDeleted;
    }

    public void setMessageIsDeleted(Integer messageIsDeleted) {
        MessageIsDeleted = messageIsDeleted;
    }

    public Integer getMessageIsRead() {
        return MessageIsRead;
    }

    public void setMessageIsRead(Integer messageIsRead) {
        MessageIsRead = messageIsRead;
    }

    public Timestamp getMessageCreateTime() {
        return messageCreateTime;
    }

    public void setMessageCreateTime(Timestamp messageCreateTime) {
        this.messageCreateTime = messageCreateTime;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", msgType=" + msgType +
                ", msgTheme='" + msgTheme + '\'' +
                ", msgInfo='" + msgInfo + '\'' +
                ", createMsgId=" + createMsgId +
                ", MessageIsDeleted=" + MessageIsDeleted +
                ", MessageIsRead=" + MessageIsRead +
                ", messageCreateTime=" + messageCreateTime +
                '}';
    }
}
