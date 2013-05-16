package Rapoarte2;

public class ButtonC{  //update un arrayList eventual
  
	
	private String resultLine;

	public void createLine(String ora, String pos1, String pos2){
		String POS1 = pos1;
		String POS2 = pos2;
		double pos1d = Double.parseDouble(POS1);
		double pos2d = Double.parseDouble(POS2);
	
		CalculatorUtil cu = new CalculatorUtil();
		cu.calculate(pos1d, pos2d);
		
		String line1 = "La ora: "+ ora +"   raportul POS1 este: "+ pos1d + 
				"    raportul POS2 este: " + pos2d;
		String line2 = "  Suma rapoarte: "+cu.getCalculate();
		
		resultLine = line1 + "\n"+line2;
		}
	public String getLine(){
		return resultLine;
	}
	
}
	//la listener un apel static catre CalculatorUtil

