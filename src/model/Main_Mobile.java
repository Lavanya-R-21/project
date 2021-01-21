package model;

import java.text.ParseException;
import java.util.Scanner;

public class Main_Mobile {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the Mobile Brand:");
		String name = sc.nextLine();
		MobileBrand mbrand=new MobileBrand();
		mbrand.setName(name);
		int choice=4;
		do {
			System.out.println("1.Add Mobile\r\n" + 
					"2.Delete Mobile\r\n" + 
					"3.Display Mobiles\r\n" + 
					"4.Exit\r\n" + 
					"Enter your choice:\r\n" + 
					"");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				//add
				String detail=sc.nextLine();
				if(detail.equals(""))
					detail=sc.nextLine();
				Mobile mobile = Mobile.createMobile(detail);
				mbrand.addMobileToMobileBrand(mobile);
				break;
			case 2:
				//delete
				System.out.println("Enter the reference id of the mobile to be deleted:");
				String referenceId=sc.nextLine();
				if(referenceId.equals(""))
					referenceId=sc.nextLine();
				Boolean isRemoved = mbrand.removeMobileFromMobileBrand(referenceId);
				if(!isRemoved)
					System.out.println("Mobile not found in the Mobile Brand");
				else
					System.out.println("Mobile successfully deleted");
				break;
			case 3:
				//display
				System.out.println("Mobiles in "+mbrand.getName());
				mbrand.displayMobiles();
			}
		}while(choice<4);
	}

}
