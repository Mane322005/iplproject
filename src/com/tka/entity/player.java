package com.tka.entity;

public class player {
    private int id;	
	private int jn;
	private String pname;
	private int run;
	private int  wickets;
	private String tname;
	public player() {
		super();
	}
	public player(int id, int jn, String pname, int run, int wickets, String tname) {
		super();
		this.id = id;
		this.jn = jn;
		this.pname = pname;
		this.run = run;
		this.wickets = wickets;
		this.tname = tname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getJn() {
		return jn;
	}
	public void setJn(int jn) {
		this.jn = jn;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getRun() {
		return run;
	}
	public void setRun(int run) {
		this.run = run;
	}
	public int getWickets() {
		return wickets;
	}
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	@Override
	public String toString() {
		return "player [id=" + id + ", jn=" + jn + ", pname=" + pname + ", run=" + run + ", wickets=" + wickets
				+ ", tname=" + tname + "]";
	}
	

}
