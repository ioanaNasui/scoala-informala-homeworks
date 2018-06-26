//Implement an arithmetic calculator using the switch statement.
public class Calculator {
	public static void main(String... args){
        System.out.println("Please write the arithmetic operator (+, -, *, /): ");
        String arithOper= System.console().readLine();
        if (arithOper.equalsIgnoreCase("+")||arithOper.equalsIgnoreCase("-")||arithOper.equalsIgnoreCase("*")||arithOper.equalsIgnoreCase("/")){ 
            System.out.println("Please write the first number: ");
            Double a = Double.parseDouble(System.console().readLine());
            System.out.println("Please write the second number: ");
            Double b = Double.parseDouble(System.console().readLine()); 
            Double result=0.0;
            switch(arithOper) {
                case "+": 
                    result=a+b;
                    System.out.println(a+" + "+b+" is "+result);
                    break;
                case "-": 
                    result=a-b;
                    System.out.println(a+" - "+b+" is "+result);
                    break;
                case "*": 
                    result=a*b;
                    System.out.println(a+" * "+b+" is "+result);
                    break;
                case "/":
                    if (b==0){
                        System.out.println("Error: Division by zero is not possible");
                    }
                    result=a/b;
                    System.out.println(a+" / "+b+" is "+result);
                    break;
            } 
        }
        else {
                System.out.println("Error: The arithmetic operator that was written is not correct");
            }       
    }
}
