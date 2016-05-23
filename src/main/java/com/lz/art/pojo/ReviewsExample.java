package com.lz.art.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Iterator;

public class ReviewsExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table reviews
	 * @mbggenerated
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table reviews
	 * @mbggenerated
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table reviews
	 * @mbggenerated
	 */protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table reviews
	 * @mbggenerated
	 */public ReviewsExample(){oredCriteria=new ArrayList<Criteria>();}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table reviews
	 * @mbggenerated
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table reviews
	 * @mbggenerated
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table reviews
	 * @mbggenerated
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table reviews
	 * @mbggenerated
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table reviews
	 * @mbggenerated
	 */public List<Criteria> getOredCriteria(){return oredCriteria;}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table reviews
	 * @mbggenerated
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table reviews
	 * @mbggenerated
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table reviews
	 * @mbggenerated
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table reviews
	 * @mbggenerated
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table reviews
	 * @mbggenerated
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table reviews
	 * @mbggenerated
	 */protected abstract static class GeneratedCriteria {protected List<Criterion> criteria;protected GeneratedCriteria(){super();criteria=new ArrayList<Criterion>();}public boolean isValid(){return criteria.size() > 0;}public List<Criterion> getAllCriteria(){return criteria;}public List<Criterion> getCriteria(){return criteria;}protected void addCriterion(String condition){if (condition == null){throw new RuntimeException("Value for condition cannot be null");}criteria.add(new Criterion(condition));}protected void addCriterion(String condition,Object value,String property){if (value == null){throw new RuntimeException("Value for " + property + " cannot be null");}criteria.add(new Criterion(condition,value));}protected void addCriterion(String condition,Object value1,Object value2,String property){if (value1 == null || value2 == null){throw new RuntimeException("Between values for " + property + " cannot be null");}criteria.add(new Criterion(condition,value1,value2));}protected void addCriterionForJDBCDate(String condition,Date value,String property){if (value == null){throw new RuntimeException("Value for " + property + " cannot be null");}addCriterion(condition,new java.sql.Date(value.getTime()),property);}protected void addCriterionForJDBCDate(String condition,List<Date> values,String property){if (values == null || values.size() == 0){throw new RuntimeException("Value list for " + property + " cannot be null or empty");}List<java.sql.Date> dateList=new ArrayList<java.sql.Date>();Iterator<Date> iter=values.iterator();while (iter.hasNext()){dateList.add(new java.sql.Date(iter.next().getTime()));}addCriterion(condition,dateList,property);}protected void addCriterionForJDBCDate(String condition,Date value1,Date value2,String property){if (value1 == null || value2 == null){throw new RuntimeException("Between values for " + property + " cannot be null");}addCriterion(condition,new java.sql.Date(value1.getTime()),new java.sql.Date(value2.getTime()),property);}public Criteria andIdIsNull(){addCriterion("id is null");return (Criteria)this;}public Criteria andIdIsNotNull(){addCriterion("id is not null");return (Criteria)this;}public Criteria andIdEqualTo(String value){addCriterion("id =",value,"id");return (Criteria)this;}public Criteria andIdNotEqualTo(String value){addCriterion("id <>",value,"id");return (Criteria)this;}public Criteria andIdGreaterThan(String value){addCriterion("id >",value,"id");return (Criteria)this;}public Criteria andIdGreaterThanOrEqualTo(String value){addCriterion("id >=",value,"id");return (Criteria)this;}public Criteria andIdLessThan(String value){addCriterion("id <",value,"id");return (Criteria)this;}public Criteria andIdLessThanOrEqualTo(String value){addCriterion("id <=",value,"id");return (Criteria)this;}public Criteria andIdLike(String value){addCriterion("id like",value,"id");return (Criteria)this;}public Criteria andIdNotLike(String value){addCriterion("id not like",value,"id");return (Criteria)this;}public Criteria andIdIn(List<String> values){addCriterion("id in",values,"id");return (Criteria)this;}public Criteria andIdNotIn(List<String> values){addCriterion("id not in",values,"id");return (Criteria)this;}public Criteria andIdBetween(String value1,String value2){addCriterion("id between",value1,value2,"id");return (Criteria)this;}public Criteria andIdNotBetween(String value1,String value2){addCriterion("id not between",value1,value2,"id");return (Criteria)this;}public Criteria andReviewIsNull(){addCriterion("review is null");return (Criteria)this;}public Criteria andReviewIsNotNull(){addCriterion("review is not null");return (Criteria)this;}public Criteria andReviewEqualTo(String value){addCriterion("review =",value,"review");return (Criteria)this;}public Criteria andReviewNotEqualTo(String value){addCriterion("review <>",value,"review");return (Criteria)this;}public Criteria andReviewGreaterThan(String value){addCriterion("review >",value,"review");return (Criteria)this;}public Criteria andReviewGreaterThanOrEqualTo(String value){addCriterion("review >=",value,"review");return (Criteria)this;}public Criteria andReviewLessThan(String value){addCriterion("review <",value,"review");return (Criteria)this;}public Criteria andReviewLessThanOrEqualTo(String value){addCriterion("review <=",value,"review");return (Criteria)this;}public Criteria andReviewLike(String value){addCriterion("review like",value,"review");return (Criteria)this;}public Criteria andReviewNotLike(String value){addCriterion("review not like",value,"review");return (Criteria)this;}public Criteria andReviewIn(List<String> values){addCriterion("review in",values,"review");return (Criteria)this;}public Criteria andReviewNotIn(List<String> values){addCriterion("review not in",values,"review");return (Criteria)this;}public Criteria andReviewBetween(String value1,String value2){addCriterion("review between",value1,value2,"review");return (Criteria)this;}public Criteria andReviewNotBetween(String value1,String value2){addCriterion("review not between",value1,value2,"review");return (Criteria)this;}public Criteria andReviewerIsNull(){addCriterion("reviewer is null");return (Criteria)this;}public Criteria andReviewerIsNotNull(){addCriterion("reviewer is not null");return (Criteria)this;}public Criteria andReviewerEqualTo(String value){addCriterion("reviewer =",value,"reviewer");return (Criteria)this;}public Criteria andReviewerNotEqualTo(String value){addCriterion("reviewer <>",value,"reviewer");return (Criteria)this;}public Criteria andReviewerGreaterThan(String value){addCriterion("reviewer >",value,"reviewer");return (Criteria)this;}public Criteria andReviewerGreaterThanOrEqualTo(String value){addCriterion("reviewer >=",value,"reviewer");return (Criteria)this;}public Criteria andReviewerLessThan(String value){addCriterion("reviewer <",value,"reviewer");return (Criteria)this;}public Criteria andReviewerLessThanOrEqualTo(String value){addCriterion("reviewer <=",value,"reviewer");return (Criteria)this;}public Criteria andReviewerLike(String value){addCriterion("reviewer like",value,"reviewer");return (Criteria)this;}public Criteria andReviewerNotLike(String value){addCriterion("reviewer not like",value,"reviewer");return (Criteria)this;}public Criteria andReviewerIn(List<String> values){addCriterion("reviewer in",values,"reviewer");return (Criteria)this;}public Criteria andReviewerNotIn(List<String> values){addCriterion("reviewer not in",values,"reviewer");return (Criteria)this;}public Criteria andReviewerBetween(String value1,String value2){addCriterion("reviewer between",value1,value2,"reviewer");return (Criteria)this;}public Criteria andReviewerNotBetween(String value1,String value2){addCriterion("reviewer not between",value1,value2,"reviewer");return (Criteria)this;}public Criteria andDateIsNull(){addCriterion("date is null");return (Criteria)this;}public Criteria andDateIsNotNull(){addCriterion("date is not null");return (Criteria)this;}public Criteria andDateEqualTo(Date value){addCriterionForJDBCDate("date =",value,"date");return (Criteria)this;}public Criteria andDateNotEqualTo(Date value){addCriterionForJDBCDate("date <>",value,"date");return (Criteria)this;}public Criteria andDateGreaterThan(Date value){addCriterionForJDBCDate("date >",value,"date");return (Criteria)this;}public Criteria andDateGreaterThanOrEqualTo(Date value){addCriterionForJDBCDate("date >=",value,"date");return (Criteria)this;}public Criteria andDateLessThan(Date value){addCriterionForJDBCDate("date <",value,"date");return (Criteria)this;}public Criteria andDateLessThanOrEqualTo(Date value){addCriterionForJDBCDate("date <=",value,"date");return (Criteria)this;}public Criteria andDateIn(List<Date> values){addCriterionForJDBCDate("date in",values,"date");return (Criteria)this;}public Criteria andDateNotIn(List<Date> values){addCriterionForJDBCDate("date not in",values,"date");return (Criteria)this;}public Criteria andDateBetween(Date value1,Date value2){addCriterionForJDBCDate("date between",value1,value2,"date");return (Criteria)this;}public Criteria andDateNotBetween(Date value1,Date value2){addCriterionForJDBCDate("date not between",value1,value2,"date");return (Criteria)this;}public Criteria andHelpfulCountIsNull(){addCriterion("helpful_count is null");return (Criteria)this;}public Criteria andHelpfulCountIsNotNull(){addCriterion("helpful_count is not null");return (Criteria)this;}public Criteria andHelpfulCountEqualTo(Integer value){addCriterion("helpful_count =",value,"helpfulCount");return (Criteria)this;}public Criteria andHelpfulCountNotEqualTo(Integer value){addCriterion("helpful_count <>",value,"helpfulCount");return (Criteria)this;}public Criteria andHelpfulCountGreaterThan(Integer value){addCriterion("helpful_count >",value,"helpfulCount");return (Criteria)this;}public Criteria andHelpfulCountGreaterThanOrEqualTo(Integer value){addCriterion("helpful_count >=",value,"helpfulCount");return (Criteria)this;}public Criteria andHelpfulCountLessThan(Integer value){addCriterion("helpful_count <",value,"helpfulCount");return (Criteria)this;}public Criteria andHelpfulCountLessThanOrEqualTo(Integer value){addCriterion("helpful_count <=",value,"helpfulCount");return (Criteria)this;}public Criteria andHelpfulCountIn(List<Integer> values){addCriterion("helpful_count in",values,"helpfulCount");return (Criteria)this;}public Criteria andHelpfulCountNotIn(List<Integer> values){addCriterion("helpful_count not in",values,"helpfulCount");return (Criteria)this;}public Criteria andHelpfulCountBetween(Integer value1,Integer value2){addCriterion("helpful_count between",value1,value2,"helpfulCount");return (Criteria)this;}public Criteria andHelpfulCountNotBetween(Integer value1,Integer value2){addCriterion("helpful_count not between",value1,value2,"helpfulCount");return (Criteria)this;}public Criteria andStartsIsNull(){addCriterion("starts is null");return (Criteria)this;}public Criteria andStartsIsNotNull(){addCriterion("starts is not null");return (Criteria)this;}public Criteria andStartsEqualTo(Float value){addCriterion("starts =",value,"starts");return (Criteria)this;}public Criteria andStartsNotEqualTo(Float value){addCriterion("starts <>",value,"starts");return (Criteria)this;}public Criteria andStartsGreaterThan(Float value){addCriterion("starts >",value,"starts");return (Criteria)this;}public Criteria andStartsGreaterThanOrEqualTo(Float value){addCriterion("starts >=",value,"starts");return (Criteria)this;}public Criteria andStartsLessThan(Float value){addCriterion("starts <",value,"starts");return (Criteria)this;}public Criteria andStartsLessThanOrEqualTo(Float value){addCriterion("starts <=",value,"starts");return (Criteria)this;}public Criteria andStartsIn(List<Float> values){addCriterion("starts in",values,"starts");return (Criteria)this;}public Criteria andStartsNotIn(List<Float> values){addCriterion("starts not in",values,"starts");return (Criteria)this;}public Criteria andStartsBetween(Float value1,Float value2){addCriterion("starts between",value1,value2,"starts");return (Criteria)this;}public Criteria andStartsNotBetween(Float value1,Float value2){addCriterion("starts not between",value1,value2,"starts");return (Criteria)this;}}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table reviews
	 * @mbggenerated
	 */public static class Criterion {private String condition;private Object value;private Object secondValue;private boolean noValue;private boolean singleValue;private boolean betweenValue;private boolean listValue;private String typeHandler;public String getCondition(){return condition;}public Object getValue(){return value;}public Object getSecondValue(){return secondValue;}public boolean isNoValue(){return noValue;}public boolean isSingleValue(){return singleValue;}public boolean isBetweenValue(){return betweenValue;}public boolean isListValue(){return listValue;}public String getTypeHandler(){return typeHandler;}protected Criterion(String condition){super();this.condition=condition;this.typeHandler=null;this.noValue=true;}protected Criterion(String condition,Object value,String typeHandler){super();this.condition=condition;this.value=value;this.typeHandler=typeHandler;if (value instanceof List<?>){this.listValue=true;} else {this.singleValue=true;}}protected Criterion(String condition,Object value){this(condition,value,null);}protected Criterion(String condition,Object value,Object secondValue,String typeHandler){super();this.condition=condition;this.value=value;this.secondValue=secondValue;this.typeHandler=typeHandler;this.betweenValue=true;}protected Criterion(String condition,Object value,Object secondValue){this(condition,value,secondValue,null);}}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table reviews
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}