class Frog{
	private String name;
	private int age;
	private String color;
	private String sound;
	
	public void setName(String name){
	this.name  = name;
	}
	
	public void setColor(String color){
		this.color = color;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public void setSound(String sound){
		this.sound = sound;
	}
	
	public String getName(){
		return name;
	}
	
	public String getSound(){
		return sound;
	}
	
	public String getColor(){
		return color;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setInfo(String name,int age){
		setName(name);
		setAge(age);		
	}
	
	public void makeSound(String sound, String color){
		setSound(sound);
		setColor(color);
	}
}

public class App {
	public static void main(String[] args){
		
		Frog frog1 = new Frog();
		frog1.setName("Zabac");
		frog1.setAge(1);
		
		Frog frog2 = new Frog();	   
	    frog2.makeSound("krekrekre", "zelena");
		
		System.out.println(frog1.getName());
		System.out.printf(frog2.getSound() + frog2.getColor());
	    
	   
	}

}
