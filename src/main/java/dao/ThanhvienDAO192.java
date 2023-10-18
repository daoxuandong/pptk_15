package dao;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import model.Thanhvien192;
public class ThanhvienDAO192 extends DAO192{
	public ThanhvienDAO192() {
		super();
		// TODO Auto-generated constructor stub
	}
	public boolean kiemtraDangnhap(Thanhvien192 tv){
		boolean kq = false;
		if(tv.getUsername().contains("true") ||	tv.getUsername().contains("=")||tv.getPassword().contains("true") ||tv.getPassword().contains("=")) 
			return false;
		
		String sql = "{call kiemtraDN(?,?)}"; //su dung stored procedure
		try{
			CallableStatement cs = con.prepareCall(sql);
			cs.setString(1,tv.getUsername());
			cs.setString(2,tv.getPassword());
			ResultSet rs = cs.executeQuery();
			if(rs.next()){
				tv.setId(rs.getInt("id"));
				tv.setVaitro(rs.getString("vaitro"));
				tv.setName(rs.getString("name"));
			
				kq = true;
			}
		}catch(Exception e){
			e.printStackTrace();
			kq = false;
		}
	return kq;
	}
}