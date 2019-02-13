package lexer;

//A class for real numbers (float)
public class Realnum extends token {
	
	public final float value;
	
	public Realnum(float value) {
		super(Tag.REALNUM);
		this.value = value;
	}
}