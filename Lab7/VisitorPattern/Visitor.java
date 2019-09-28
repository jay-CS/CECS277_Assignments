package Visitor;

public interface Visitor {
	void visit(Computer computer);
	void visit(Phones phone);
	void visit(Consoles console);
}
