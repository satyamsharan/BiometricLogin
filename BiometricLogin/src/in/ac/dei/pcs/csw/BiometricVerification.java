package in.ac.dei.pcs.csw;

import java.sql.ResultSet;

public class BiometricVerification {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiometricVerification bv=new BiometricVerification();
		bv.register("satyam.sharan@hotmail.com", "Password@99", "Mintest");
		System.out.println(bv.getMin("satyam.sharan@hotmail.com"));
		System.out.println(bv.getPassword("satyam.sharan@hotmail.com"));
	}
	
	public boolean register(String uid,String password,String min){
		Database db=new Database();
		try {
			db.startDatabase();
			db.updateQuarry("insert into User values('"+uid+"','"+password+"','"+min+"',now())");
			db.closeDatabase();
			return true;
		} catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}
		return false;
	}

	public String getMin(String uid){
		Database db=new Database();
		try {
			db.startDatabase();
			String query="select Min from User where UId='"+uid+"'";
			System.out.println(query);
			ResultSet rs= db.executeQuarry(query);
			//rs.first();
			String min="";
			while(rs.next()){
				min=rs.getString(1);
			}
			rs.close();
			db.closeDatabase();
			return min;
		} catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}
		return "";
	}
	
	public String getPassword(String uid){
		Database db=new Database();
		try {
			db.startDatabase();
			String query="select Pass from User where UId='"+uid+"'";
			System.out.println(query);
			ResultSet rs= db.executeQuarry(query);
			//rs.first();
			String min="";
			while(rs.next()){
				min=rs.getString(1);
			}
			rs.close();
			db.closeDatabase();
			return min;
		} catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}
		return "";
	}
}
