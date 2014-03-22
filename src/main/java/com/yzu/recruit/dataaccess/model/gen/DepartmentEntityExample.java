package com.yzu.recruit.dataaccess.model.gen;

import java.util.ArrayList;
import java.util.List;

public class DepartmentEntityExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table department
     *
     * @mbggenerated Wed Mar 19 22:59:50 CST 2014
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table department
     *
     * @mbggenerated Wed Mar 19 22:59:50 CST 2014
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table department
     *
     * @mbggenerated Wed Mar 19 22:59:50 CST 2014
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department
     *
     * @mbggenerated Wed Mar 19 22:59:50 CST 2014
     */
    public DepartmentEntityExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department
     *
     * @mbggenerated Wed Mar 19 22:59:50 CST 2014
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department
     *
     * @mbggenerated Wed Mar 19 22:59:50 CST 2014
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department
     *
     * @mbggenerated Wed Mar 19 22:59:50 CST 2014
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department
     *
     * @mbggenerated Wed Mar 19 22:59:50 CST 2014
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department
     *
     * @mbggenerated Wed Mar 19 22:59:50 CST 2014
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department
     *
     * @mbggenerated Wed Mar 19 22:59:50 CST 2014
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department
     *
     * @mbggenerated Wed Mar 19 22:59:50 CST 2014
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department
     *
     * @mbggenerated Wed Mar 19 22:59:50 CST 2014
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department
     *
     * @mbggenerated Wed Mar 19 22:59:50 CST 2014
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department
     *
     * @mbggenerated Wed Mar 19 22:59:50 CST 2014
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table department
     *
     * @mbggenerated Wed Mar 19 22:59:50 CST 2014
     */
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

        public Criteria andDepartmentidIsNull() {
            addCriterion("DepartmentID is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIsNotNull() {
            addCriterion("DepartmentID is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidEqualTo(Integer value) {
            addCriterion("DepartmentID =", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotEqualTo(Integer value) {
            addCriterion("DepartmentID <>", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThan(Integer value) {
            addCriterion("DepartmentID >", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DepartmentID >=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThan(Integer value) {
            addCriterion("DepartmentID <", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThanOrEqualTo(Integer value) {
            addCriterion("DepartmentID <=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIn(List<Integer> values) {
            addCriterion("DepartmentID in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotIn(List<Integer> values) {
            addCriterion("DepartmentID not in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidBetween(Integer value1, Integer value2) {
            addCriterion("DepartmentID between", value1, value2, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotBetween(Integer value1, Integer value2) {
            addCriterion("DepartmentID not between", value1, value2, "departmentid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("Name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("Name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("Name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("Name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("Name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("Name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("Name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("Name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("Name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("Name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("Name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("Name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("Name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("Name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("Type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("Type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("Type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("Type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("Type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("Type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("Type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("Type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("Type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("Type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("Type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("Type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("Type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("Type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andLeaderIsNull() {
            addCriterion("Leader is null");
            return (Criteria) this;
        }

        public Criteria andLeaderIsNotNull() {
            addCriterion("Leader is not null");
            return (Criteria) this;
        }

        public Criteria andLeaderEqualTo(String value) {
            addCriterion("Leader =", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotEqualTo(String value) {
            addCriterion("Leader <>", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderGreaterThan(String value) {
            addCriterion("Leader >", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderGreaterThanOrEqualTo(String value) {
            addCriterion("Leader >=", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderLessThan(String value) {
            addCriterion("Leader <", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderLessThanOrEqualTo(String value) {
            addCriterion("Leader <=", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderLike(String value) {
            addCriterion("Leader like", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotLike(String value) {
            addCriterion("Leader not like", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderIn(List<String> values) {
            addCriterion("Leader in", values, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotIn(List<String> values) {
            addCriterion("Leader not in", values, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderBetween(String value1, String value2) {
            addCriterion("Leader between", value1, value2, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotBetween(String value1, String value2) {
            addCriterion("Leader not between", value1, value2, "leader");
            return (Criteria) this;
        }

        public Criteria andOfficeaddressIsNull() {
            addCriterion("OfficeAddress is null");
            return (Criteria) this;
        }

        public Criteria andOfficeaddressIsNotNull() {
            addCriterion("OfficeAddress is not null");
            return (Criteria) this;
        }

        public Criteria andOfficeaddressEqualTo(String value) {
            addCriterion("OfficeAddress =", value, "officeaddress");
            return (Criteria) this;
        }

        public Criteria andOfficeaddressNotEqualTo(String value) {
            addCriterion("OfficeAddress <>", value, "officeaddress");
            return (Criteria) this;
        }

        public Criteria andOfficeaddressGreaterThan(String value) {
            addCriterion("OfficeAddress >", value, "officeaddress");
            return (Criteria) this;
        }

        public Criteria andOfficeaddressGreaterThanOrEqualTo(String value) {
            addCriterion("OfficeAddress >=", value, "officeaddress");
            return (Criteria) this;
        }

        public Criteria andOfficeaddressLessThan(String value) {
            addCriterion("OfficeAddress <", value, "officeaddress");
            return (Criteria) this;
        }

        public Criteria andOfficeaddressLessThanOrEqualTo(String value) {
            addCriterion("OfficeAddress <=", value, "officeaddress");
            return (Criteria) this;
        }

        public Criteria andOfficeaddressLike(String value) {
            addCriterion("OfficeAddress like", value, "officeaddress");
            return (Criteria) this;
        }

        public Criteria andOfficeaddressNotLike(String value) {
            addCriterion("OfficeAddress not like", value, "officeaddress");
            return (Criteria) this;
        }

        public Criteria andOfficeaddressIn(List<String> values) {
            addCriterion("OfficeAddress in", values, "officeaddress");
            return (Criteria) this;
        }

        public Criteria andOfficeaddressNotIn(List<String> values) {
            addCriterion("OfficeAddress not in", values, "officeaddress");
            return (Criteria) this;
        }

        public Criteria andOfficeaddressBetween(String value1, String value2) {
            addCriterion("OfficeAddress between", value1, value2, "officeaddress");
            return (Criteria) this;
        }

        public Criteria andOfficeaddressNotBetween(String value1, String value2) {
            addCriterion("OfficeAddress not between", value1, value2, "officeaddress");
            return (Criteria) this;
        }

        public Criteria andOfficetelephoneIsNull() {
            addCriterion("OfficeTelephone is null");
            return (Criteria) this;
        }

        public Criteria andOfficetelephoneIsNotNull() {
            addCriterion("OfficeTelephone is not null");
            return (Criteria) this;
        }

        public Criteria andOfficetelephoneEqualTo(String value) {
            addCriterion("OfficeTelephone =", value, "officetelephone");
            return (Criteria) this;
        }

        public Criteria andOfficetelephoneNotEqualTo(String value) {
            addCriterion("OfficeTelephone <>", value, "officetelephone");
            return (Criteria) this;
        }

        public Criteria andOfficetelephoneGreaterThan(String value) {
            addCriterion("OfficeTelephone >", value, "officetelephone");
            return (Criteria) this;
        }

        public Criteria andOfficetelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("OfficeTelephone >=", value, "officetelephone");
            return (Criteria) this;
        }

        public Criteria andOfficetelephoneLessThan(String value) {
            addCriterion("OfficeTelephone <", value, "officetelephone");
            return (Criteria) this;
        }

        public Criteria andOfficetelephoneLessThanOrEqualTo(String value) {
            addCriterion("OfficeTelephone <=", value, "officetelephone");
            return (Criteria) this;
        }

        public Criteria andOfficetelephoneLike(String value) {
            addCriterion("OfficeTelephone like", value, "officetelephone");
            return (Criteria) this;
        }

        public Criteria andOfficetelephoneNotLike(String value) {
            addCriterion("OfficeTelephone not like", value, "officetelephone");
            return (Criteria) this;
        }

        public Criteria andOfficetelephoneIn(List<String> values) {
            addCriterion("OfficeTelephone in", values, "officetelephone");
            return (Criteria) this;
        }

        public Criteria andOfficetelephoneNotIn(List<String> values) {
            addCriterion("OfficeTelephone not in", values, "officetelephone");
            return (Criteria) this;
        }

        public Criteria andOfficetelephoneBetween(String value1, String value2) {
            addCriterion("OfficeTelephone between", value1, value2, "officetelephone");
            return (Criteria) this;
        }

        public Criteria andOfficetelephoneNotBetween(String value1, String value2) {
            addCriterion("OfficeTelephone not between", value1, value2, "officetelephone");
            return (Criteria) this;
        }

        public Criteria andPostalcodeIsNull() {
            addCriterion("PostalCode is null");
            return (Criteria) this;
        }

        public Criteria andPostalcodeIsNotNull() {
            addCriterion("PostalCode is not null");
            return (Criteria) this;
        }

        public Criteria andPostalcodeEqualTo(String value) {
            addCriterion("PostalCode =", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeNotEqualTo(String value) {
            addCriterion("PostalCode <>", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeGreaterThan(String value) {
            addCriterion("PostalCode >", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeGreaterThanOrEqualTo(String value) {
            addCriterion("PostalCode >=", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeLessThan(String value) {
            addCriterion("PostalCode <", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeLessThanOrEqualTo(String value) {
            addCriterion("PostalCode <=", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeLike(String value) {
            addCriterion("PostalCode like", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeNotLike(String value) {
            addCriterion("PostalCode not like", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeIn(List<String> values) {
            addCriterion("PostalCode in", values, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeNotIn(List<String> values) {
            addCriterion("PostalCode not in", values, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeBetween(String value1, String value2) {
            addCriterion("PostalCode between", value1, value2, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeNotBetween(String value1, String value2) {
            addCriterion("PostalCode not between", value1, value2, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostaladdressIsNull() {
            addCriterion("PostalAddress is null");
            return (Criteria) this;
        }

        public Criteria andPostaladdressIsNotNull() {
            addCriterion("PostalAddress is not null");
            return (Criteria) this;
        }

        public Criteria andPostaladdressEqualTo(String value) {
            addCriterion("PostalAddress =", value, "postaladdress");
            return (Criteria) this;
        }

        public Criteria andPostaladdressNotEqualTo(String value) {
            addCriterion("PostalAddress <>", value, "postaladdress");
            return (Criteria) this;
        }

        public Criteria andPostaladdressGreaterThan(String value) {
            addCriterion("PostalAddress >", value, "postaladdress");
            return (Criteria) this;
        }

        public Criteria andPostaladdressGreaterThanOrEqualTo(String value) {
            addCriterion("PostalAddress >=", value, "postaladdress");
            return (Criteria) this;
        }

        public Criteria andPostaladdressLessThan(String value) {
            addCriterion("PostalAddress <", value, "postaladdress");
            return (Criteria) this;
        }

        public Criteria andPostaladdressLessThanOrEqualTo(String value) {
            addCriterion("PostalAddress <=", value, "postaladdress");
            return (Criteria) this;
        }

        public Criteria andPostaladdressLike(String value) {
            addCriterion("PostalAddress like", value, "postaladdress");
            return (Criteria) this;
        }

        public Criteria andPostaladdressNotLike(String value) {
            addCriterion("PostalAddress not like", value, "postaladdress");
            return (Criteria) this;
        }

        public Criteria andPostaladdressIn(List<String> values) {
            addCriterion("PostalAddress in", values, "postaladdress");
            return (Criteria) this;
        }

        public Criteria andPostaladdressNotIn(List<String> values) {
            addCriterion("PostalAddress not in", values, "postaladdress");
            return (Criteria) this;
        }

        public Criteria andPostaladdressBetween(String value1, String value2) {
            addCriterion("PostalAddress between", value1, value2, "postaladdress");
            return (Criteria) this;
        }

        public Criteria andPostaladdressNotBetween(String value1, String value2) {
            addCriterion("PostalAddress not between", value1, value2, "postaladdress");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("UserID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("UserID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("UserID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("UserID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("UserID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("UserID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("UserID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("UserID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("UserID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("UserID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("UserID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("UserID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andMarkfordeleteIsNull() {
            addCriterion("MarkForDelete is null");
            return (Criteria) this;
        }

        public Criteria andMarkfordeleteIsNotNull() {
            addCriterion("MarkForDelete is not null");
            return (Criteria) this;
        }

        public Criteria andMarkfordeleteEqualTo(Boolean value) {
            addCriterion("MarkForDelete =", value, "markfordelete");
            return (Criteria) this;
        }

        public Criteria andMarkfordeleteNotEqualTo(Boolean value) {
            addCriterion("MarkForDelete <>", value, "markfordelete");
            return (Criteria) this;
        }

        public Criteria andMarkfordeleteGreaterThan(Boolean value) {
            addCriterion("MarkForDelete >", value, "markfordelete");
            return (Criteria) this;
        }

        public Criteria andMarkfordeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("MarkForDelete >=", value, "markfordelete");
            return (Criteria) this;
        }

        public Criteria andMarkfordeleteLessThan(Boolean value) {
            addCriterion("MarkForDelete <", value, "markfordelete");
            return (Criteria) this;
        }

        public Criteria andMarkfordeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("MarkForDelete <=", value, "markfordelete");
            return (Criteria) this;
        }

        public Criteria andMarkfordeleteIn(List<Boolean> values) {
            addCriterion("MarkForDelete in", values, "markfordelete");
            return (Criteria) this;
        }

        public Criteria andMarkfordeleteNotIn(List<Boolean> values) {
            addCriterion("MarkForDelete not in", values, "markfordelete");
            return (Criteria) this;
        }

        public Criteria andMarkfordeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("MarkForDelete between", value1, value2, "markfordelete");
            return (Criteria) this;
        }

        public Criteria andMarkfordeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("MarkForDelete not between", value1, value2, "markfordelete");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table department
     *
     * @mbggenerated do_not_delete_during_merge Wed Mar 19 22:59:50 CST 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table department
     *
     * @mbggenerated Wed Mar 19 22:59:50 CST 2014
     */
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