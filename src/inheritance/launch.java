package inheritance;

public class launch 
{

	public static void main(String[] args) {
		cricketer c = new cricketer();
		c.name="Dhoni";
		c.age=40;
		c.height=5.9f;
		c.weight=70;
		c.runs=12459;
		c.wickets=125;
		c.catches=659;
		c.playing();
		c.exercise();
		System.out.println(c.name);
		System.out.println(c.age);
		System.out.println(c.height);
		System.out.println(c.weight);
		System.out.println(c.runs);
		System.out.println(c.wickets);
        System.out.println(c.catches);
        System.out.println(c.age);


	}

}
