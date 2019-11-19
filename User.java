package po;

public class User {
	private int id;//用户ID
	private int stuid;//用户学号
	private String name;//用户姓名
	private int phone;//用户电话
	private String payimg;//用户付款二维码
	private String img;//用户头像
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStuid() {
		return stuid;
	}
	public void setStuid(int stuid) {
		this.stuid = stuid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getPayimg() {
		return payimg;
	}
	public void setPayimg(String payimg) {
		this.payimg = payimg;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
}
