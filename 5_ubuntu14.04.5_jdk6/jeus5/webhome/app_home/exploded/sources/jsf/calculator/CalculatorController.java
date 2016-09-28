package jsf.calculator;

public class CalculatorController {
	
	private int fristNumber;
	private int secondNumber;
	private int result;
	
	public int getFristNumber() {
		return fristNumber;
	}
	public void setFristNumber(int fristNumber) {
		this.fristNumber = fristNumber;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public int getSecondNumber() {
		return secondNumber;
	}
	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}
	
	public String add(){
		result = this.fristNumber + this.secondNumber;
		return "success";
	}
	
	public String multiply(){
		result = this.fristNumber * this.secondNumber;
		return "success";
	}
	
	
	

}
