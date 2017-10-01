public class TemperatureConversion {

	public static void main(String args[]) {
       	
       //accept temperature in farenheit from user
	   double farenheit = Double.parseDouble(args[0]);

	   TemperatureConversion temp = new TemperatureConversion();
	   temp.calculate(farenheit);
	}
	
	//Conversion of the temperature
	void calculate(double mTemperatureFarenheit) {
       
       //mTemperatureConverted is used to calculate converted temperature
	   double mTemperatureConverted;
       
       //formula for temperature conversion from farenheit to celcius
       mTemperatureConverted = ((mTemperatureFarenheit - 32) / 1.8);

       //Displaying converted Temperature
	   System.out.println("temperature in celcius is " + mTemperatureConverted);
	}
}
