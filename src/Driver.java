
public class Driver {

	public static void main(String[] args){
		HexNumber numOne = new HexNumber("7");
		HexNumber numTwo = new HexNumber("FFFFFFFFFFFFFFF6");
		HexNumber numThree = new HexNumber(10);
		HexNumber numFour = new HexNumber(-10);
		
		System.out.println("Num One : Hex Value = " + numOne.getHexValue() + " Decimal Value : " + numOne.getDecimalValue());
		System.out.println("Num two : Hex Value = " + numTwo.getHexValue() + " Decimal Value : " + numTwo.getDecimalValue());
		System.out.println("Num three : Hex Value = " + numThree.getHexValue() + " Decimal Value : " + numThree.getDecimalValue());
		System.out.println("Num four : Hex Value = " + numFour.getHexValue() + " Decimal Value : " + numFour.getDecimalValue());
		numOne.add(numTwo);
		System.out.println("Num one + Num two = " + numOne.getDecimalValue() + " , "  + numOne.getHexValue());

		
		
	}	
}
