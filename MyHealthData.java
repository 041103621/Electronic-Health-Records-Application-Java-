/**
File name: MyHealthData.java
@author Liu Siqian, 041103621
Course: CST8284
Assignment: Assign01
Date: Feb 18, 2024
Professor: Zeinab Bayati
Purpose: This class model patient health data at the first visit.
*/
public class MyHealthData extends MyHealthDataBase
{
/**
 * define 7 essential attributes to collect a patient health data
 */
	private String firstName;
    private String lastName;
	private String gender;
	private int birthYear;
	private int currentYear;
	private double height;
	private double weight;

/**
 * the constructor pass the 7 parameters to instance variables
 * @param firstName patient's first name
 * @param lastName patient's last name
 * @param gender patient's gender
 * @param height patient's height
 * @param weight patient's weight
 * @param birthYear patient's birthYear
 * @param currentYear patient's currentYear
 */
	public MyHealthData(String firstName, String lastName, String gender, 
			            double height, double weight, int birthYear, int currentYear) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
		this.birthYear = birthYear;
		this.currentYear = currentYear;
		
	}

/**
 * get first name of patient
 * @return firstName the first name of patient
 */
     public String getFirstName() {
    	 return firstName;
     }
/**
 * set first name of patient
 * @param firstName pass first name to the setter
 */    
     public void setFirstName(String firstName) {
    	 this.firstName = firstName;
     }

     /**
      * get last name of patient
      * @return lastName the last name of patient
      */
          public String getLastName() {
         	 return lastName;
          }
     /**
      * set first name of patient
      * @param lastName pass last name to the setter
      */    
          public void setLastName(String lastname) {
         	 this.lastName = lastname;
          }
     /**
      * get gender of patient
      * @return gender patient's gender
      */
     public String getGender() {
    	 return gender;
     }
     /**
      * set gender of patient
      * @param gender patient's gender
      */
 	public void setGender(String gender) {
		this.gender = gender;
	}

    /**
     * get birth year of patient
     * @return patient's birth year
     */
 	public int getBirthYear() {
		return birthYear;
	}

   /**
    * set birth year of patient
    * @param birthYear patient's birth year
    */

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

   /**
    * get current year
    * @return CurrentYear the current year
    */
	public int getCurrentYear() {
		return currentYear;
	}

   /**
    * set current year
    * @param currentYear the current year
    */
	public void setCurrentYear(int currentYear) {
		this.currentYear = currentYear;
	}


   /**
    * get height of patient
    * @return height the patient's height
    */
	public double getHeight() {
		return height;
	}


   /**
    * set height of patient
    * @param height the patient's height
    */
	public void setHeight(double height) {
		this.height = height;
	}


   /**
    * get weight of patient
    * @return weight the patient's weight
    */
	public double getWeight() {
		return weight;
	}


    /**
     * set weight of patient
     * @param weight the patient's weight
     */
	public void setWeight(double weight) {
		this.weight = weight;
	}

    /**
     * calculate patient's age
     * @return age the patient's age
     */
    public int getAge() {
    	int age;
    	age = currentYear - birthYear;
    	return age;
    }
    
    /**
     * calculate maximum heart rate of a patient
     * @return maxHeartRate the value of maximum heart rate
     */
    public int getMaximumHeartRate() {
    	int maxHeartRate;
    	maxHeartRate = 220 - getAge();
    	return maxHeartRate;
    }
    
    /**
     * calculate maximum target heart rate
     * @return maxTargetHeartRate the value of maximum target heart
     */
    public double getMaximumTargetHeartRate() {
    	double maxTargetHeartRate;
    	maxTargetHeartRate = 0.85 * getMaximumHeartRate();
    	return maxTargetHeartRate;
    }
    
    /**
     * calculate minimum target heart rate
     * @return minTargetHeartRate the value of minimum target heart
     */
    public double getMinimumTargetHeartRate() {
    	double minTargetHeartRate;
    	minTargetHeartRate = 0.5 * getMaximumHeartRate();
    	return minTargetHeartRate;
    }
    
    /**
     * call method calculateBMI from superclass to get body mass index(BMI) 
     * @return BMI the value of BMI
     */
    public double getBMI() {
    	double BMI = calculateBMI(weight, height);
    	return BMI;
    	
    }
    
   /**
    * the method reports a patient's essential information and calculated health data
    */
    public void displayMyHealthData() 
    { 

       System.out.println("\n ------This is report of your health data------");
       
       System.out.println("First Name: " + getFirstName());
       System.out.println("Last Name: " + getLastName());
       System.out.println("Gender: " + getGender());
       System.out.println("Date of Birth: " + getBirthYear());
       System.out.println("Height(m): " + getHeight());
       System.out.println("Weight(kg): " + getWeight());
       
       System.out.println("Age: " + getAge());
       System.out.println("MaximumHeartRate: " + getMaximumHeartRate());
       System.out.println("MinimumTargetHeartRate: " + getMinimumTargetHeartRate());
       System.out.println("MaximumTargetHeartRate: " + getMaximumTargetHeartRate());
       System.out.printf("Body Mass Index (BMI): %.2f \n", getBMI());

       System.out.println("BMI VALUES");
       System.out.println("Underweight: less than 18.5");
       System.out.println("Normal:      between 18.5 and 24.9");
       System.out.println("Overweight:  between 25 and 29.9");
       System.out.println("Obese:       30 or greater");   
    } 

}