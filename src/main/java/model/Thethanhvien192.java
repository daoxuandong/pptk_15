package model;

import java.sql.Date;

public class Thethanhvien192 extends Khachhang192 {
	private String loaithe;
	private Date ngaydangky;
	public Thethanhvien192() {
		super();
	}
	public Thethanhvien192(String loaithe, Date ngaydangky) {
		super();
		this.loaithe = loaithe;
		this.ngaydangky = ngaydangky;
	}
	public String getLoaithe() {
		return loaithe;
	}
	public void setLoaithe(String loaithe) {
		this.loaithe = loaithe;
	}
	public Date getNgaydangky() {
		return ngaydangky;
	}
	public void setNgaydangky(Date ngaydangky) {
		this.ngaydangky = ngaydangky;
	}
	
}
