package com.test.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TodoItemsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TodoItemsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTodoItemIdIsNull() {
            addCriterion("TODO_ITEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andTodoItemIdIsNotNull() {
            addCriterion("TODO_ITEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTodoItemIdEqualTo(Long value) {
            addCriterion("TODO_ITEM_ID =", value, "todoItemId");
            return (Criteria) this;
        }

        public Criteria andTodoItemIdNotEqualTo(Long value) {
            addCriterion("TODO_ITEM_ID <>", value, "todoItemId");
            return (Criteria) this;
        }

        public Criteria andTodoItemIdGreaterThan(Long value) {
            addCriterion("TODO_ITEM_ID >", value, "todoItemId");
            return (Criteria) this;
        }

        public Criteria andTodoItemIdGreaterThanOrEqualTo(Long value) {
            addCriterion("TODO_ITEM_ID >=", value, "todoItemId");
            return (Criteria) this;
        }

        public Criteria andTodoItemIdLessThan(Long value) {
            addCriterion("TODO_ITEM_ID <", value, "todoItemId");
            return (Criteria) this;
        }

        public Criteria andTodoItemIdLessThanOrEqualTo(Long value) {
            addCriterion("TODO_ITEM_ID <=", value, "todoItemId");
            return (Criteria) this;
        }

        public Criteria andTodoItemIdIn(List<Long> values) {
            addCriterion("TODO_ITEM_ID in", values, "todoItemId");
            return (Criteria) this;
        }

        public Criteria andTodoItemIdNotIn(List<Long> values) {
            addCriterion("TODO_ITEM_ID not in", values, "todoItemId");
            return (Criteria) this;
        }

        public Criteria andTodoItemIdBetween(Long value1, Long value2) {
            addCriterion("TODO_ITEM_ID between", value1, value2, "todoItemId");
            return (Criteria) this;
        }

        public Criteria andTodoItemIdNotBetween(Long value1, Long value2) {
            addCriterion("TODO_ITEM_ID not between", value1, value2, "todoItemId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andTodoItemTitleIsNull() {
            addCriterion("TODO_ITEM_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTodoItemTitleIsNotNull() {
            addCriterion("TODO_ITEM_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTodoItemTitleEqualTo(String value) {
            addCriterion("TODO_ITEM_TITLE =", value, "todoItemTitle");
            return (Criteria) this;
        }

        public Criteria andTodoItemTitleNotEqualTo(String value) {
            addCriterion("TODO_ITEM_TITLE <>", value, "todoItemTitle");
            return (Criteria) this;
        }

        public Criteria andTodoItemTitleGreaterThan(String value) {
            addCriterion("TODO_ITEM_TITLE >", value, "todoItemTitle");
            return (Criteria) this;
        }

        public Criteria andTodoItemTitleGreaterThanOrEqualTo(String value) {
            addCriterion("TODO_ITEM_TITLE >=", value, "todoItemTitle");
            return (Criteria) this;
        }

        public Criteria andTodoItemTitleLessThan(String value) {
            addCriterion("TODO_ITEM_TITLE <", value, "todoItemTitle");
            return (Criteria) this;
        }

        public Criteria andTodoItemTitleLessThanOrEqualTo(String value) {
            addCriterion("TODO_ITEM_TITLE <=", value, "todoItemTitle");
            return (Criteria) this;
        }

        public Criteria andTodoItemTitleLike(String value) {
            addCriterion("TODO_ITEM_TITLE like", value, "todoItemTitle");
            return (Criteria) this;
        }

        public Criteria andTodoItemTitleNotLike(String value) {
            addCriterion("TODO_ITEM_TITLE not like", value, "todoItemTitle");
            return (Criteria) this;
        }

        public Criteria andTodoItemTitleIn(List<String> values) {
            addCriterion("TODO_ITEM_TITLE in", values, "todoItemTitle");
            return (Criteria) this;
        }

        public Criteria andTodoItemTitleNotIn(List<String> values) {
            addCriterion("TODO_ITEM_TITLE not in", values, "todoItemTitle");
            return (Criteria) this;
        }

        public Criteria andTodoItemTitleBetween(String value1, String value2) {
            addCriterion("TODO_ITEM_TITLE between", value1, value2, "todoItemTitle");
            return (Criteria) this;
        }

        public Criteria andTodoItemTitleNotBetween(String value1, String value2) {
            addCriterion("TODO_ITEM_TITLE not between", value1, value2, "todoItemTitle");
            return (Criteria) this;
        }

        public Criteria andTodoItemContentIsNull() {
            addCriterion("TODO_ITEM_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andTodoItemContentIsNotNull() {
            addCriterion("TODO_ITEM_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andTodoItemContentEqualTo(String value) {
            addCriterion("TODO_ITEM_CONTENT =", value, "todoItemContent");
            return (Criteria) this;
        }

        public Criteria andTodoItemContentNotEqualTo(String value) {
            addCriterion("TODO_ITEM_CONTENT <>", value, "todoItemContent");
            return (Criteria) this;
        }

        public Criteria andTodoItemContentGreaterThan(String value) {
            addCriterion("TODO_ITEM_CONTENT >", value, "todoItemContent");
            return (Criteria) this;
        }

        public Criteria andTodoItemContentGreaterThanOrEqualTo(String value) {
            addCriterion("TODO_ITEM_CONTENT >=", value, "todoItemContent");
            return (Criteria) this;
        }

        public Criteria andTodoItemContentLessThan(String value) {
            addCriterion("TODO_ITEM_CONTENT <", value, "todoItemContent");
            return (Criteria) this;
        }

        public Criteria andTodoItemContentLessThanOrEqualTo(String value) {
            addCriterion("TODO_ITEM_CONTENT <=", value, "todoItemContent");
            return (Criteria) this;
        }

        public Criteria andTodoItemContentLike(String value) {
            addCriterion("TODO_ITEM_CONTENT like", value, "todoItemContent");
            return (Criteria) this;
        }

        public Criteria andTodoItemContentNotLike(String value) {
            addCriterion("TODO_ITEM_CONTENT not like", value, "todoItemContent");
            return (Criteria) this;
        }

        public Criteria andTodoItemContentIn(List<String> values) {
            addCriterion("TODO_ITEM_CONTENT in", values, "todoItemContent");
            return (Criteria) this;
        }

        public Criteria andTodoItemContentNotIn(List<String> values) {
            addCriterion("TODO_ITEM_CONTENT not in", values, "todoItemContent");
            return (Criteria) this;
        }

        public Criteria andTodoItemContentBetween(String value1, String value2) {
            addCriterion("TODO_ITEM_CONTENT between", value1, value2, "todoItemContent");
            return (Criteria) this;
        }

        public Criteria andTodoItemContentNotBetween(String value1, String value2) {
            addCriterion("TODO_ITEM_CONTENT not between", value1, value2, "todoItemContent");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNull() {
            addCriterion("PRIORITY is null");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNotNull() {
            addCriterion("PRIORITY is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityEqualTo(String value) {
            addCriterion("PRIORITY =", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotEqualTo(String value) {
            addCriterion("PRIORITY <>", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThan(String value) {
            addCriterion("PRIORITY >", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThanOrEqualTo(String value) {
            addCriterion("PRIORITY >=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThan(String value) {
            addCriterion("PRIORITY <", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThanOrEqualTo(String value) {
            addCriterion("PRIORITY <=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLike(String value) {
            addCriterion("PRIORITY like", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotLike(String value) {
            addCriterion("PRIORITY not like", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityIn(List<String> values) {
            addCriterion("PRIORITY in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotIn(List<String> values) {
            addCriterion("PRIORITY not in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityBetween(String value1, String value2) {
            addCriterion("PRIORITY between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotBetween(String value1, String value2) {
            addCriterion("PRIORITY not between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andCreationDateIsNull() {
            addCriterion("CREATION_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreationDateIsNotNull() {
            addCriterion("CREATION_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreationDateEqualTo(Date value) {
            addCriterion("CREATION_DATE =", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotEqualTo(Date value) {
            addCriterion("CREATION_DATE <>", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThan(Date value) {
            addCriterion("CREATION_DATE >", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATION_DATE >=", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThan(Date value) {
            addCriterion("CREATION_DATE <", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATION_DATE <=", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateIn(List<Date> values) {
            addCriterion("CREATION_DATE in", values, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotIn(List<Date> values) {
            addCriterion("CREATION_DATE not in", values, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateBetween(Date value1, Date value2) {
            addCriterion("CREATION_DATE between", value1, value2, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATION_DATE not between", value1, value2, "creationDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIsNull() {
            addCriterion("LAST_UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIsNotNull() {
            addCriterion("LAST_UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE =", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE <>", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThan(Date value) {
            addCriterion("LAST_UPDATE_DATE >", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE >=", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThan(Date value) {
            addCriterion("LAST_UPDATE_DATE <", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE <=", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIn(List<Date> values) {
            addCriterion("LAST_UPDATE_DATE in", values, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotIn(List<Date> values) {
            addCriterion("LAST_UPDATE_DATE not in", values, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATE_DATE between", value1, value2, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATE_DATE not between", value1, value2, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNull() {
            addCriterion("COMMENTS is null");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNotNull() {
            addCriterion("COMMENTS is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsEqualTo(String value) {
            addCriterion("COMMENTS =", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotEqualTo(String value) {
            addCriterion("COMMENTS <>", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThan(String value) {
            addCriterion("COMMENTS >", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThanOrEqualTo(String value) {
            addCriterion("COMMENTS >=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThan(String value) {
            addCriterion("COMMENTS <", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThanOrEqualTo(String value) {
            addCriterion("COMMENTS <=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLike(String value) {
            addCriterion("COMMENTS like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotLike(String value) {
            addCriterion("COMMENTS not like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsIn(List<String> values) {
            addCriterion("COMMENTS in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotIn(List<String> values) {
            addCriterion("COMMENTS not in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsBetween(String value1, String value2) {
            addCriterion("COMMENTS between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotBetween(String value1, String value2) {
            addCriterion("COMMENTS not between", value1, value2, "comments");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}