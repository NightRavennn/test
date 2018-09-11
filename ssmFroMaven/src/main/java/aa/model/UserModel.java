package aa.model;

/**
 * @author fanhua.ping
 *
 */
public class UserModel {
	private Integer id;
	private String uname;
	private String pwd;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public UserModel() {
		super();
	}
	public UserModel(Integer id, String uname, String pwd) {
		super();
		this.id = id;
		this.uname = uname;
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "UserModel [id=" + id + ", uname=" + uname + ", pwd=" + pwd + "]";
	}
	
	
}
