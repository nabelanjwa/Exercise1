//Author: Nabila Najwa binti Md Johari
public class Driver {
	public static void main(String [] arg) {
		//Fish actually is a data type
		//Fish nemo; == int x;
		Fish nemo = new Fish(); //nemo adalah object, Fish adalah kelas

		nemo.Swim();
		nemo.color = "red"; //tukar value
		nemo.Swim();

		Fish dory = new Fish(); //another object
		dory.Swim();
	}

}