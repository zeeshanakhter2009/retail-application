package com.retail.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.retail.common.ItemType;
import com.retail.common.UserType;
import com.retail.model.Billing;
import com.retail.model.Items;
import com.retail.model.User;
import com.retail.services.impl.BillingServiceImpl;

public class Init {

	public static void main(String arg[]) {
		double netPayableAmount = 0, billAmount = 0;
		String User_Type, Item_Type;
		int userId = 1001, itemId = 3001, billID = 9001;
		User user = new User();
		List<Items> itemsList = new ArrayList<Items>();
		Scanner scanner = new Scanner(System.in);

		try {

			System.out.println("::::::::::::::::::::::::::::::::::::::::::");
			System.out.println("::::::::::Retail Application :::::::::::::");
			System.out.println("::::::::::::::::::::::::::::::::::::::::::");

			// Set User Details
			user.setID(userId++);
			System.out.println("Enter Customer Name : ");
			user.setName(scanner.nextLine());
			System.out.println(
					"Enter User Type : \n \"E\" For Employee (30% discount),\n \"A\" For Affiliate Customer (10% discount)\n \"L\" For Customers over 2 years with Store (5% discount).");
			User_Type = scanner.nextLine();
			if (User_Type.equalsIgnoreCase("E")) {
				user.setUserType(UserType.EMPLOYEE.toString());
				user.setDiscountPercent(UserType.EMPLOYEE.getUserTypeCode());
			} else if (User_Type.equalsIgnoreCase("A")) {
				user.setUserType(UserType.AFFILIATE.toString());
				user.setDiscountPercent(UserType.AFFILIATE.getUserTypeCode());
			} else if (User_Type.equalsIgnoreCase("L")) {
				user.setUserType(UserType.LOYALTY.toString());
				user.setDiscountPercent(UserType.LOYALTY.getUserTypeCode());
			} else {
				System.out.println(
						"Invalid Customer Type, Press : \n \"E\" For Employee,\n \"A\" For Affiliate Customer \\n \"L\" For Customers over 2 years with Store. ");
			}

//			System.out.println("Number of years with Store : like 5,4,3,1 ");
//			user.setYearsCount(scanner.nextInt());

			// Set Item Details

			System.out.println("Enter Item Type: \n \"H\" For Health, \n \"B\" For Beauty, \n \"G\"  Grocery. ");
			Item_Type = scanner.nextLine();

			if (Item_Type.equalsIgnoreCase("G")) {
				Item_Type = (ItemType.GROCERY.toString());

			} else if (Item_Type.equalsIgnoreCase("B")) {
				Item_Type = (ItemType.BEAUTY.toString());

			} else if (Item_Type.equalsIgnoreCase("H")) {
				Item_Type = (ItemType.HEALTHY.toString());
			}

			System.out.println("Enter how many items you bought ? (Like 1,2 or 3 )");
			int itemCount = scanner.nextInt();

			for (int i = 0; i < itemCount; i++) {
				Items itemObj = new Items();
				itemObj.setId(itemId++);

				System.out.println("Enter Item Name : (Like apple, salt, soap etc.)");

				String itemName = scanner.next();
				itemObj.setItemName(itemName);

				// System.out.println("Enter Item Price : (Like 10, 20, 50 etc.)");
				// itemObj.setItemPrice(new Scanner(System.in).nextInt());
				itemObj.setItemPrice(10); // Setting Default Value
				itemsList.add(itemObj);
			}

			// System.out.println(itemsList.toString());
			// System.out.println(user.toString());

			// Set Billing Details
			System.out.println("Enter Bill Amount : ");
			String amount = scanner.next();
			billAmount = Double.parseDouble(amount);

			Billing billingObj = new Billing();
			billingObj.setID(billID++);
			billingObj.setUser(user);
			billingObj.setItems(itemsList);
			billingObj.setBillAmount(billAmount);
			billingObj.setItemType(Item_Type);

			// System.out.println(billingObj.toString());
			BillingServiceImpl billingServiceImpl = new BillingServiceImpl();
			netPayableAmount = billingServiceImpl.getBillNetAmount(billingObj);

			System.out.println("::::::::::::::::::::::::::::::::::::::::::");
			System.out.println("::::::::::  Customer Bill  :::::::::::::::");
			System.out.println("::::::::::::::::::::::::::::::::::::::::::");
			System.out.println("Net Payable Amount :: " + netPayableAmount);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.useDelimiter(",");
			scanner.close();
		}

	}

}
