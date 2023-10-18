package model;

import java.sql.Date;

public class Thanhvien192 {
	private int id;
	private String username;
	private String password;
	private String name;
	private String vaitro;
	private String email;
	private String sdt;
	private String diachi;
	private Date ngaysinh;
	public Thanhvien192() {
		super();
	}
	
	public Thanhvien192(int id, String username, String password, String name, String vaitro, String email, String sdt,
			String diachi, Date ngaysinh) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.name = name;
		this.vaitro = vaitro;
		this.email = email;
		this.sdt = sdt;
		this.diachi = diachi;
		this.ngaysinh = ngaysinh;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVaitro() {
		return vaitro;
	}

	public void setVaitro(String vaitro) {
		this.vaitro = vaitro;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public Date getNgaysinh() {
		return ngaysinh;
	}

	public void setNgaysinh(Date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}

	
	
}
