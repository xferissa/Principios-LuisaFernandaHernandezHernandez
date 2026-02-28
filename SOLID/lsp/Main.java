class Main{
	public static void main(String[] args){
		
		Figura f1 = new Rectangulo(5,10);
		Figura f2 = new Cuadrado(5);

		System.out.println("Area Rectangulo: "+f1.getArea()+"\nArea Cuadrado: "+f2.getArea());
	}
}
