package model;

import java.sql.Date;

public class Hoadon192 extends Ve192{
	private int id;
	private int tongtien;
	private Date ngaytao;
	public Hoadon192() {
		super();
	}
	public Hoadon192(int id, int tongtien, Date ngaytao) {
		super();
		this.id = id;
		this.tongtien = tongtien;
		this.ngaytao = ngaytao;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTongtien() {
		return tongtien;
	}
	public void setTongtien(int tongtien) {
		this.tongtien = tongtien;
	}
	public Date getNgaytao() {
		return ngaytao;
	}
	public void setNgaytao(Date ngaytao) {
		this.ngaytao = ngaytao;
	}
	
}
