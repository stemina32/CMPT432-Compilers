package lexer;

//Keyword is a token so it extends token
public class Keyword extends token {
	
//Keyword needs to have a value. Lexeme as a string.
  public final String lexeme;

  public Keyword(String lexeme, int tag) {
	  	super(tag)
	  	this.lexeme = lexeme;
  }
  
//AND keyword with lexeme && and a tag
  public static final Keyword AND = new Keyword("&&", Tag.AND)
}