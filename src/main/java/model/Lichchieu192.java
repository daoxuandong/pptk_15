package model;

import java.sql.Date;

public class Lichchieu192 {
	private Date ngaychieu;
	private int Giochieu;
	public Lichchieu192() {
		super();
	}
	public Lichchieu192(Date ngaychieu, int giochieu) {
		super();
		this.ngaychieu = ngaychieu;
		Giochieu = giochieu;
	}
	public Date getNgaychieu() {
		return ngaychieu;
	}
	public void setNgaychieu(Date ngaychieu) {
		this.ngaychieu = ngaychieu;
	}
	public int getGiochieu() {
		return Giochieu;
	}
	public void setGiochieu(int giochieu) {
		Giochieu = giochieu;
	}
	
}
