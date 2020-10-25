package javaassignmnet2;

public class Book {
	
	String name;
	Author author;
	Double price;
	int Qty;

	Book(String name,Author author,Double price, int Qty) {

		// TODO Auto-generated constructor stub
	    this.name=name;
		this.author=author;
		this.price= price;
		this.Qty=Qty;
	}
	
	public String getName()
	{
		return name;
		
	}
	public Author getAuthor()
	{
		return author;
	}
	public Double getPrice()
	{
		return price;
	}
	public int getQty()
	{
		return Qty;
	}
	
	void Dis()
	{
		System.out.println("Author name:" +author.getName());
		
		System.out.println("Author emaile:" +author.getEmail());
		System.out.println("Author gender:" +author.getGender());
		
	}



}
