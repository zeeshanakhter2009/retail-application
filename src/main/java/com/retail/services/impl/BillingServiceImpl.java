package com.retail.services.impl;

import com.retail.common.ItemType;
import com.retail.model.Billing;
import com.retail.services.BillingService;

public class BillingServiceImpl implements BillingService {

	public double getBillNetAmount(Billing billing) {
		double discount = 0, billAmountAfterDiscount = 0, netPayableAmount = 0, specialDiscount = 0;

		if (billing.getItemType().equalsIgnoreCase(ItemType.GROCERY.toString())) {
			if (billing.getBillAmount() > 100) {

				// For every $100 on the bill, there would be a $ 5 discount (e.g. for $ 990,
				// you get $ 45 as a discount).
				specialDiscount = billing.getBillAmount() / 100 > 0 ? (5 * (billing.getBillAmount() / 100)) : 0;
				netPayableAmount = billing.getBillAmount() - specialDiscount;
			} else {
				netPayableAmount = billing.getBillAmount();
			}

		} else {
			discount = ((billing.getBillAmount() * billing.getUser().getDiscountPercent()) / 100);
			billAmountAfterDiscount = billing.getBillAmount() - discount;
			netPayableAmount = billAmountAfterDiscount - ((5 * billAmountAfterDiscount) / 100);

		}
		// System.out.printf("Net_Payable_Amount=%1$s\n" + "\r\n", netPayableAmount);

		return netPayableAmount;

	}

}
