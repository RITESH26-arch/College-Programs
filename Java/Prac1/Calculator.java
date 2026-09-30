import java.util.Scanner;
class Calculator{

	static int Add(int num1,int num2){
		int sum = num1 + num2;
		return sum;
		}

	static int Subtract(int num1,int num2){
		int Sub = num1 - num2;
		return Sub;
		}

	static int Mult(int num1,int num2){
		int prod = num1 * num2;
		return prod;
		}

	static double Div(double num1,double num2){
		double Ans = num1 / num2;
		return Ans;
		}

	public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			int choice,num1,num2,sum,sub,prod; double Ans;
			
			System.out.println("\nEnter the First number => ");
			num1 = sc.nextInt();
			System.out.println("\nEnter the Secont number => ");
			num2 = sc.nextInt();

			System.out.println("\nEnter the choice\n1.Addition\n2.Subtract\n3.Multiplication\n4.Division\n5.Break");
			choice = sc.nextInt();
				switch(choice){
						case 1 : {sum = Add(num1,num2);
							System.out.println("Sum => " + sum);
							break;}
						case 2 : {sub = Subtract(num1,num2);
							System.out.println("Sub => " + sub);
							break;}
						case 3 : {prod = Mult(num1,num2);
							System.out.println("Product => " + prod);
							break;}		
						case 4 : {Ans = Div(num1,num2);
							System.out.println("Ans => " + Ans);
							break;}
						case 5 : break;
						} 
					}
		}


	

