
public class Questao5 {

	public static void main(String[] args) {
		String palavra = "Voce foi contratado!";
		int i = 0;
		int b = palavra.length();
		
		for(i=b-1;i<=b;i--) {
			System.out.println(palavra.charAt(i) + " ");
			if (i==0) {
				System.out.println("Palavra invertida com sucesso!");
				return;
			}
		}
}
}