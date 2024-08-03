package com.test1;

public class SolaceDataWorkflow {
	private Integer dataProcessFlowCode;
	private String dataProcessFlowType;
	private String refId;
	private String screenId;
	private Integer crId;
	private Integer crTypeCode;
	private Integer userId;
	private String KeyAtttr;
	private String crDesc;
	private String ketAttrValue;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public SolaceDataWorkflow() {

	}

	public SolaceDataWorkflow(Integer dataProcessFlowCode, String dataProcessFlowType, String refId, String screenId,
			Integer crId, Integer crTypeCode, Integer userId, String keyAtttr, String crDesc, String ketAttrValue,
			String creationDate, String modifiedDate, String entityState) {
		super();
		this.dataProcessFlowCode = dataProcessFlowCode;
		this.dataProcessFlowType = dataProcessFlowType;
		this.refId = refId;
		this.screenId = screenId;
		this.crId = crId;
		this.crTypeCode = crTypeCode;
		this.userId = userId;
		KeyAtttr = keyAtttr;
		this.crDesc = crDesc;
		this.ketAttrValue = ketAttrValue;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getDataProcessFlowCode() {
		return dataProcessFlowCode;
	}

	public void setDataProcessFlowCode(Integer dataProcessFlowCode) {
		this.dataProcessFlowCode = dataProcessFlowCode;
	}

	public String getDataProcessFlowType() {
		return dataProcessFlowType;
	}

	public void setDataProcessFlowType(String dataProcessFlowType) {
		this.dataProcessFlowType = dataProcessFlowType;
	}

	public String getRefId() {
		return refId;
	}

	public void setRefId(String refId) {
		this.refId = refId;
	}

	public String getScreenId() {
		return screenId;
	}

	public void setScreenId(String screenId) {
		this.screenId = screenId;
	}

	public Integer getCrId() {
		return crId;
	}

	public void setCrId(Integer crId) {
		this.crId = crId;
	}

	public Integer getCrTypeCode() {
		return crTypeCode;
	}

	public void setCrTypeCode(Integer crTypeCode) {
		this.crTypeCode = crTypeCode;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getKeyAtttr() {
		return KeyAtttr;
	}

	public void setKeyAtttr(String keyAtttr) {
		KeyAtttr = keyAtttr;
	}

	public String getCrDesc() {
		return crDesc;
	}

	public void setCrDesc(String crDesc) {
		this.crDesc = crDesc;
	}

	public String getKetAttrValue() {
		return ketAttrValue;
	}

	public void setKetAttrValue(String ketAttrValue) {
		this.ketAttrValue = ketAttrValue;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
