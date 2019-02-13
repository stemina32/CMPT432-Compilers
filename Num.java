package lexer;

//Num is also a token and needs a value
public class Num extends Token {

//Gets value from the lexer
	public final int value;
	
//Needs a TAG for each number
	public Num(int value) {
		super(Tag.NUM);
		this.value = value;
	}
}