
public class Drone {
	String marca;
	String modelo;
	int numHelices;
	String camera;
	float velVertical;
	float velHorizontal;
	int autonomiaBateria;
	int distMax;
	
	Drone () {}
	
	Drone (String m, String mo, int nh, String c, float vv, float vh, int bat, int d) {
		marca = m;
		modelo = mo;
		numHelices = nh;
		camera = c;
		velVertical = vv;
		velHorizontal = vh;
		autonomiaBateria = bat;
		distMax = d;
	
	}
	
	
	public float aumentarVelVertical () {
		return velVertical = velVertical+1; }
	
	public float diminuirVelVertical () {
		return velVertical = velVertical-1  ; }
	
	public float aumentarVelHorizontal () {
		return velHorizontal = velHorizontal+1; }
	
	public float diminuirVelHorizontal () {
		return velHorizontal = velHorizontal-1; }
	
	public float metadeVelHorizontal () {
		if (autonomiaBateria <= 5) 
		{ velHorizontal = (float) (velHorizontal*0.5); }
		return  velHorizontal;
	}
	
	public float metadeVelVertical () {
		if (autonomiaBateria <= 5) 
		{ velVertical = (float) (velVertical*0.5); }
		return  velVertical;
	}
	
	
}