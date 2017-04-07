import java.util.Scanner;

public class Ler {

	float num, aux;
	String comando;
	private Scanner s; 

	Controle c;
	Drone dr;
	Ler() {}
	
	public float lerVelVertical(float aux) {
		System.out.println ("\nDigite velocidade vertical inical: ");
		s = new Scanner(System.in);
		num = s.nextInt();
		aux = num;
	if (aux > 10) {
			System.out.println("Velocidade Vertical Maxima Excedida\n"
					+ "Valor maximo permitido é 10 m/s\n");
			return lerVelVertical(aux); }
			
			else { 
				dr.velVertical = aux;}
			return 0;
	}

	public float lerVelHorizontal (float num) {
		s = new Scanner(System.in);
		num = s.nextInt();
		aux = num;
	if(num > 10) {
		System.out.println("Valocidade Horizontal Max Excedida\n" +
				"Valor maximo permitido é 10 m/s\n");
		return lerVelHorizontal(num); }
	else {
		 num = aux;}
	return 0;
	}

}