package Assignments;

//WAP to declare a Global variable
public class Assignment35 {
	
    static String globalVar = "Global variable!";
    int nonStaticVar = 42;

    public void displayGlobalVariables() {
    	
        System.out.println(globalVar);
        System.out.println(nonStaticVar);
    }
    
    public static void main(String[] args) {
    	
        System.out.println(globalVar);

        Assignment35 as = new Assignment35();
        System.out.println(as.nonStaticVar);
        
        as.displayGlobalVariables();
    }

   
}
