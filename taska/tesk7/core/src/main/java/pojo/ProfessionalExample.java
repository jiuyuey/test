package pojo;

import java.util.ArrayList;
import java.util.List;

public class ProfessionalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProfessionalExample() {
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

        public Criteria andPathIsNull() {
            addCriterion("path is null");
            return (Criteria) this;
        }

        public Criteria andPathIsNotNull() {
            addCriterion("path is not null");
            return (Criteria) this;
        }

        public Criteria andPathEqualTo(String value) {
            addCriterion("path =", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotEqualTo(String value) {
            addCriterion("path <>", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThan(String value) {
            addCriterion("path >", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThanOrEqualTo(String value) {
            addCriterion("path >=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThan(String value) {
            addCriterion("path <", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThanOrEqualTo(String value) {
            addCriterion("path <=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLike(String value) {
            addCriterion("path like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotLike(String value) {
            addCriterion("path not like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathIn(List<String> values) {
            addCriterion("path in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotIn(List<String> values) {
            addCriterion("path not in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathBetween(String value1, String value2) {
            addCriterion("path between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotBetween(String value1, String value2) {
            addCriterion("path not between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andPathhhhIsNull() {
            addCriterion("pathhhh is null");
            return (Criteria) this;
        }

        public Criteria andPathhhhIsNotNull() {
            addCriterion("pathhhh is not null");
            return (Criteria) this;
        }

        public Criteria andPathhhhEqualTo(String value) {
            addCriterion("pathhhh =", value, "pathhhh");
            return (Criteria) this;
        }

        public Criteria andPathhhhNotEqualTo(String value) {
            addCriterion("pathhhh <>", value, "pathhhh");
            return (Criteria) this;
        }

        public Criteria andPathhhhGreaterThan(String value) {
            addCriterion("pathhhh >", value, "pathhhh");
            return (Criteria) this;
        }

        public Criteria andPathhhhGreaterThanOrEqualTo(String value) {
            addCriterion("pathhhh >=", value, "pathhhh");
            return (Criteria) this;
        }

        public Criteria andPathhhhLessThan(String value) {
            addCriterion("pathhhh <", value, "pathhhh");
            return (Criteria) this;
        }

        public Criteria andPathhhhLessThanOrEqualTo(String value) {
            addCriterion("pathhhh <=", value, "pathhhh");
            return (Criteria) this;
        }

        public Criteria andPathhhhLike(String value) {
            addCriterion("pathhhh like", value, "pathhhh");
            return (Criteria) this;
        }

        public Criteria andPathhhhNotLike(String value) {
            addCriterion("pathhhh not like", value, "pathhhh");
            return (Criteria) this;
        }

        public Criteria andPathhhhIn(List<String> values) {
            addCriterion("pathhhh in", values, "pathhhh");
            return (Criteria) this;
        }

        public Criteria andPathhhhNotIn(List<String> values) {
            addCriterion("pathhhh not in", values, "pathhhh");
            return (Criteria) this;
        }

        public Criteria andPathhhhBetween(String value1, String value2) {
            addCriterion("pathhhh between", value1, value2, "pathhhh");
            return (Criteria) this;
        }

        public Criteria andPathhhhNotBetween(String value1, String value2) {
            addCriterion("pathhhh not between", value1, value2, "pathhhh");
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

        public Criteria andIntroductionIsNull() {
            addCriterion("introduction is null");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNotNull() {
            addCriterion("introduction is not null");
            return (Criteria) this;
        }

        public Criteria andIntroductionEqualTo(String value) {
            addCriterion("introduction =", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotEqualTo(String value) {
            addCriterion("introduction <>", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThan(String value) {
            addCriterion("introduction >", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("introduction >=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThan(String value) {
            addCriterion("introduction <", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThanOrEqualTo(String value) {
            addCriterion("introduction <=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLike(String value) {
            addCriterion("introduction like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotLike(String value) {
            addCriterion("introduction not like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionIn(List<String> values) {
            addCriterion("introduction in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotIn(List<String> values) {
            addCriterion("introduction not in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionBetween(String value1, String value2) {
            addCriterion("introduction between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotBetween(String value1, String value2) {
            addCriterion("introduction not between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andThresholdIsNull() {
            addCriterion("threshold is null");
            return (Criteria) this;
        }

        public Criteria andThresholdIsNotNull() {
            addCriterion("threshold is not null");
            return (Criteria) this;
        }

        public Criteria andThresholdEqualTo(Integer value) {
            addCriterion("threshold =", value, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdNotEqualTo(Integer value) {
            addCriterion("threshold <>", value, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdGreaterThan(Integer value) {
            addCriterion("threshold >", value, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdGreaterThanOrEqualTo(Integer value) {
            addCriterion("threshold >=", value, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdLessThan(Integer value) {
            addCriterion("threshold <", value, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdLessThanOrEqualTo(Integer value) {
            addCriterion("threshold <=", value, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdIn(List<Integer> values) {
            addCriterion("threshold in", values, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdNotIn(List<Integer> values) {
            addCriterion("threshold not in", values, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdBetween(Integer value1, Integer value2) {
            addCriterion("threshold between", value1, value2, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdNotBetween(Integer value1, Integer value2) {
            addCriterion("threshold not between", value1, value2, "threshold");
            return (Criteria) this;
        }

        public Criteria andEasyIsNull() {
            addCriterion("easy is null");
            return (Criteria) this;
        }

        public Criteria andEasyIsNotNull() {
            addCriterion("easy is not null");
            return (Criteria) this;
        }

        public Criteria andEasyEqualTo(String value) {
            addCriterion("easy =", value, "easy");
            return (Criteria) this;
        }

        public Criteria andEasyNotEqualTo(String value) {
            addCriterion("easy <>", value, "easy");
            return (Criteria) this;
        }

        public Criteria andEasyGreaterThan(String value) {
            addCriterion("easy >", value, "easy");
            return (Criteria) this;
        }

        public Criteria andEasyGreaterThanOrEqualTo(String value) {
            addCriterion("easy >=", value, "easy");
            return (Criteria) this;
        }

        public Criteria andEasyLessThan(String value) {
            addCriterion("easy <", value, "easy");
            return (Criteria) this;
        }

        public Criteria andEasyLessThanOrEqualTo(String value) {
            addCriterion("easy <=", value, "easy");
            return (Criteria) this;
        }

        public Criteria andEasyLike(String value) {
            addCriterion("easy like", value, "easy");
            return (Criteria) this;
        }

        public Criteria andEasyNotLike(String value) {
            addCriterion("easy not like", value, "easy");
            return (Criteria) this;
        }

        public Criteria andEasyIn(List<String> values) {
            addCriterion("easy in", values, "easy");
            return (Criteria) this;
        }

        public Criteria andEasyNotIn(List<String> values) {
            addCriterion("easy not in", values, "easy");
            return (Criteria) this;
        }

        public Criteria andEasyBetween(String value1, String value2) {
            addCriterion("easy between", value1, value2, "easy");
            return (Criteria) this;
        }

        public Criteria andEasyNotBetween(String value1, String value2) {
            addCriterion("easy not between", value1, value2, "easy");
            return (Criteria) this;
        }

        public Criteria andGrowthIsNull() {
            addCriterion("growth is null");
            return (Criteria) this;
        }

        public Criteria andGrowthIsNotNull() {
            addCriterion("growth is not null");
            return (Criteria) this;
        }

        public Criteria andGrowthEqualTo(String value) {
            addCriterion("growth =", value, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthNotEqualTo(String value) {
            addCriterion("growth <>", value, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthGreaterThan(String value) {
            addCriterion("growth >", value, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthGreaterThanOrEqualTo(String value) {
            addCriterion("growth >=", value, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthLessThan(String value) {
            addCriterion("growth <", value, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthLessThanOrEqualTo(String value) {
            addCriterion("growth <=", value, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthLike(String value) {
            addCriterion("growth like", value, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthNotLike(String value) {
            addCriterion("growth not like", value, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthIn(List<String> values) {
            addCriterion("growth in", values, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthNotIn(List<String> values) {
            addCriterion("growth not in", values, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthBetween(String value1, String value2) {
            addCriterion("growth between", value1, value2, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthNotBetween(String value1, String value2) {
            addCriterion("growth not between", value1, value2, "growth");
            return (Criteria) this;
        }

        public Criteria andScarceIsNull() {
            addCriterion("scarce is null");
            return (Criteria) this;
        }

        public Criteria andScarceIsNotNull() {
            addCriterion("scarce is not null");
            return (Criteria) this;
        }

        public Criteria andScarceEqualTo(String value) {
            addCriterion("scarce =", value, "scarce");
            return (Criteria) this;
        }

        public Criteria andScarceNotEqualTo(String value) {
            addCriterion("scarce <>", value, "scarce");
            return (Criteria) this;
        }

        public Criteria andScarceGreaterThan(String value) {
            addCriterion("scarce >", value, "scarce");
            return (Criteria) this;
        }

        public Criteria andScarceGreaterThanOrEqualTo(String value) {
            addCriterion("scarce >=", value, "scarce");
            return (Criteria) this;
        }

        public Criteria andScarceLessThan(String value) {
            addCriterion("scarce <", value, "scarce");
            return (Criteria) this;
        }

        public Criteria andScarceLessThanOrEqualTo(String value) {
            addCriterion("scarce <=", value, "scarce");
            return (Criteria) this;
        }

        public Criteria andScarceLike(String value) {
            addCriterion("scarce like", value, "scarce");
            return (Criteria) this;
        }

        public Criteria andScarceNotLike(String value) {
            addCriterion("scarce not like", value, "scarce");
            return (Criteria) this;
        }

        public Criteria andScarceIn(List<String> values) {
            addCriterion("scarce in", values, "scarce");
            return (Criteria) this;
        }

        public Criteria andScarceNotIn(List<String> values) {
            addCriterion("scarce not in", values, "scarce");
            return (Criteria) this;
        }

        public Criteria andScarceBetween(String value1, String value2) {
            addCriterion("scarce between", value1, value2, "scarce");
            return (Criteria) this;
        }

        public Criteria andScarceNotBetween(String value1, String value2) {
            addCriterion("scarce not between", value1, value2, "scarce");
            return (Criteria) this;
        }

        public Criteria andAyearIsNull() {
            addCriterion("ayear is null");
            return (Criteria) this;
        }

        public Criteria andAyearIsNotNull() {
            addCriterion("ayear is not null");
            return (Criteria) this;
        }

        public Criteria andAyearEqualTo(String value) {
            addCriterion("ayear =", value, "ayear");
            return (Criteria) this;
        }

        public Criteria andAyearNotEqualTo(String value) {
            addCriterion("ayear <>", value, "ayear");
            return (Criteria) this;
        }

        public Criteria andAyearGreaterThan(String value) {
            addCriterion("ayear >", value, "ayear");
            return (Criteria) this;
        }

        public Criteria andAyearGreaterThanOrEqualTo(String value) {
            addCriterion("ayear >=", value, "ayear");
            return (Criteria) this;
        }

        public Criteria andAyearLessThan(String value) {
            addCriterion("ayear <", value, "ayear");
            return (Criteria) this;
        }

        public Criteria andAyearLessThanOrEqualTo(String value) {
            addCriterion("ayear <=", value, "ayear");
            return (Criteria) this;
        }

        public Criteria andAyearLike(String value) {
            addCriterion("ayear like", value, "ayear");
            return (Criteria) this;
        }

        public Criteria andAyearNotLike(String value) {
            addCriterion("ayear not like", value, "ayear");
            return (Criteria) this;
        }

        public Criteria andAyearIn(List<String> values) {
            addCriterion("ayear in", values, "ayear");
            return (Criteria) this;
        }

        public Criteria andAyearNotIn(List<String> values) {
            addCriterion("ayear not in", values, "ayear");
            return (Criteria) this;
        }

        public Criteria andAyearBetween(String value1, String value2) {
            addCriterion("ayear between", value1, value2, "ayear");
            return (Criteria) this;
        }

        public Criteria andAyearNotBetween(String value1, String value2) {
            addCriterion("ayear not between", value1, value2, "ayear");
            return (Criteria) this;
        }

        public Criteria andThreeyearsIsNull() {
            addCriterion("threeyears is null");
            return (Criteria) this;
        }

        public Criteria andThreeyearsIsNotNull() {
            addCriterion("threeyears is not null");
            return (Criteria) this;
        }

        public Criteria andThreeyearsEqualTo(String value) {
            addCriterion("threeyears =", value, "threeyears");
            return (Criteria) this;
        }

        public Criteria andThreeyearsNotEqualTo(String value) {
            addCriterion("threeyears <>", value, "threeyears");
            return (Criteria) this;
        }

        public Criteria andThreeyearsGreaterThan(String value) {
            addCriterion("threeyears >", value, "threeyears");
            return (Criteria) this;
        }

        public Criteria andThreeyearsGreaterThanOrEqualTo(String value) {
            addCriterion("threeyears >=", value, "threeyears");
            return (Criteria) this;
        }

        public Criteria andThreeyearsLessThan(String value) {
            addCriterion("threeyears <", value, "threeyears");
            return (Criteria) this;
        }

        public Criteria andThreeyearsLessThanOrEqualTo(String value) {
            addCriterion("threeyears <=", value, "threeyears");
            return (Criteria) this;
        }

        public Criteria andThreeyearsLike(String value) {
            addCriterion("threeyears like", value, "threeyears");
            return (Criteria) this;
        }

        public Criteria andThreeyearsNotLike(String value) {
            addCriterion("threeyears not like", value, "threeyears");
            return (Criteria) this;
        }

        public Criteria andThreeyearsIn(List<String> values) {
            addCriterion("threeyears in", values, "threeyears");
            return (Criteria) this;
        }

        public Criteria andThreeyearsNotIn(List<String> values) {
            addCriterion("threeyears not in", values, "threeyears");
            return (Criteria) this;
        }

        public Criteria andThreeyearsBetween(String value1, String value2) {
            addCriterion("threeyears between", value1, value2, "threeyears");
            return (Criteria) this;
        }

        public Criteria andThreeyearsNotBetween(String value1, String value2) {
            addCriterion("threeyears not between", value1, value2, "threeyears");
            return (Criteria) this;
        }

        public Criteria andFiveyearsIsNull() {
            addCriterion("fiveyears is null");
            return (Criteria) this;
        }

        public Criteria andFiveyearsIsNotNull() {
            addCriterion("fiveyears is not null");
            return (Criteria) this;
        }

        public Criteria andFiveyearsEqualTo(String value) {
            addCriterion("fiveyears =", value, "fiveyears");
            return (Criteria) this;
        }

        public Criteria andFiveyearsNotEqualTo(String value) {
            addCriterion("fiveyears <>", value, "fiveyears");
            return (Criteria) this;
        }

        public Criteria andFiveyearsGreaterThan(String value) {
            addCriterion("fiveyears >", value, "fiveyears");
            return (Criteria) this;
        }

        public Criteria andFiveyearsGreaterThanOrEqualTo(String value) {
            addCriterion("fiveyears >=", value, "fiveyears");
            return (Criteria) this;
        }

        public Criteria andFiveyearsLessThan(String value) {
            addCriterion("fiveyears <", value, "fiveyears");
            return (Criteria) this;
        }

        public Criteria andFiveyearsLessThanOrEqualTo(String value) {
            addCriterion("fiveyears <=", value, "fiveyears");
            return (Criteria) this;
        }

        public Criteria andFiveyearsLike(String value) {
            addCriterion("fiveyears like", value, "fiveyears");
            return (Criteria) this;
        }

        public Criteria andFiveyearsNotLike(String value) {
            addCriterion("fiveyears not like", value, "fiveyears");
            return (Criteria) this;
        }

        public Criteria andFiveyearsIn(List<String> values) {
            addCriterion("fiveyears in", values, "fiveyears");
            return (Criteria) this;
        }

        public Criteria andFiveyearsNotIn(List<String> values) {
            addCriterion("fiveyears not in", values, "fiveyears");
            return (Criteria) this;
        }

        public Criteria andFiveyearsBetween(String value1, String value2) {
            addCriterion("fiveyears between", value1, value2, "fiveyears");
            return (Criteria) this;
        }

        public Criteria andFiveyearsNotBetween(String value1, String value2) {
            addCriterion("fiveyears not between", value1, value2, "fiveyears");
            return (Criteria) this;
        }

        public Criteria andLeamIsNull() {
            addCriterion("leam is null");
            return (Criteria) this;
        }

        public Criteria andLeamIsNotNull() {
            addCriterion("leam is not null");
            return (Criteria) this;
        }

        public Criteria andLeamEqualTo(String value) {
            addCriterion("leam =", value, "leam");
            return (Criteria) this;
        }

        public Criteria andLeamNotEqualTo(String value) {
            addCriterion("leam <>", value, "leam");
            return (Criteria) this;
        }

        public Criteria andLeamGreaterThan(String value) {
            addCriterion("leam >", value, "leam");
            return (Criteria) this;
        }

        public Criteria andLeamGreaterThanOrEqualTo(String value) {
            addCriterion("leam >=", value, "leam");
            return (Criteria) this;
        }

        public Criteria andLeamLessThan(String value) {
            addCriterion("leam <", value, "leam");
            return (Criteria) this;
        }

        public Criteria andLeamLessThanOrEqualTo(String value) {
            addCriterion("leam <=", value, "leam");
            return (Criteria) this;
        }

        public Criteria andLeamLike(String value) {
            addCriterion("leam like", value, "leam");
            return (Criteria) this;
        }

        public Criteria andLeamNotLike(String value) {
            addCriterion("leam not like", value, "leam");
            return (Criteria) this;
        }

        public Criteria andLeamIn(List<String> values) {
            addCriterion("leam in", values, "leam");
            return (Criteria) this;
        }

        public Criteria andLeamNotIn(List<String> values) {
            addCriterion("leam not in", values, "leam");
            return (Criteria) this;
        }

        public Criteria andLeamBetween(String value1, String value2) {
            addCriterion("leam between", value1, value2, "leam");
            return (Criteria) this;
        }

        public Criteria andLeamNotBetween(String value1, String value2) {
            addCriterion("leam not between", value1, value2, "leam");
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