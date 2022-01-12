package Assignment;

class Car {
	
    String carName;
    String carType;

    // assign values using constructor
    public Car(String name, String type) {
        this.carName = name;
        this.carType = type;
    }
    
    
    // private method
    private String getCarName() {
        return this.carName;
    }

void vechile()
{
    class Engine {
        String engineType;
        
        void setEngine() {

           // Accessing the carType property of Car
            if(carType.equals("4WD")){

                // Invoking method getCarName() of Car
                if(getCarName().equals("Crysler")) {
                    engineType = "Smaller";
                } else {
                   engineType = "Bigger";
                }

            }else{
               engineType = "Bigger";
            }
        }
        
        String getEngineType(){
            return engineType;
        }
    }
    Engine e=new Engine();
}

}
public class complexinnerclass 
{

	public static void main(String[] args)
	{
		
		
	}
}
