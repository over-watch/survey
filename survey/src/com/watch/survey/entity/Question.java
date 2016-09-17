package com.watch.survey.entity;

/**
 * Question entity. @author MyEclipse Persistence Tools
 */

public class Question implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer sid;
	private Integer questionType;
	private String title;
	private String options;
	private Boolean other;
	private Integer otherStyle;
	private String otherSelectOptions;
	private String matrixRowTitles;
	private String matrixColTitles;
	private String matrixSelectOptions;

	// Constructors

	/** default constructor */
	public Question() {
	}

	/** minimal constructor */
	public Question(Integer questionType, String title, String options) {
		this.questionType = questionType;
		this.title = title;
		this.options = options;
	}

	/** full constructor */
	public Question(Integer sid, Integer questionType, String title,
			String options, Boolean other, Integer otherStyle,
			String otherSelectOptions, String matrixRowTitles,
			String matrixColTitles, String matrixSelectOptions) {
		this.sid = sid;
		this.questionType = questionType;
		this.title = title;
		this.options = options;
		this.other = other;
		this.otherStyle = otherStyle;
		this.otherSelectOptions = otherSelectOptions;
		this.matrixRowTitles = matrixRowTitles;
		this.matrixColTitles = matrixColTitles;
		this.matrixSelectOptions = matrixSelectOptions;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSid() {
		return this.sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public Integer getQuestionType() {
		return this.questionType;
	}

	public void setQuestionType(Integer questionType) {
		this.questionType = questionType;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getOptions() {
		return this.options;
	}

	public void setOptions(String options) {
		this.options = options;
	}

	public Boolean getOther() {
		return this.other;
	}

	public void setOther(Boolean other) {
		this.other = other;
	}

	public Integer getOtherStyle() {
		return this.otherStyle;
	}

	public void setOtherStyle(Integer otherStyle) {
		this.otherStyle = otherStyle;
	}

	public String getOtherSelectOptions() {
		return this.otherSelectOptions;
	}

	public void setOtherSelectOptions(String otherSelectOptions) {
		this.otherSelectOptions = otherSelectOptions;
	}

	public String getMatrixRowTitles() {
		return this.matrixRowTitles;
	}

	public void setMatrixRowTitles(String matrixRowTitles) {
		this.matrixRowTitles = matrixRowTitles;
	}

	public String getMatrixColTitles() {
		return this.matrixColTitles;
	}

	public void setMatrixColTitles(String matrixColTitles) {
		this.matrixColTitles = matrixColTitles;
	}

	public String getMatrixSelectOptions() {
		return this.matrixSelectOptions;
	}

	public void setMatrixSelectOptions(String matrixSelectOptions) {
		this.matrixSelectOptions = matrixSelectOptions;
	}

}