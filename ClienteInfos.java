package POO;

public class ClienteInfos {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente ("Jo�o"," RedBull","solteiro");
		System.out.printf("O clinte tem nome , prefer�ncia e est� \n");
		System.out.println(cliente1.getInfos());
	}

}
