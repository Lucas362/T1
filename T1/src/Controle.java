
public class Controle {

	int controleAutonomiaBateria;
	int alcance;

	Drone d;
	
	Controle() {}
	
	public float aumentarVelVertical () {
		return d.aumentarVelVertical(); }
	
	public float aumentarVelHorizontal() {
		return d.aumentarVelHorizontal();
	}
	
	public float diminuirVelVertical () {
		return d.diminuirVelVertical();
	}
	
	public float diminuirVelHorizontal () {
		return d.diminuirVelHorizontal();
	}
	
	public void iniciarCamera () {
		System.out.println("\nCamera Ativada\n"); }
	
	public void interromperCamera () {
		System.out.println("\nCamera desligada\n"); }

}
