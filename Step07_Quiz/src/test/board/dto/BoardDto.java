package test.board.dto;

public class BoardDto {
	private int num; // 책 번호
	private String title; // 책 제목
	private String author; // 저자
	private String publisher; // 출판사
	private String regdate; // 작성일
	
	// 디폴트 생성자
	public BoardDto(){}

	public BoardDto(int num, String title, String author, String publicher, String regdate) {
		super();
		this.num = num;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.regdate = regdate;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	

}
