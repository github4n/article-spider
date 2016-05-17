package com.lz.art.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArticleExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table article
	 * @mbggenerated
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table article
	 * @mbggenerated
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table article
	 * @mbggenerated
	 */protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table article
	 * @mbggenerated
	 */public ArticleExample(){oredCriteria=new ArrayList<Criteria>();}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table article
	 * @mbggenerated
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table article
	 * @mbggenerated
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table article
	 * @mbggenerated
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table article
	 * @mbggenerated
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table article
	 * @mbggenerated
	 */public List<Criteria> getOredCriteria(){return oredCriteria;}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table article
	 * @mbggenerated
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table article
	 * @mbggenerated
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table article
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table article
	 * @mbggenerated
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table article
	 * @mbggenerated
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table article
	 * @mbggenerated
	 */protected abstract static class GeneratedCriteria {protected List<Criterion> criteria;protected GeneratedCriteria(){super();criteria=new ArrayList<Criterion>();}public boolean isValid(){return criteria.size() > 0;}public List<Criterion> getAllCriteria(){return criteria;}public List<Criterion> getCriteria(){return criteria;}protected void addCriterion(String condition){if (condition == null){throw new RuntimeException("Value for condition cannot be null");}criteria.add(new Criterion(condition));}protected void addCriterion(String condition,Object value,String property){if (value == null){throw new RuntimeException("Value for " + property + " cannot be null");}criteria.add(new Criterion(condition,value));}protected void addCriterion(String condition,Object value1,Object value2,String property){if (value1 == null || value2 == null){throw new RuntimeException("Between values for " + property + " cannot be null");}criteria.add(new Criterion(condition,value1,value2));}public Criteria andIdIsNull(){addCriterion("id is null");return (Criteria)this;}public Criteria andIdIsNotNull(){addCriterion("id is not null");return (Criteria)this;}public Criteria andIdEqualTo(String value){addCriterion("id =",value,"id");return (Criteria)this;}public Criteria andIdNotEqualTo(String value){addCriterion("id <>",value,"id");return (Criteria)this;}public Criteria andIdGreaterThan(String value){addCriterion("id >",value,"id");return (Criteria)this;}public Criteria andIdGreaterThanOrEqualTo(String value){addCriterion("id >=",value,"id");return (Criteria)this;}public Criteria andIdLessThan(String value){addCriterion("id <",value,"id");return (Criteria)this;}public Criteria andIdLessThanOrEqualTo(String value){addCriterion("id <=",value,"id");return (Criteria)this;}public Criteria andIdLike(String value){addCriterion("id like",value,"id");return (Criteria)this;}public Criteria andIdNotLike(String value){addCriterion("id not like",value,"id");return (Criteria)this;}public Criteria andIdIn(List<String> values){addCriterion("id in",values,"id");return (Criteria)this;}public Criteria andIdNotIn(List<String> values){addCriterion("id not in",values,"id");return (Criteria)this;}public Criteria andIdBetween(String value1,String value2){addCriterion("id between",value1,value2,"id");return (Criteria)this;}public Criteria andIdNotBetween(String value1,String value2){addCriterion("id not between",value1,value2,"id");return (Criteria)this;}public Criteria andTitleIsNull(){addCriterion("title is null");return (Criteria)this;}public Criteria andTitleIsNotNull(){addCriterion("title is not null");return (Criteria)this;}public Criteria andTitleEqualTo(String value){addCriterion("title =",value,"title");return (Criteria)this;}public Criteria andTitleNotEqualTo(String value){addCriterion("title <>",value,"title");return (Criteria)this;}public Criteria andTitleGreaterThan(String value){addCriterion("title >",value,"title");return (Criteria)this;}public Criteria andTitleGreaterThanOrEqualTo(String value){addCriterion("title >=",value,"title");return (Criteria)this;}public Criteria andTitleLessThan(String value){addCriterion("title <",value,"title");return (Criteria)this;}public Criteria andTitleLessThanOrEqualTo(String value){addCriterion("title <=",value,"title");return (Criteria)this;}public Criteria andTitleLike(String value){addCriterion("title like",value,"title");return (Criteria)this;}public Criteria andTitleNotLike(String value){addCriterion("title not like",value,"title");return (Criteria)this;}public Criteria andTitleIn(List<String> values){addCriterion("title in",values,"title");return (Criteria)this;}public Criteria andTitleNotIn(List<String> values){addCriterion("title not in",values,"title");return (Criteria)this;}public Criteria andTitleBetween(String value1,String value2){addCriterion("title between",value1,value2,"title");return (Criteria)this;}public Criteria andTitleNotBetween(String value1,String value2){addCriterion("title not between",value1,value2,"title");return (Criteria)this;}public Criteria andAuthorIsNull(){addCriterion("author is null");return (Criteria)this;}public Criteria andAuthorIsNotNull(){addCriterion("author is not null");return (Criteria)this;}public Criteria andAuthorEqualTo(String value){addCriterion("author =",value,"author");return (Criteria)this;}public Criteria andAuthorNotEqualTo(String value){addCriterion("author <>",value,"author");return (Criteria)this;}public Criteria andAuthorGreaterThan(String value){addCriterion("author >",value,"author");return (Criteria)this;}public Criteria andAuthorGreaterThanOrEqualTo(String value){addCriterion("author >=",value,"author");return (Criteria)this;}public Criteria andAuthorLessThan(String value){addCriterion("author <",value,"author");return (Criteria)this;}public Criteria andAuthorLessThanOrEqualTo(String value){addCriterion("author <=",value,"author");return (Criteria)this;}public Criteria andAuthorLike(String value){addCriterion("author like",value,"author");return (Criteria)this;}public Criteria andAuthorNotLike(String value){addCriterion("author not like",value,"author");return (Criteria)this;}public Criteria andAuthorIn(List<String> values){addCriterion("author in",values,"author");return (Criteria)this;}public Criteria andAuthorNotIn(List<String> values){addCriterion("author not in",values,"author");return (Criteria)this;}public Criteria andAuthorBetween(String value1,String value2){addCriterion("author between",value1,value2,"author");return (Criteria)this;}public Criteria andAuthorNotBetween(String value1,String value2){addCriterion("author not between",value1,value2,"author");return (Criteria)this;}public Criteria andDataIsNull(){addCriterion("data is null");return (Criteria)this;}public Criteria andDataIsNotNull(){addCriterion("data is not null");return (Criteria)this;}public Criteria andDataEqualTo(Date value){addCriterion("data =",value,"data");return (Criteria)this;}public Criteria andDataNotEqualTo(Date value){addCriterion("data <>",value,"data");return (Criteria)this;}public Criteria andDataGreaterThan(Date value){addCriterion("data >",value,"data");return (Criteria)this;}public Criteria andDataGreaterThanOrEqualTo(Date value){addCriterion("data >=",value,"data");return (Criteria)this;}public Criteria andDataLessThan(Date value){addCriterion("data <",value,"data");return (Criteria)this;}public Criteria andDataLessThanOrEqualTo(Date value){addCriterion("data <=",value,"data");return (Criteria)this;}public Criteria andDataIn(List<Date> values){addCriterion("data in",values,"data");return (Criteria)this;}public Criteria andDataNotIn(List<Date> values){addCriterion("data not in",values,"data");return (Criteria)this;}public Criteria andDataBetween(Date value1,Date value2){addCriterion("data between",value1,value2,"data");return (Criteria)this;}public Criteria andDataNotBetween(Date value1,Date value2){addCriterion("data not between",value1,value2,"data");return (Criteria)this;}public Criteria andKeyWordsIsNull(){addCriterion("key_words is null");return (Criteria)this;}public Criteria andKeyWordsIsNotNull(){addCriterion("key_words is not null");return (Criteria)this;}public Criteria andKeyWordsEqualTo(String value){addCriterion("key_words =",value,"keyWords");return (Criteria)this;}public Criteria andKeyWordsNotEqualTo(String value){addCriterion("key_words <>",value,"keyWords");return (Criteria)this;}public Criteria andKeyWordsGreaterThan(String value){addCriterion("key_words >",value,"keyWords");return (Criteria)this;}public Criteria andKeyWordsGreaterThanOrEqualTo(String value){addCriterion("key_words >=",value,"keyWords");return (Criteria)this;}public Criteria andKeyWordsLessThan(String value){addCriterion("key_words <",value,"keyWords");return (Criteria)this;}public Criteria andKeyWordsLessThanOrEqualTo(String value){addCriterion("key_words <=",value,"keyWords");return (Criteria)this;}public Criteria andKeyWordsLike(String value){addCriterion("key_words like",value,"keyWords");return (Criteria)this;}public Criteria andKeyWordsNotLike(String value){addCriterion("key_words not like",value,"keyWords");return (Criteria)this;}public Criteria andKeyWordsIn(List<String> values){addCriterion("key_words in",values,"keyWords");return (Criteria)this;}public Criteria andKeyWordsNotIn(List<String> values){addCriterion("key_words not in",values,"keyWords");return (Criteria)this;}public Criteria andKeyWordsBetween(String value1,String value2){addCriterion("key_words between",value1,value2,"keyWords");return (Criteria)this;}public Criteria andKeyWordsNotBetween(String value1,String value2){addCriterion("key_words not between",value1,value2,"keyWords");return (Criteria)this;}}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table article
	 * @mbggenerated
	 */public static class Criterion {private String condition;private Object value;private Object secondValue;private boolean noValue;private boolean singleValue;private boolean betweenValue;private boolean listValue;private String typeHandler;public String getCondition(){return condition;}public Object getValue(){return value;}public Object getSecondValue(){return secondValue;}public boolean isNoValue(){return noValue;}public boolean isSingleValue(){return singleValue;}public boolean isBetweenValue(){return betweenValue;}public boolean isListValue(){return listValue;}public String getTypeHandler(){return typeHandler;}protected Criterion(String condition){super();this.condition=condition;this.typeHandler=null;this.noValue=true;}protected Criterion(String condition,Object value,String typeHandler){super();this.condition=condition;this.value=value;this.typeHandler=typeHandler;if (value instanceof List<?>){this.listValue=true;} else {this.singleValue=true;}}protected Criterion(String condition,Object value){this(condition,value,null);}protected Criterion(String condition,Object value,Object secondValue,String typeHandler){super();this.condition=condition;this.value=value;this.secondValue=secondValue;this.typeHandler=typeHandler;this.betweenValue=true;}protected Criterion(String condition,Object value,Object secondValue){this(condition,value,secondValue,null);}}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table article
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}