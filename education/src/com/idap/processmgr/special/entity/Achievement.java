package com.idap.processmgr.special.entity;

import java.io.Serializable;
import java.util.Date;

public class Achievement implements Serializable{


	private static final long serialVersionUID = -6793324451803471056L;

	 public Achievement (){}
	 private String id;      //主键
	 private String requCode;//需求编号
	 private String requName;//需求名称
	 private String requCont;//需求内容
	 private String requType;//需求类型
	 private Date 	applDate = new Date();//申请时间
	 private String applPer;//申请人
	 private String applPer_;//申请人
	 private String applOrg;//申请人单位
	 private String applDept;//申请人部门
	 private String dataApplContacts;//数据申请联系人
	 private String dataApplTel;//数据申请联系人电话
	 private String dataApplEmail;//数据申请联系人邮箱
	 private String dataPassType;//数据传送方式
	 private String dataExtrType;//数据抽取方式
	 private Date analCyclStart;//交付日期
	 private Date analCyclEnd;//分析周期_结束
	 private String requDesc;//需求描述
	 private String requUrl;//需求描述url
	 private String spcOrjName;//专题名称
	 private String objApplyOrg;//项目申请单位
	 private String securityLev;//安全级别
	 private String emergencyLev;//紧急程度
	 private String dataSources;//数据来源
	 private Date createTime = new Date();//创建时间
	 private String creator;//创建人
	 private String contact;//联系人
	 private String approState = "1";//状态
	 private String remarks;//备注
	 private Date updateTime=new Date();//更新时间
	 private String addRecord = "0";//是否补录
	 private String flowType;//流程类型
	 private String provContacts;//省内专门联系人
	 private String groupTechContacts;//集团技术联系人
	 private String techContacts;//技术联系人
	 
	 private String userId;//执行流程实例用户id
	 private String userName;//用户姓名
	 
	public String getApplPer_() {
		return applPer_;
	}
	public void setApplPer_(String applPer_) {
		this.applPer_ = applPer_;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getProvContacts() {
		return provContacts;
	}
	public void setProvContacts(String provContacts) {
		this.provContacts = provContacts;
	}
	public String getGroupTechContacts() {
		return groupTechContacts;
	}
	public void setGroupTechContacts(String groupTechContacts) {
		this.groupTechContacts = groupTechContacts;
	}
	public String getTechContacts() {
		return techContacts;
	}
	public void setTechContacts(String techContacts) {
		this.techContacts = techContacts;
	}
	public String getFlowType() {
		return flowType;
	}
	public void setFlowType(String flowType) {
		this.flowType = flowType;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRequCode() {
		return requCode;
	}
	public void setRequCode(String requCode) {
		this.requCode = requCode;
	}
	public String getRequName() {
		return requName;
	}
	public void setRequName(String requName) {
		this.requName = requName;
	}
	public String getRequCont() {
		return requCont;
	}
	public void setRequCont(String requCont) {
		this.requCont = requCont;
	}
	public String getRequType() {
		return requType;
	}
	public void setRequType(String requType) {
		this.requType = requType;
	}
	public Date getApplDate() {
		return applDate;
	}
	public void setApplDate(Date applDate) {
		this.applDate = applDate;
	}
	public String getApplPer() {
		return applPer;
	}
	public void setApplPer(String applPer) {
		this.applPer = applPer;
	}
	public String getApplOrg() {
		return applOrg;
	}
	public void setApplOrg(String applOrg) {
		this.applOrg = applOrg;
	}
	public String getApplDept() {
		return applDept;
	}
	public void setApplDept(String applDept) {
		this.applDept = applDept;
	}
	public String getDataApplContacts() {
		return dataApplContacts;
	}
	public void setDataApplContacts(String dataApplContacts) {
		this.dataApplContacts = dataApplContacts;
	}
	public String getDataApplTel() {
		return dataApplTel;
	}
	public void setDataApplTel(String dataApplTel) {
		this.dataApplTel = dataApplTel;
	}
	public String getDataApplEmail() {
		return dataApplEmail;
	}
	public void setDataApplEmail(String dataApplEmail) {
		this.dataApplEmail = dataApplEmail;
	}
	public String getDataPassType() {
		return dataPassType;
	}
	public void setDataPassType(String dataPassType) {
		this.dataPassType = dataPassType;
	}
	public String getDataExtrType() {
		return dataExtrType;
	}
	public void setDataExtrType(String dataExtrType) {
		this.dataExtrType = dataExtrType;
	}
	public Date getAnalCyclStart() {
		return analCyclStart;
	}
	public void setAnalCyclStart(Date analCyclStart) {
		this.analCyclStart = analCyclStart;
	}
	public Date getAnalCyclEnd() {
		return analCyclEnd;
	}
	public void setAnalCyclEnd(Date analCyclEnd) {
		this.analCyclEnd = analCyclEnd;
	}
	public String getRequDesc() {
		return requDesc;
	}
	public void setRequDesc(String requDesc) {
		this.requDesc = requDesc;
	}
	public String getRequUrl() {
		return requUrl;
	}
	public void setRequUrl(String requUrl) {
		this.requUrl = requUrl;
	}
	public String getSpcOrjName() {
		return spcOrjName;
	}
	public void setSpcOrjName(String spcOrjName) {
		this.spcOrjName = spcOrjName;
	}
	public String getObjApplyOrg() {
		return objApplyOrg;
	}
	public void setObjApplyOrg(String objApplyOrg) {
		this.objApplyOrg = objApplyOrg;
	}
	public String getSecurityLev() {
		return securityLev;
	}
	public void setSecurityLev(String securityLev) {
		this.securityLev = securityLev;
	}
	public String getEmergencyLev() {
		return emergencyLev;
	}
	public void setEmergencyLev(String emergencyLev) {
		this.emergencyLev = emergencyLev;
	}
	public String getDataSources() {
		return dataSources;
	}
	public void setDataSources(String dataSources) {
		this.dataSources = dataSources;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getApproState() {
		return approState;
	}
	public void setApproState(String approState) {
		this.approState = approState;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public String getAddRecord() {
		return addRecord;
	}
	public void setAddRecord(String addRecord) {
		this.addRecord = addRecord;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
}	
