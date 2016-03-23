
abstract class Animal {
	abstract public void fazBarulho();	

}

class Outra{
	
	public void m(Animal a){
		a.fazBarulho();
	}
	
}

class Main{
	public static void main(String [] args){
		Outra o = new Outra();
	
	o.m(new Animal(){
		
		public void fazBarulho(){
			System.out.println("Miau");
		}	
	
	});
	
}
}
