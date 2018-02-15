package sicp;

public abstract class Expression {
	protected EXPR_TYPE type;
	
	public Expression() {
		this.type = EXPR_TYPE.NUMBER;
	}
	
	public abstract void parse(String str);
	public abstract Expression eval();
}
