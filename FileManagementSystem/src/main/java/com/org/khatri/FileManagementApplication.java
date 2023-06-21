package com.org.khatri;

import java.util.Scanner;

import com.org.khatri.objects.FileManagementSystem;

public class FileManagementApplication {

	public static void main(String[] args) {

		FileManagementSystem fms = new FileManagementSystem();
		Scanner sc = new Scanner(System.in);
		Boolean isContinue = true;
		System.out.println("Welcome to our File Management Application.");
		System.out.println("HELLO!!");
		System.out.println("This Application is developed by Shweta Khatri!!");
		System.out.println("-------------------------------------------------------------------------------------------");
		do {

			System.out.println("Please select required option from below menu :");
			System.out.println("1. Retrieve the current files present in the directory");
			System.out.println("2. Perform other actions(Add/delete/Search) on the directory");
			System.out.println("3. Exit");

			int option = sc.nextInt();
			switch (option) {
			case 1: {
				fms.printFilesInDirectorySorted();
				continue;
			}
			case 2: {
				System.out.println("What do you want to do?");
				System.out.println("a. Add a new file in the directory");
				System.out.println("b. Delete a specified file from the directory");
				System.out.println("c. Search a specified file in the directory");
				System.out.println("d. Navigate to previous Menu");
				String action = sc.next();
				String fileName;
				switch (action) {
				case "a": {
					System.out.println("Enter the file name with extension to be added");
					fileName = sc.next();
					fms.addFileInDirectory(fileName);
					continue;

				}

				case "b": {
					System.out.println("Enter the file name with extension to be deleted");
					fileName = sc.next();
					fms.deleteFilefromDirectory(fileName);
					continue;

				}
				case "c": {
					System.out.println("Enter the file name with extension to be searched");
					fileName = sc.next();
					fms.searchFileInDirectory(fileName);
					continue;

				}
				case "d": {
					continue;

				}
				default:
					System.out.println("Wrong Option selected");
				}
				continue;
			}
			case 3: {
				sc.close();
				isContinue = false;
				continue;

			}
			default:
				System.out.println("Wrong Option selected");

			}
			System.out.println("Do you wish to continue?[Yes/No]");
			String choice = sc.next();
			if (choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("y"))
				isContinue = true;
			else {
				sc.close();
				break;
			}

		} while (isContinue);

		System.out.println("Thankyou for choosing our File Management Application. \nHave a Great Day!!");

	}

}
