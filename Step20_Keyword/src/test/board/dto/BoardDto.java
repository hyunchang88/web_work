package test.board.dto;

public class BoardDto {
	private int num; // 글 번호
	private String writer; // 작성자
	private String title; // 제목
	private String content; // 글내용
	private String regdate; // 작성일
	
	private int startRowNum; // 시작 row 번호
	private int endRowNum; // 끝 row 번호
	private int prevNum; // 이전글의 글 번호
	private int nextNum; // 다음글의 글 번호
	
	public BoardDto(){}

	public BoardDto(int num, String writer, String title, String content, String regdate, int startRowNum,
			int endRowNum, int prevNum, int nextNum) {
		super();
		this.num = num;
		this.writer = writer;
		this.title = title;
		this.content = content;
		this.regdate = regdate;
		this.startRowNum = startRowNum;
		this.endRowNum = endRowNum;
		this.prevNum = prevNum;
		this.nextNum = nextNum;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public int getStartRowNum() {
		return startRowNum;
	}

	public void setStartRowNum(int startRowNum) {
		this.startRowNum = startRowNum;
	}

	public int getEndRowNum() {
		return endRowNum;
	}

	public void setEndRowNum(int endRowNum) {
		this.endRowNum = endRowNum;
	}

	public int getPrevNum() {
		return prevNum;
	}

	public void setPrevNum(int prevNum) {
		this.prevNum = prevNum;
	}

	public int getNextNum() {
		return nextNum;
	}

	public void setNextNum(int nextNum) {
		this.nextNum = nextNum;
	}

	
	
}
