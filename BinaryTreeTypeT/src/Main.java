import java.util.Scanner;

public class Main {

	public static Scanner sc = new Scanner(System.in);
	public static Controller controller = new Controller();

	public static void main(String[] args) {

		System.out.println("Give me ancestor name ");
		String aName = sc.nextLine();
		System.out.println("Give me ancestor Heigth ");
		String height = sc.nextLine();
		double aHeight = Double.parseDouble(height);
		controller.saveAncestor(aName, aHeight);

		while (true) {

			System.out.println("---  Family Tree Menu ---");
			System.out.println("     1. Add new Child    ");
			System.out.println("     2. Check Child    ");
			System.out.println("     3. Display Tree    ");
			System.out.println("     0. Exit    ");
			String ans = sc.nextLine();
			if (ans.equals("1"))
				addChildInTree();
			else if (ans.equals("2"))
				chekNameIfExist();
			else if (ans.equals("3"))
				printAll();
			else if (ans.equals("0"))
				break;
			else {
				System.out.println("Wrong choise!");
			}
		}
		System.out.println("Thanks for use!!!\n\n");
	}

	private static void chekNameIfExist() {
		System.out.println("Give me name ");
		String name = sc.nextLine();
		if (controller.exists(name)) {
			System.out.println("Found " + name + " in tree");
		} else {
			System.out.println("NOT Found " + name + " in tree");
		}
	}

	private static void printAll() {
		controller.printAll();
	}

	private static void addChildInTree() {
		System.out.println("Give me parent name ");
		String pName = sc.nextLine();
		
		if (controller.exists(pName)) {
			System.out.println("Give me child name ");
			String aName = sc.nextLine();
			System.out.println("Give me child Heigth ");
			String height = sc.nextLine();
			double aHeight = Double.parseDouble(height);
			controller.saveChild(pName, aName, aHeight);
			
		} else {
			System.out.println("Not found " + pName + " parent ");
		}
	}

}
