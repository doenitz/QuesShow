package com.example.demo.entity;
/**
 * @author 尹诚
 * @parm
 * @date 2020/6/2 17:14
 */
public class Category {
    private String Guid;
    private String Stage;
    private String SubStage;
    private String Type;
    private String Genre;
    private String NewProperty;
    private String AnswerWay;
    private String TopicForm;
    private int OptionNum;
    private int AudioTime;
    private int QuesBodyNum;
    private int QuesAskNum;
    private int AnswerWord;
    private String QuesAskForm;
    private String Area;
    private int compositionNum;
    private int QuesChildCount;
    private int isUsed;
    private int sentenceNum;
    private String childNumProperty;

    public int getSentenceNum() {
        return sentenceNum;
    }

    public void setSentenceNum(int sentenceNum) {
        this.sentenceNum = sentenceNum;
    }

    public String getChildNumProperty() {
        return childNumProperty;
    }

    public void setChildNumProperty(String childNumProperty) {
        this.childNumProperty = childNumProperty;
    }

    public String getGuid() {
        return Guid;
    }

    public void setGuid(String guid) {
        Guid = guid;
    }

    public String getSubStage() {
        return SubStage;
    }

    public void setSubStage(String subStage) {
        SubStage = subStage;
    }

    public String getStage() {
        return Stage;
    }

    public void setStage(String stage) {
        Stage = stage;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public String getNewProperty() {
        return NewProperty;
    }

    public void setNewProperty(String newProperty) {
        NewProperty = newProperty;
    }

    public String getAnswerWay() {
        return AnswerWay;
    }

    public void setAnswerWay(String answerWay) {
        AnswerWay = answerWay;
    }

    public String getTopicForm() {
        return TopicForm;
    }

    public void setTopicForm(String topicForm) {
        TopicForm = topicForm;
    }

    public int getOptionNum() {
        return OptionNum;
    }

    public void setOptionNum(int optionNum) {
        OptionNum = optionNum;
    }

    public int getAudioTime() {
        return AudioTime;
    }

    public void setAudioTime(int audioTime) {
        AudioTime = audioTime;
    }

    public int getQuesBodyNum() {
        return QuesBodyNum;
    }

    public void setQuesBodyNum(int quesBodyNum) {
        QuesBodyNum = quesBodyNum;
    }

    public int getQuesAskNum() {
        return QuesAskNum;
    }

    public void setQuesAskNum(int quesAskNum) {
        QuesAskNum = quesAskNum;
    }

    public int getAnswerWord() {
        return AnswerWord;
    }

    public void setAnswerWord(int answerWord) {
        AnswerWord = answerWord;
    }

    public String getQuesAskForm() {
        return QuesAskForm;
    }

    public void setQuesAskForm(String quesAskForm) {
        QuesAskForm = quesAskForm;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String area) {
        Area = area;
    }

    public int getCompositionNum() {
        return compositionNum;
    }

    public void setCompositionNum(int compositionNum) {
        this.compositionNum = compositionNum;
    }

    public int getQuesChildCount() {
        return QuesChildCount;
    }

    public void setQuesChildCount(int quesChildCount) {
        QuesChildCount = quesChildCount;
    }

    public int getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(int isUsed) {
        this.isUsed = isUsed;
    }
}
