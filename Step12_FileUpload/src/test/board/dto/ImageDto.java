package test.board.dto;

public class ImageDto {
	//맴버필드
	private int num;
	private String name;
	private String imgSrc;
	private String regdate;
	//디폴트 생성자
	public ImageDto(){}
	public ImageDto(int num, String name, String imgSrc, String regdate) {
		super();
		this.num = num;
		this.name = name;
		this.imgSrc = imgSrc;
		this.regdate = regdate;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImgSrc() {
		return imgSrc;
	}
	public void setImgSrc(String imgSrc) {
		this.imgSrc = imgSrc;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	
	
}
