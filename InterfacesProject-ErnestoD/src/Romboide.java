
public class Romboide implements FiguraGeometrica{
	private String nombre;
	private float base;
	private float altura;
	public Romboide(String nombre, float base, float altura) {
		super();
		this.nombre = nombre;
		this.base = base;
		this.altura = altura;
	}//constructor
	public String getNombre() {
		return nombre;
	}//getNombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}//setNombre
	public float getBase() {
		return base;
	}//getBase
	public void setBase(float base) {
		this.base = base;
	}//setBase
	public float getAltura() {
		return altura;
	}//getAltura
	public void setAltura(float altura) {
		this.altura = altura;
	}//setAltura
	@Override
	public float area() {
		
		return getBase()*getAltura();
	}//getArea
	@Override
	public float perimetro() {
		
		return (2*getBase())+(2*getAltura());
	}//getPerimetro
	
}//class romboide
