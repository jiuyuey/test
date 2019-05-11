package pojo;

import java.util.ArrayList;
import java.util.List;

public class CollectionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CollectionExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCollecIsNull() {
            addCriterion("collec is null");
            return (Criteria) this;
        }

        public Criteria andCollecIsNotNull() {
            addCriterion("collec is not null");
            return (Criteria) this;
        }

        public Criteria andCollecEqualTo(String value) {
            addCriterion("collec =", value, "collec");
            return (Criteria) this;
        }

        public Criteria andCollecNotEqualTo(String value) {
            addCriterion("collec <>", value, "collec");
            return (Criteria) this;
        }

        public Criteria andCollecGreaterThan(String value) {
            addCriterion("collec >", value, "collec");
            return (Criteria) this;
        }

        public Criteria andCollecGreaterThanOrEqualTo(String value) {
            addCriterion("collec >=", value, "collec");
            return (Criteria) this;
        }

        public Criteria andCollecLessThan(String value) {
            addCriterion("collec <", value, "collec");
            return (Criteria) this;
        }

        public Criteria andCollecLessThanOrEqualTo(String value) {
            addCriterion("collec <=", value, "collec");
            return (Criteria) this;
        }

        public Criteria andCollecLike(String value) {
            addCriterion("collec like", value, "collec");
            return (Criteria) this;
        }

        public Criteria andCollecNotLike(String value) {
            addCriterion("collec not like", value, "collec");
            return (Criteria) this;
        }

        public Criteria andCollecIn(List<String> values) {
            addCriterion("collec in", values, "collec");
            return (Criteria) this;
        }

        public Criteria andCollecNotIn(List<String> values) {
            addCriterion("collec not in", values, "collec");
            return (Criteria) this;
        }

        public Criteria andCollecBetween(String value1, String value2) {
            addCriterion("collec between", value1, value2, "collec");
            return (Criteria) this;
        }

        public Criteria andCollecNotBetween(String value1, String value2) {
            addCriterion("collec not between", value1, value2, "collec");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andCreateatIsNull() {
            addCriterion("createat is null");
            return (Criteria) this;
        }

        public Criteria andCreateatIsNotNull() {
            addCriterion("createat is not null");
            return (Criteria) this;
        }

        public Criteria andCreateatEqualTo(String value) {
            addCriterion("createat =", value, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatNotEqualTo(String value) {
            addCriterion("createat <>", value, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatGreaterThan(String value) {
            addCriterion("createat >", value, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatGreaterThanOrEqualTo(String value) {
            addCriterion("createat >=", value, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatLessThan(String value) {
            addCriterion("createat <", value, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatLessThanOrEqualTo(String value) {
            addCriterion("createat <=", value, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatLike(String value) {
            addCriterion("createat like", value, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatNotLike(String value) {
            addCriterion("createat not like", value, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatIn(List<String> values) {
            addCriterion("createat in", values, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatNotIn(List<String> values) {
            addCriterion("createat not in", values, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatBetween(String value1, String value2) {
            addCriterion("createat between", value1, value2, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatNotBetween(String value1, String value2) {
            addCriterion("createat not between", value1, value2, "createat");
            return (Criteria) this;
        }

        public Criteria andUpdateatIsNull() {
            addCriterion("updateat is null");
            return (Criteria) this;
        }

        public Criteria andUpdateatIsNotNull() {
            addCriterion("updateat is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateatEqualTo(String value) {
            addCriterion("updateat =", value, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatNotEqualTo(String value) {
            addCriterion("updateat <>", value, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatGreaterThan(String value) {
            addCriterion("updateat >", value, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatGreaterThanOrEqualTo(String value) {
            addCriterion("updateat >=", value, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatLessThan(String value) {
            addCriterion("updateat <", value, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatLessThanOrEqualTo(String value) {
            addCriterion("updateat <=", value, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatLike(String value) {
            addCriterion("updateat like", value, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatNotLike(String value) {
            addCriterion("updateat not like", value, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatIn(List<String> values) {
            addCriterion("updateat in", values, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatNotIn(List<String> values) {
            addCriterion("updateat not in", values, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatBetween(String value1, String value2) {
            addCriterion("updateat between", value1, value2, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatNotBetween(String value1, String value2) {
            addCriterion("updateat not between", value1, value2, "updateat");
            return (Criteria) this;
        }

        public Criteria andEditIsNull() {
            addCriterion("edit is null");
            return (Criteria) this;
        }

        public Criteria andEditIsNotNull() {
            addCriterion("edit is not null");
            return (Criteria) this;
        }

        public Criteria andEditEqualTo(String value) {
            addCriterion("edit =", value, "edit");
            return (Criteria) this;
        }

        public Criteria andEditNotEqualTo(String value) {
            addCriterion("edit <>", value, "edit");
            return (Criteria) this;
        }

        public Criteria andEditGreaterThan(String value) {
            addCriterion("edit >", value, "edit");
            return (Criteria) this;
        }

        public Criteria andEditGreaterThanOrEqualTo(String value) {
            addCriterion("edit >=", value, "edit");
            return (Criteria) this;
        }

        public Criteria andEditLessThan(String value) {
            addCriterion("edit <", value, "edit");
            return (Criteria) this;
        }

        public Criteria andEditLessThanOrEqualTo(String value) {
            addCriterion("edit <=", value, "edit");
            return (Criteria) this;
        }

        public Criteria andEditLike(String value) {
            addCriterion("edit like", value, "edit");
            return (Criteria) this;
        }

        public Criteria andEditNotLike(String value) {
            addCriterion("edit not like", value, "edit");
            return (Criteria) this;
        }

        public Criteria andEditIn(List<String> values) {
            addCriterion("edit in", values, "edit");
            return (Criteria) this;
        }

        public Criteria andEditNotIn(List<String> values) {
            addCriterion("edit not in", values, "edit");
            return (Criteria) this;
        }

        public Criteria andEditBetween(String value1, String value2) {
            addCriterion("edit between", value1, value2, "edit");
            return (Criteria) this;
        }

        public Criteria andEditNotBetween(String value1, String value2) {
            addCriterion("edit not between", value1, value2, "edit");
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