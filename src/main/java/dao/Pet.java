package dao;

public class Pet {
	private String name;
	private String amount;
	private String type;
	private String comment;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Pet(String name, String amount, String type, String comment) {
		super();
		this.name = name;
		this.amount = amount;
		this.type = type;
		this.comment = comment;
	}
	public Pet() {
		super();
	}
	
}
