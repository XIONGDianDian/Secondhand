package po;

public class Stuff {
	private int stuffid;//商品 id
	private int id;//对应用户ID
	private String name;//商品名称
	private String stuffimg;//商品图片
	private String info;//商品介绍
	private int price;//商品价格
	public int getStuffid() {
		return stuffid;
	}
	public void setStuffid(int stuffid) {
		this.stuffid = stuffid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStuffimg() {
		return stuffimg;
	}
	public void setStuffimg(String stuffimg) {
		this.stuffimg = stuffimg;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
