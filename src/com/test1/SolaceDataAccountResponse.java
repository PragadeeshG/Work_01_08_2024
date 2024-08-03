package com.test1;

public class SolaceDataAccountResponse {
	private Integer solaceDataId;
	private String solaceDataOwner;
	private boolean activeAccount;
	private Integer solaceDataTypeId;
	private String solaceDataType;
	private String solaceDataStatus;
	private Integer soalceDataDescription;
	private Integer authorizerCount;
	private String authCountry;
	private Integer authRegionCode;
	private String exceptions;
	private String status;
	private String remarks;

	public SolaceDataAccountResponse() {

	}

	public SolaceDataAccountResponse(Integer solaceDataId, String solaceDataOwner, boolean activeAccount,
			Integer solaceDataTypeId, String solaceDataType, String solaceDataStatus, Integer soalceDataDescription,
			Integer authorizerCount, String authCountry, Integer authRegionCode, String exceptions, String status,
			String remarks) {
		super();
		this.solaceDataId = solaceDataId;
		this.solaceDataOwner = solaceDataOwner;
		this.activeAccount = activeAccount;
		this.solaceDataTypeId = solaceDataTypeId;
		this.solaceDataType = solaceDataType;
		this.solaceDataStatus = solaceDataStatus;
		this.soalceDataDescription = soalceDataDescription;
		this.authorizerCount = authorizerCount;
		this.authCountry = authCountry;
		this.authRegionCode = authRegionCode;
		this.exceptions = exceptions;
		this.status = status;
		this.remarks = remarks;
	}

	public Integer getSolaceDataId() {
		return solaceDataId;
	}

	public void setSolaceDataId(Integer solaceDataId) {
		this.solaceDataId = solaceDataId;
	}

	public String getSolaceDataOwner() {
		return solaceDataOwner;
	}

	public void setSolaceDataOwner(String solaceDataOwner) {
		this.solaceDataOwner = solaceDataOwner;
	}

	public boolean isActiveAccount() {
		return activeAccount;
	}

	public void setActiveAccount(boolean activeAccount) {
		this.activeAccount = activeAccount;
	}

	public Integer getSolaceDataTypeId() {
		return solaceDataTypeId;
	}

	public void setSolaceDataTypeId(Integer solaceDataTypeId) {
		this.solaceDataTypeId = solaceDataTypeId;
	}

	public String getSolaceDataType() {
		return solaceDataType;
	}

	public void setSolaceDataType(String solaceDataType) {
		this.solaceDataType = solaceDataType;
	}

	public String getSolaceDataStatus() {
		return solaceDataStatus;
	}

	public void setSolaceDataStatus(String solaceDataStatus) {
		this.solaceDataStatus = solaceDataStatus;
	}

	public Integer getSoalceDataDescription() {
		return soalceDataDescription;
	}

	public void setSoalceDataDescription(Integer soalceDataDescription) {
		this.soalceDataDescription = soalceDataDescription;
	}

	public Integer getAuthorizerCount() {
		return authorizerCount;
	}

	public void setAuthorizerCount(Integer authorizerCount) {
		this.authorizerCount = authorizerCount;
	}

	public String getAuthCountry() {
		return authCountry;
	}

	public void setAuthCountry(String authCountry) {
		this.authCountry = authCountry;
	}

	public Integer getAuthRegionCode() {
		return authRegionCode;
	}

	public void setAuthRegionCode(Integer authRegionCode) {
		this.authRegionCode = authRegionCode;
	}

	public String getExceptions() {
		return exceptions;
	}

	public void setExceptions(String exceptions) {
		this.exceptions = exceptions;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
