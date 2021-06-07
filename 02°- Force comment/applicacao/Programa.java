package applicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entidade.Comment;
import entidade.Post;

public class Programa {

	public static void main(String[] args) throws ParseException {// delcarada o Throws após o uso do new Post(acrescenta em sugestões);
		
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Comment c1= new Comment("Have a Nice trip"+"\n");
		Comment c2= new Comment ("Wow that's awesome");
		Post p1= new Post(
				sdf.parse("21/06/2018 13:05:44"),//Date (moment),
				"Traveling to new Zeland", //String (Title),
				"I'm going to visit this wonderful country!",//String (content),
				12);//like;
		
		p1.addComment(c1);
		p1.addComment(c2);
		 
		Comment c3= new Comment ("Good Night!!"+"\n");
		Comment c4= new Comment ("May the force be with you");
		Post p2= new Post(sdf.parse("28/07/2018 23:14:19"),
				"Good night guys",
				"See you Tomorrow",
				5);
		p2.addComment(c3);
		p2.addComment(c4);
		
		System.out.println(p1);
		System.out.println("-----------------------------");
		System.out.println(p2);

	}}
