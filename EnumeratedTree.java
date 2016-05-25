import java.util.*;

/*
	@author Luthfi Kurnia Putra
	for Email Simulation Experiment

	@class EnumeratedTree
	class for testing the time for Binary 
	Search Tree process time
*/

public class EnumeratedTree {

	public static void main (String[] args)
	{
		// Provided for random generated input 
		Random rand = new Random();
		long time = Calendar.getInstance().getTimeInMillis();

		// Letter value
		String[] letters = { "A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z" };

		/*
			Experiment 1
			Tree Filled with Integer enumerated index, try to search if the 
			searched elements are there 
		*/
		long integerTime10 ;
		long integerTime100 ;
		long integerTime1000 ;
		long integerTime10000 ;
		long integerTime100000 ;

		BinarySearchTree<IntegerEmail> tree10 = new BinarySearchTree<IntegerEmail>();
		BinarySearchTree<IntegerEmail> tree100 = new BinarySearchTree<IntegerEmail>(); 
		BinarySearchTree<IntegerEmail> tree1000 = new BinarySearchTree<IntegerEmail>(); 
		BinarySearchTree<IntegerEmail> tree10000 = new BinarySearchTree<IntegerEmail>(); 
		BinarySearchTree<IntegerEmail> tree100000 = new BinarySearchTree<IntegerEmail>();  

		ArrayList<Integer> data10 = new ArrayList<Integer>();
		ArrayList<Integer> data100 = new ArrayList<Integer>();
		ArrayList<Integer> data1000 = new ArrayList<Integer>();
		ArrayList<Integer> data10000 = new ArrayList<Integer>();
		ArrayList<Integer> data100000 = new ArrayList<Integer>();

		// gunakan untuk mengukur waktu
		long oldTime = Calendar.getInstance().getTimeInMillis();
		long newTime = Calendar.getInstance().getTimeInMillis();
		boolean temp = false;


		// generate data : IntegerEmail
		for (int i = 0; i < 10000; i++){
			tree10.addIntegerEmail(new IntegerEmail(rand.nextInt(10)), letters[rand.nextInt(10)]);
		}

		// data 10, search email with content 'A'
		oldTime = System.nanoTime();
		//temp = tree10.containsIntegerEmail(new IntegerEmail(rand.nextInt(10)), "Z");
		temp = tree10.containsIntegerEmail(new IntegerEmail(4), "Z");
		newTime = System.nanoTime();

		integerTime10 = newTime - oldTime;
		System.out.println("10 Data dengan Integer : " + integerTime10);

		for (int i = 0; i < 100000; i++){
			tree100.addIntegerEmail(new IntegerEmail(rand.nextInt(10)), letters[rand.nextInt(10)]);
		}

		// data 100, search email with content 'A'
		oldTime = System.nanoTime();
		//temp = tree100.containsIntegerEmail(new IntegerEmail(rand.nextInt(10)), "Z");
		temp = tree100.containsIntegerEmail(new IntegerEmail(4), "Z");
		newTime = System.nanoTime();

		integerTime100 = newTime - oldTime;
		System.out.println("100 Data dengan Integer : " + integerTime100);

		for (int i = 0; i < 1000000; i++){
			tree1000.addIntegerEmail(new IntegerEmail(rand.nextInt(10)), letters[rand.nextInt(10)]);
		}

		// data 1000, search email with content 'A'
		oldTime = System.nanoTime();
		//temp = tree1000.containsIntegerEmail(new IntegerEmail(rand.nextInt(10)), "Z");
		temp = tree1000.containsIntegerEmail(new IntegerEmail(4), "Z");
		newTime = System.nanoTime();

		integerTime1000 = newTime - oldTime;
		System.out.println("1000 Data dengan Integer : " + integerTime1000);

		for (int i = 0; i < 10000000; i++){
			tree10000.addIntegerEmail(new IntegerEmail(rand.nextInt(10)), letters[rand.nextInt(10)]);
		}

		// data 10000, search email with content 'A'
		oldTime = System.nanoTime();
		//temp = tree10000.containsIntegerEmail(new IntegerEmail(rand.nextInt(10)), "Z");
		temp = tree10000.containsIntegerEmail(new IntegerEmail(4), "Z");
		newTime = System.nanoTime();

		integerTime10000 = newTime - oldTime;
		System.out.println("10000 Data dengan Integer : " + integerTime10000);

		for (int i = 0; i < 100000000; i++){
			tree100000.addIntegerEmail(new IntegerEmail(rand.nextInt(10)), letters[rand.nextInt(10)]);
		}

		// data 100000, search email with content 'A'
		oldTime = System.nanoTime();
		//temp = tree100000.containsIntegerEmail(new IntegerEmail(rand.nextInt(10)), "Z");
		temp = tree100000.containsIntegerEmail(new IntegerEmail(4), "Z");
		newTime = System.nanoTime();

		integerTime100000 = newTime - oldTime;
		System.out.println("100000 Data dengan Integer : " + integerTime100000);



		tree10 = new BinarySearchTree<IntegerEmail>();
		tree100 = new BinarySearchTree<IntegerEmail>(); 
		tree1000 = new BinarySearchTree<IntegerEmail>(); 
		tree10000 = new BinarySearchTree<IntegerEmail>(); 
		tree100000 = new BinarySearchTree<IntegerEmail>();  

		// generate data : StringEmail
		for (int i = 0; i < 10000; i++){
			tree10.addStringEmail(new StringEmail(letters[rand.nextInt(10)]), letters[rand.nextInt(10)]);
		}

		// data 10, search email with content 'A'
		oldTime = System.nanoTime();
		//temp = tree10.containsStringEmail(new StringEmail(letters[rand.nextInt(26)]),"Z");
		temp = tree10.containsStringEmail(new StringEmail("M"),"Z");
		newTime = System.nanoTime();

		integerTime10 = newTime - oldTime;
		System.out.println("10 Data dengan String : " + integerTime10);

		for (int i = 0; i < 100000; i++){
			tree100.addStringEmail(new StringEmail(letters[rand.nextInt(10)]), letters[rand.nextInt(10)]);
		}

		// data 100, search email with content 'A'
		oldTime = System.nanoTime();
		//temp = tree100.containsStringEmail(new StringEmail(letters[rand.nextInt(26)]),"Z");
		temp = tree100.containsStringEmail(new StringEmail("M"),"Z");
		newTime = System.nanoTime();

		integerTime100 = newTime - oldTime;
		System.out.println("100 Data dengan String : " + integerTime100);

		for (int i = 0; i < 1000000; i++){
			tree1000.addStringEmail(new StringEmail(letters[rand.nextInt(10)]), letters[rand.nextInt(10)]);
		}

		// data 1000, search email with content 'A'
		oldTime = System.nanoTime();
		//temp = tree1000.containsStringEmail(new StringEmail(letters[rand.nextInt(26)]), "Z");
		temp = tree1000.containsStringEmail(new StringEmail("M"),"Z");
		newTime = System.nanoTime();

		integerTime1000 = newTime - oldTime;
		System.out.println("1000 Data dengan String : " + integerTime1000);

		for (int i = 0; i < 10000000; i++){
			tree10000.addStringEmail(new StringEmail(letters[rand.nextInt(10)]), letters[rand.nextInt(10)]);
		}

		// data 10000, search email with content 'A'
		oldTime = System.nanoTime();
		//temp = tree10000.containsStringEmail(new StringEmail(letters[rand.nextInt(26)]), "Z");
		temp = tree10000.containsStringEmail(new StringEmail("M"),"Z");
		newTime = System.nanoTime();

		integerTime10000 = newTime - oldTime;
		System.out.println("10000 Data dengan String : " + integerTime10000);

		for (int i = 0; i < 100000000; i++){
			tree100000.addStringEmail(new StringEmail(letters[rand.nextInt(10)]), letters[rand.nextInt(10)]);
		}

		// data 100000, search email with content 'A'
		oldTime = System.nanoTime();
		//temp = tree100000.containsStringEmail(new StringEmail(letters[rand.nextInt(26)]), "Z");
		temp = tree100000.containsStringEmail(new StringEmail("M"),"Z");
		newTime = System.nanoTime();

		integerTime100000 = newTime - oldTime;
		System.out.println("100000 Data dengan String : " + integerTime100000);
	}
}