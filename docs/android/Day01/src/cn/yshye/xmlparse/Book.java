package cn.yshye.xmlparse;

/**
 * @author Administrator
 *
 */
public class Book {
	private String category;
	private String titleLang;
	private String title;
	private String author;
	private String year;
	private String price;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getTitleLang() {
		return titleLang;
	}

	public void setTitleLang(String titleLang) {
		this.titleLang = titleLang;
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

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [category=" + category + ", titleLang=" + titleLang + ", title=" + title + ", author=" + author
				+ ", year=" + year + ", price=" + price + "]";
	}

}
