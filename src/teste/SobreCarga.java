package teste;

public class SobreCarga {
	public static void exibirMensagem(){
		System.out.println("Ola Mundo");
	}
	public static String exibirMensagem(String nome){
		return "Ola Mundo " + nome;
	}
	public static String exibirMensagem(String nome, int idade){
		return "Ola Mundo " + nome + " " + idade;
	}
	public static int encontrarMaior(int[] numeros){
		int maior = numeros[0];
		for(int i = 1; i < numeros.length; i++){
			if(numeros[i] > maior){
				maior = numeros[i];
			}
		}
		return maior;
	}
	public static int encontrarMenor(int[] numeros){
		int menor = numeros[0];
		for(int i = 1; i < numeros.length; i++){
			if(numeros[i] < menor){
				menor = numeros[i];
			}
		}
		return menor;
	}



	public static void main(String[] args) {
		exibirMensagem();
		String exibir = exibirMensagem("Ricardo");
		System.out.println(exibir);
		String exibir2 = exibirMensagem("Ricardo", 20);

		int[] numeros1 = {2,3,4,66,77,92,22,20,10};
		int maior = encontrarMaior(numeros1);
		System.out.println(maior);
		int menor = encontrarMenor(numeros1);
		System.out.println(menor);

	}
}
