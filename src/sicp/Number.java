package sicp;

public class Number extends Expression {

	private long value;
	@Override
	public void parse(String str) {
		this.value = Integer.parseInt(str);
		this.type  = EXPR_TYPE.NUMBER;
	}

	@Override
	public Expression eval() {
		return this;
	}

}
