package ks43team02.dto;

public class AnnualApplication {
	private String annual_application_code;
	private String cp_representative_code;
	private String super_admin_id;
	private String cate_annual;
	private String approval_request_code;
	private String emply_id;
	private String emply_name;
	private String annual_start_date;
	private String annual_end_date;
	private String use_date;
	private String comment;
	private String attach_file_name;
	private String reg_date;
	private String group_code;
	
	public String getAnnual_application_code() {
		return annual_application_code;
	}

	public void setAnnual_application_code(String annual_application_code) {
		this.annual_application_code = annual_application_code;
	}

	public String getCp_representative_code() {
		return cp_representative_code;
	}

	public void setCp_representative_code(String cp_representative_code) {
		this.cp_representative_code = cp_representative_code;
	}

	public String getSuper_admin_id() {
		return super_admin_id;
	}

	public void setSuper_admin_id(String super_admin_id) {
		this.super_admin_id = super_admin_id;
	}

	public String getCate_annual() {
		return cate_annual;
	}

	public void setCate_annual(String cate_annual) {
		this.cate_annual = cate_annual;
	}

	public String getApproval_request_code() {
		return approval_request_code;
	}

	public void setApproval_request_code(String approval_request_code) {
		this.approval_request_code = approval_request_code;
	}

	public String getEmply_id() {
		return emply_id;
	}

	public void setEmply_id(String emply_id) {
		this.emply_id = emply_id;
	}

	public String getEmply_name() {
		return emply_name;
	}

	public void setEmply_name(String emply_name) {
		this.emply_name = emply_name;
	}

	public String getAnnual_annual_start_date() {
		return annual_start_date;
	}

	public void setAnnual_annual_start_date(String annual_annual_start_date) {
		this.annual_start_date = annual_annual_start_date;
	}

	public String getAnnual_annual_end_date() {
		return annual_end_date;
	}

	public void setAnnual_annual_end_date(String annual_annual_end_date) {
		this.annual_end_date = annual_annual_end_date;
	}

	public String getUse_date() {
		return use_date;
	}

	public void setUse_date(String use_date) {
		this.use_date = use_date;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getAttach_file_name() {
		return attach_file_name;
	}

	public void setAttach_file_name(String attach_file_name) {
		this.attach_file_name = attach_file_name;
	}

	public String getReg_date() {
		return reg_date;
	}

	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}

	public String getGroup_code() {
		return group_code;
	}

	public void setGroup_code(String group_code) {
		this.group_code = group_code;
	}

	@Override
	public String toString() {
		return "AnnualApplication [annual_application_code=" + annual_application_code + ", cp_representative_code="
				+ cp_representative_code + ", super_admin_id=" + super_admin_id + ", cate_annual=" + cate_annual
				+ ", approval_request_code=" + approval_request_code + ", emply_id=" + emply_id + ", emply_name="
				+ emply_name + ", annual_annual_start_date=" + annual_start_date + ", annual_annual_end_date="
				+ annual_end_date + ", use_date=" + use_date + ", comment=" + comment + ", attach_file_name="
				+ attach_file_name + ", reg_date=" + reg_date + ", group_code=" + group_code + "]";
	}
}
