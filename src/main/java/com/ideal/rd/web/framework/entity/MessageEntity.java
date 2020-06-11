package com.ideal.rd.web.framework.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MessageEntity implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private int code = 0;
	private boolean isError = false;
	private String title = "Message";
	private String content = "success";
	private Object callbackData;
	private String bombedAt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());

	public MessageEntity addCode(int code) {
		this.code = code;
		return this;
	}

	public MessageEntity addIsError(boolean isError) {
		this.isError = isError;
		return this;
	}

	public MessageEntity addTitle(String title) {
		this.title = title;
		return this;
	}

	public MessageEntity addContent(String content) {
		this.content = content;
		return this;
	}

	public MessageEntity addCallbackData(Object callbackData) {
		this.callbackData = callbackData;
		return this;
	}
	
	public MessageEntity addCombedAt(String bombedAt) {
		this.bombedAt = bombedAt;
		return this;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public boolean isError() {
		return isError;
	}

	public void setError(boolean isError) {
		this.isError = isError;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getBombedAt() {
		return bombedAt;
	}

	public void setBombedAt(String bombedAt) {
		this.bombedAt = bombedAt;
	}

	public Object getCallbackData() {
		return callbackData;
	}

	public void setCallbackData(Object callbackData) {
		this.callbackData = callbackData;
	}

	@Override
	public String toString() {
		return "MessageEntity [code=" + code + ", isError=" + isError + ", title=" + title + ", content=" + content
				+ ", callbackData=" + callbackData + ", bombedAt=" + bombedAt + "]";
	}

}
