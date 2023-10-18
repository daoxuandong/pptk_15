package model;

public class Phongchieu192 {
	private int id;
	private String tenphong;
	private int succhua;
	private String trangthai;
	public Phongchieu192() {
		super();
	}
	public Phongchieu192(int id, String tenphong, int succhua, String trangthai) {
		super();
		this.id = id;
		this.tenphong = tenphong;
		this.succhua = succhua;
		this.trangthai = trangthai;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTenphong() {
		return tenphong;
	}
	public void setTenphong(String tenphong) {
		this.tenphong = tenphong;
	}
	public int getSucchua() {
		return succhua;
	}
	public void setSucchua(int succhua) {
		this.succhua = succhua;
	}
	public String getTrangthai() {
		return trangthai;
	}
	public void setTrangthai(String trangthai) {
		this.trangthai = trangthai;
	}
	
}
