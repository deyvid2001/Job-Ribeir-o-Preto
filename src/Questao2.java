
public class Questao2 {

	public static void main(String[] args) {
		
		///numeros usados para fazer o calculo
		int num1 = 0, num2 = 1;
		
		///alterando o valor de i você pode limitar ou estender a busca
		for(int i = 0; i < 1000; i++) {
			
			///numero informado pelo usuario para a verificação
			int usuario = 34;
			num1 = num1 + num2;
			num2 = num1 - num2;
			
			if(usuario == num1) {
				System.out.println("Opa! Esse número pertence a sequencia!");
				return;
			}
			
		}
		System.out.println("Esse numero não pertence a sequencia!");
}
}