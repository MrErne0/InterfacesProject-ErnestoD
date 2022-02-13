
public class testCalculos {
	public static void main(String[] args) {
			Triangulo t1 = new Triangulo("triángulo", 10, 20, 10, 10, 10);
			Triangulo t2 = new Triangulo("triángulo", 15, 25, 15, 15, 15);
			Cuadrado c1 = new Cuadrado("cuadrado 1", 25);
			Rectangulo r1 = new Rectangulo("rectángulo 1",25, 15);
			Rombo ro1 = new Rombo("rombo 1",10,5,5);
			Romboide rom1 = new Romboide("romboide 1", 20,10);
			Trapecio tra1 = new Trapecio("trapecio 1", 10, 8, 5, 2 ,2);
			
			Calculos.calc(t1);
			Calculos.calc(t2);			
			Calculos.calc(c1);			
			Calculos.calc(r1);
			Calculos.calc(ro1);
			Calculos.calc(rom1);
			Calculos.calc(tra1);

	}//main
} // class testCalculos
