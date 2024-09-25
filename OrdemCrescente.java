import java.util.Scanner;

public class OrdemCrescente {

	public static void main(String[] args) {
		//entrada
		
		
		int A, B, C, maior, meio, menor;
		
		Scanner sc = new Scanner (System.in);
		

	System.out.println("Digite o valor de A: " );
	A = sc.nextInt();
	System.out.println("Digite o valor de B: " );
	B = sc.nextInt();
	System.out.println("Digite o valor de C: ");
	C= sc.nextInt();
	
	if (A<=B && A<=C) {
		menor= A;
		if (B<=C) {
			meio=B;
			maior=C;
		}else {
			meio = C;
			maior=B;
		}
	}else if (B<=A && B<=C) {
		menor=B;
		if(A<=C) {
			meio= A;
			maior=C;
		}else {
			meio=C;
			maior=A;
		}
		}else {
			menor=C;
			if(A<=B) {
				meio= A;
				maior=B;
			}else {
				meio=B;
				maior=A;
		}
		
	}
	System.out.println("Valores em ordem crescente");
	System.out.println(menor);
	System.out.println(meio);
	System.out.println(maior);
	
	
	
	}
	
		
		

	}
