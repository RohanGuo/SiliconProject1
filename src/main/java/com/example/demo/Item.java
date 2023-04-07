package com.example.demo;

public class Item {
	private long id;
	private long sourceId;
	private String logloc;
	
	public Item(long id, long sourceId, String logloc) {
		super();
		this.id = id;
		this.sourceId = sourceId;
		this.logloc = logloc;
	}

	public Item() {
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getSourceId() {
		return sourceId;
	}

	public void setSourceId(long sourceId) {
		this.sourceId = sourceId;
	}

	public String getLogloc() {
		return logloc;
	}

	public void setLogloc(String logloc) {
		this.logloc = logloc;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", sourceId=" + sourceId + ", logloc=" + logloc + "]";
	}
	
}
