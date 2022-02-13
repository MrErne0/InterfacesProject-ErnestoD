
public class Rombo implements FiguraGeometrica{
	private float diagonalMayor;
	private float diagonalMenor;
	private float lado;
	private String nombre;
	
	public Rombo(String nombre, float diagonalMayor, float diagonalMenor, float lado) {
		super();
		this.diagonalMayor = diagonalMayor;
		this.diagonalMenor = diagonalMenor;
		this.lado = lado;
		this.nombre = nombre;
	}//constructor

	public float getDiagonalMayor() {
		return diagonalMayor;
	}//getDiagonalMayor

	public void setDiagonalMayor(float diagonalMayor) {
		this.diagonalMayor = diagonalMayor;
	}//setDiagonalMayor

	public float getDiagonalMenor() {
		return diagonalMenor;
	}//getDiagonalMenor

	public void setDiagonalMenor(float diagonalMenor) {
		this.diagonalMenor = diagonalMenor;
	}//setDiagonalMenor

	public float getLado() {
		return lado;
	}//getLado

	public void setLado(float lado) {
		this.lado = lado;
	}//setLado

	public String getNombre() {
		return nombre;
	}//getNombre

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}//setNombre

	@Override
	public float area() {
		return (getDiagonalMayor() *getDiagonalMenor()/2);
	}// area

	@Override
	public float perimetro() {
		return (getLado()*4);
	}//perimetro
	
}//class Rombo
