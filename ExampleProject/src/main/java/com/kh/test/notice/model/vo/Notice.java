package com.kh.test.notice.model.vo;

import java.util.Date;

public class Notice {
	
	private int nId;
	private String title;
	private String writer;
	private String content;
	private Date nDate;
	
	public Notice() {}

	public Notice(int nId, String title, String writer, String content, Date nDate) {
		this.nId = nId;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.nDate = nDate;
	}

	@Override
	public String toString() {
		return "Notice [nId=" + nId + ", title=" + title + ", writer=" + writer + ", content=" + content + ", nDate="
				+ nDate + "]";
	}

	public int getnId() {
		return nId;
	}

	public void setnId(int nId) {
		this.nId = nId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getnDate() {
		return nDate;
	}

	public void setnDate(Date nDate) {
		this.nDate = nDate;
	}
	
	
	
}
