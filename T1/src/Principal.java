
public class Principal {
	public static void main (String args[]) {
		
		Drone drone1, drone2, drone3, drone4;
		
		drone1 = new Drone("Hubsan", "X4 mini", 4, "SD", 10, 10, 15, 150);
		drone2 = new Drone ("Hubsan","H501S X4 FPV", 4, "HD", 12, 12, 20, 1000);
		drone3 = new Drone ("DJI", "Mavic Pro", 4, "UHD", 16, 16, 27, 13000);
		drone4 = new Drone ("DJI", "Spreading Wings", 8, "SUHD", 16, 16, 15, 130000);
		
		System.out.println("\n>>>INFORMÇÕES SOBRE OS DRONES<<<\n");
		System.out.println("\nINFORMAÇÕES DRONE 1 " +
				"\nMarca: " +drone1.marca +
				"\nModelo: " +drone1.modelo +
				"\nNumero de Helices: " +drone1.numHelices +
				"\nTipo de camera: " +drone1.camera +
				"\nVelocidade Vertical Maxima: " +drone1.velVertical + " m/s" +
				"\nVelocidade Horizontal Maxima: " +drone1.velHorizontal + " m/s" +
				"\nDuração de Bateria: " +drone1.autonomiaBateria + " minutos" + 
				"\nDistancia máxima: " +drone1.distMax + " metros");
		
		System.out.println("\nINFORMAÇÕES DRONE 2 " +
				"\nMarca: " +drone1.marca +
				"\nModelo: " +drone2.modelo +
				"\nNumero de Helices: " +drone2.numHelices +
				"\nTipo de camera: " +drone2.camera +
				"\nVelocidade Vertical Maxima: " +drone2.velVertical + " m/s" +
				"\nVelocidade Horizontal Maxima: " +drone2.velHorizontal + " m/s" +
				"\nDuração de Bateria: " +drone2.autonomiaBateria + " minutos" + 
				"\nDistancia máxima: " +drone2.distMax + " metros");
		
		System.out.println("\nINFORMAÇÕES DRONE 3 " +
				"\nMarca: " +drone3.marca +
				"\nModelo: " +drone3.modelo +
				"\nNumero de Helices: " +drone3.numHelices +
				"\nTipo de camera: " +drone3.camera +
				"\nVelocidade Vertical Maxima: " +drone3.velVertical + " m/s" +
				"\nVelocidade Horizontal Maxima: " +drone3.velHorizontal + " m/s" +
				"\nDuração de Bateria: " +drone3.autonomiaBateria + " minutos" + 
				"\nDistancia máxima: " +drone3.distMax + " metros");
		
		System.out.println("\nINFORMAÇÕES DRONE 4 " +
				"\nMarca: " +drone4.marca +
				"\nModelo: " +drone4.modelo +
				"\nNumero de Helices: " +drone4.numHelices +
				"\nTipo de camera: " +drone4.camera +
				"\nVelocidade Vertical Maxima: " +drone4.velVertical + " m/s" +
				"\nVelocidade Horizontal Maxima: " +drone4.velHorizontal + " m/s" +
				"\nDuração de Bateria: " +drone4.autonomiaBateria + " minutos" + 
				"\nDistancia máxima: " +drone4.distMax + " metros");
	
		System.out.println("\n >>>Controle 1 funciona com Drone 1<<< \n");
		Controle c1 = new Controle();
		
		c1.controleAutonomiaBateria = 60;
		c1.alcance = 200;
		c1.d = drone1;
		
		System.out.println("Autonomia bateria controle: " + c1.controleAutonomiaBateria + " minutos"+
				"\nAlcance do Controle: " +c1.alcance + " metros");
		
		Ler ler = new Ler();
		ler.c = c1;
		ler.dr = drone1;
		
		ler.lerVelVertical(drone1.velVertical);
		
		System.out.println("Velocidade Inicial: " + drone1.velVertical + " m/s");
	}
	
	
}