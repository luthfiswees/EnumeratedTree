/*
 * Devon Blandin
 * Assignment 3 :: CSC383 (SSII)
 * August 4th, 2012
*/

public class BSTTest
{
	public static void main(String[] args)
	{
            System.out.println("\nTesting with Integers");
            // create binary search tree for Integers
            // BinarySearchTree()
            BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();

            // add integers
            // add(T value)
            System.out.println("\nAdding 20 random integers to tree");
            for (int i = 0; i < 20; i++)
            {
                int randomNumber = (int) (Math.random() * 100 - 50 + 1);
                tree.add(randomNumber);
            }
            
            // print tree
            // print()
            System.out.println("\nPrinting tree");
            tree.print();
            
            // check contains method
            // contains(T value)
            for (int i = 0; i < 10; i++)
            {
                int randomNumber = (int) (Math.random() * 100 - 50 + 1);
                System.out.println("Does tree contain " + randomNumber + "? : " + tree.contains(randomNumber));
            }
            // getMax()
            System.out.println("Tree Max: " + tree.getMax()); // check getMax
            // getMin()
            System.out.println("Tree Min: " + tree.getMin()); // check getMin
            // getDepth()
            System.out.println("Tree Depth: " + tree.getDepth()); // check getDepth
            // getNumLeaves()
            System.out.println("Number of leaves: " + tree.getNumLeaves()); // check getNumLeaves

            // print it sideways
            // printSideways()
            System.out.println("---------- Printing Sideways ------------");
            tree.printSideways();

            System.out.println("\nTesting with Strings");

            // String letter array to populate binary search tree with
            String[] letters = { "A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z" };

            // create binary search tree for Strings
            // BinarySearchTree()
            BinarySearchTree<String> tree2 = new BinarySearchTree<String>();

            // add letters
            // add()
            System.out.println("\nAdding 20 random letters to tree");
            for (int i = 0; i < 20; i++)
            {
                int randomNumber = (int) (Math.random() * letters.length);
                tree2.add(letters[randomNumber]);
            }

            // print tree
            // print()
            System.out.println("\nPrinting tree");
            System.out.println(tree2);

            // check contains method
            // contains(T value)
            for (int i = 0; i < 10; i++)
            {
                int randomNumber = (int) (Math.random() * letters.length);
                System.out.println("Does tree contain " + letters[randomNumber] + "? " + tree2.contains(letters[randomNumber]));
            }
            
            // getMax()
            System.out.println("Tree Max: " + tree2.getMax()); //check getMax
            // getMin()
            System.out.println("Tree Min: " + tree2.getMin()); // check getMin
            // getDepth()
            System.out.println("Tree Depth: " + tree2.getDepth()); // check getDepth
            // getNumLeaves()
            System.out.println("Number of leaves: " + tree2.getNumLeaves()); // check getNumLeaves

            // print it sideways
            // printSideways()
            System.out.println("---------- Printing Sideways ------------");
            tree2.printSideways();
	} // end main
} // end BSTTest
