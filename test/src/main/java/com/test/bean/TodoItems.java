package com.test.bean;

import java.util.Date;

public class TodoItems {
    private Long todoItemId;

    private Long userId;

    private String todoItemTitle;

    private String todoItemContent;

    private String priority;

    private Date creationDate;

    private Date lastUpdateDate;

    private String comments;

    public TodoItems(Long todoItemId, Long userId, String todoItemTitle, String todoItemContent) {
        this.todoItemId = todoItemId;
        this.userId = userId;
        this.todoItemTitle = todoItemTitle;
        this.todoItemContent = todoItemContent;
    }

    public TodoItems(Long todoItemId, Long userId, String todoItemTitle, String todoItemContent, String priority, Date creationDate, Date lastUpdateDate, String comments) {
        this.todoItemId = todoItemId;
        this.userId = userId;
        this.todoItemTitle = todoItemTitle;
        this.todoItemContent = todoItemContent;
        this.priority = priority;
        this.creationDate = creationDate;
        this.lastUpdateDate = lastUpdateDate;
        this.comments = comments;
    }

    public TodoItems() {
    }

    public Long getTodoItemId() {
        return todoItemId;
    }

    public void setTodoItemId(Long todoItemId) {
        this.todoItemId = todoItemId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getTodoItemTitle() {
        return todoItemTitle;
    }

    public void setTodoItemTitle(String todoItemTitle) {
        this.todoItemTitle = todoItemTitle == null ? null : todoItemTitle.trim();
    }

    public String getTodoItemContent() {
        return todoItemContent;
    }

    public void setTodoItemContent(String todoItemContent) {
        this.todoItemContent = todoItemContent == null ? null : todoItemContent.trim();
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority == null ? null : priority.trim();
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }
}