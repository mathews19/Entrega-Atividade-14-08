package POO;

public class ClienteInfos {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente ("João"," RedBull","solteiro");
		System.out.printf("O clinte tem nome , preferência e está \n");
		System.out.println(cliente1.getInfos());
	}

}
