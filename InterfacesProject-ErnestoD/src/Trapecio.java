
public class Trapecio implements FiguraGeometrica{
	private String nombre;
	private float baseMayor;
	private float baseMenor;
	private float altura;
	private float lado1;
	private float lado2;
	public Trapecio(String nombre, float baseMayor, float baseMenor, float altura, float lado1, float lado2) {
		super();
		this.nombre = nombre;
		this.baseMayor = baseMayor;
		this.baseMenor = baseMenor;
		this.altura = altura;
		this.lado1 = lado1;
		this.lado2 = lado2;
	}//constructor
	public String getNombre() {
		return nombre;
	}//getNombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}//setNombre
	public float getBaseMayor() {
		return baseMayor;
	}//getBaseMayor
	public void setBaseMayor(float baseMayor) {
		this.baseMayor = baseMayor;
	}//setBaseMayor
	public float getBaseMenor() {
		return baseMenor;
	}//getBaseMenor
	public void setBaseMenor(float baseMenor) {
		this.baseMenor = baseMenor;
	}//setBaseMenor
	public float getAltura() {
		return altura;
	}//getAltura
	public void setAltura(float altura) {
		this.altura = altura;
	}//setAltura
	public float getLado1() {
		return lado1;
	}//getLado1
	public void setLado1(float lado1) {
		this.lado1 = lado1;
	}//setLado1
	public float getLado2() {
		return lado2;
	}//getLado2
	public void setLado2(float lado2) {
		this.lado2 = lado2;
	}//setLado2
	
	@Override
	public float area() {
		
		return ((getBaseMayor()+getBaseMenor())*getAltura())/2;
	}//area
	@Override
	public float perimetro() {
		
		return getBaseMayor() + getBaseMenor() + getLado1() + getLado2();
	}//perimetro
	
	
}//class Trapecio
