package practice;

import java.time.LocalDate;

public class Task {
	private LocalDate date ;
	private String content ;
	
	//コンストラクタ
	public Task(LocalDate date, String content) {
		this.date = date;
		this.content = content;
	}
	
	
	public LocalDate getDate() {
		return this.date;
	}
	public String getContent() {
		return this.content;
	}
	
	//mainメソッドの出力表示
	@Override
	public String toString() {
		return this.date + "：" + this.content;
	}
}
