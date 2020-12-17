package com.example.demo.entity;

public class BasicInfo {
    private String Content;
    private String Stage;
    private String Type;
    private String guid;
    private String QuesStdnContent;
    private String QuesContent;

    public String getQuesContent() {
        return QuesContent;
    }

    public void setQuesContent(String quesContent) {
        QuesContent = quesContent;
    }

    public String getQuesStdnContent() {
        return QuesStdnContent;
    }

    public void setQuesStdnContent(String quesStdnContent) {
        QuesStdnContent = quesStdnContent;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }



    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public String getStage() {
        return Stage;
    }

    public void setStage(String stage) {
        Stage = stage;
    }
}
