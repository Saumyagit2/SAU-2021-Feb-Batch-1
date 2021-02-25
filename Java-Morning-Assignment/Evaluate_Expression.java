package com.assignment;
import java.util.*;
public class Evaluate_Expression{

		public static int Evaluate(String s)
	    {
	        char[] ch = s.toCharArray();        
	        int len = ch.length;
	         
	        Stack<Integer> operand = new Stack<Integer>(); 
	        Stack<Character> operator = new Stack<Character>(); 
	          
	        for (int i = 0; i < len; i++) 
	        { 
	            if ((ch[i] == '+' || ch[i] == '-') && (i==0 || ch[i-1]=='+' || ch[i-1]=='-'))
	            operand.push(0);
	            if(ch[i]>='0' && ch[i]<='9'){ 
	                StringBuilder build=new StringBuilder();
	                while (i < len && ch[i] >= '0' && ch[i] <= '9') 
	                    build.append(ch[i++]);
	                    i--; 
	                operand.push(Integer.parseInt(build.toString())); 
	            }         
	            else if (ch[i] == '('){
	                   operator.push(ch[i]); 
	            }                  
	            else if (ch[i] == ')'){ 
	                while (operator.peek() != '(') 
	                  operand.push(putSign(operator.pop(), operand.pop(), operand.pop())); 
	                operator.pop(); 
	            } 
	            else if (ch[i] == '+' || ch[i] == '-' || ch[i] == '*' || ch[i] == '/' || ch[i]=='%'){ 
	                while (!operator.isEmpty() && Precedence(ch[i], operator.peek())) 
	                 operand.push(putSign(operator.pop(), operand.pop(), operand.pop())); 
	                operator.push(ch[i]); 
	            } 
	        }        
	        while (!operator.isEmpty()){
	                operand.push(putSign(operator.pop(), operand.pop(), operand.pop())); 
	        }        
	        return operand.pop(); 
	    }
		
	    public static boolean Precedence(char op1, char op2){ 
	        if (op2 == '(' || op2 == ')') 
	            return false; 
	        if ((op1 == '%' || op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-')) 
	            return false; 
	        else
	            return true; 
	    } 
	    
	    public static int putSign(char op, int b, int a) { 
	        switch (op) 
	        { 
	        case '+': 
	            return a + b; 
	        case '-': 
	            return a - b; 
	        case '*': 
	            return a * b; 
	        case '/': 
	            if (b == 0) 
	                throw new UnsupportedOperationException("Cannot divide by zero"); 
	            return a / b; 
	        case '%':  
	        	if (b == 0) 
	                throw new UnsupportedOperationException("Cannot mod by zero"); 
	            return a%b;
	        
	        } 
	        return 0; 
	    } 
	    public static void main(String []args){
	    	Scanner sc = new Scanner(System.in);
	          
	        System.out.println("Enter the number of input expressions: ");
	        int n = sc.nextInt();
	        sc.nextLine();
	        for (int i = 0; i < n; i++) {
	            System.out.println("Enter the expression:");
	            String eval = sc.nextLine();
	            System.out.println("Result : "+Evaluate_Expression.Evaluate(eval));
	           
	        }      
	    }
	}

