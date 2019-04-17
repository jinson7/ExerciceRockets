package api;

import java.util.Scanner;
import controllers.RocketController;

public class PresentationController {
	
	private RocketController ctrlRockect;
	private static Scanner sc = new Scanner(System.in);

	public PresentationController() {
		ctrlRockect = RocketController.getInstance();
	}
	
	public void run() {
		ctrlRockect.set("32WESSDS", 10, 20, 80);
		ctrlRockect.set("LDSFJA32", 30,40,50,50,30,10);
		int option = -1;
		while (option != 0) {
			System.out.println("#############################");
			System.out.print("####   List of Rockets   ####\n");
			System.out.println("#############################");
			System.out.print(ctrlRockect.getAll());
			System.out.print("Choose a Rocket or 0 to exit: ");
			try {
				option = sc.nextInt();
				System.out.println();
				if (option > 0) {
					int indexRocket = option;
					while (option != 0) {
						System.out.print(ctrlRockect.getData(indexRocket));	
						System.out.print("Choose a propeller or 0 to exit: ");
						option = sc.nextInt();
						if (option > 0) {
							System.out.println();
							int nPropeller = option;
							System.out.println("###################");
							System.out.println("**   MAIN MENU   **");
							System.out.println("###################");
							System.out.println("1) Accelerate.");
							System.out.println("2) Decelerate.");
							System.out.println("3) Brake.");
							System.out.println("0) Exit.");
							System.out.print("Choose an option: ");
							option = sc.nextInt();
							System.out.println();
							switch (option) {
								case 1:
									ctrlRockect.accelerate(indexRocket, nPropeller);
									break;
								case 2:
									ctrlRockect.decelerate(indexRocket, nPropeller);
									break;
								case 3:
									ctrlRockect.brake(indexRocket, nPropeller);
									break;
							}	
						}
					}
				}
			} catch (Exception e) {
				System.out.println("xxxxxxxxxxxxxxxxxxxxxxxx");
				System.out.println(e.getMessage());
				System.out.println("xxxxxxxxxxxxxxxxxxxxxxxx\n");
			}
		}
	}
}
