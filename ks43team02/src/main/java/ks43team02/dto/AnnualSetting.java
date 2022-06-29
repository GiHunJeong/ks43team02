package ks43team02.dto;

public class AnnualSetting {
	private String annual_setting_code;
	private String cp_representative_code;
	private String super_admin_id;
	private String annual_standard_code;
	private String emply_id;
	private String year;
	private String cp_name;
	private String reg_date;
	
	public String getAnnual_setting_code() {
		return annual_setting_code;
	}

	public void setAnnual_setting_code(String annual_setting_code) {
		this.annual_setting_code = annual_setting_code;
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

	public String getAnnual_standard_code() {
		return annual_standard_code;
	}

	public void setAnnual_standard_code(String annual_standard_code) {
		this.annual_standard_code = annual_standard_code;
	}

	public String getEmply_id() {
		return emply_id;
	}

	public void setEmply_id(String emply_id) {
		this.emply_id = emply_id;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getCp_name() {
		return cp_name;
	}

	public void setCp_name(String cp_name) {
		this.cp_name = cp_name;
	}

	public String getReg_date() {
		return reg_date;
	}

	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}

	@Override
	public String toString() {
		return "AnnualSetting [annual_setting_code=" + annual_setting_code + ", cp_representative_code="
				+ cp_representative_code + ", super_admin_id=" + super_admin_id + ", annual_standard_code="
				+ annual_standard_code + ", emply_id=" + emply_id + ", year=" + year + ", cp_name=" + cp_name
				+ ", reg_date=" + reg_date + "]";
	}

}
