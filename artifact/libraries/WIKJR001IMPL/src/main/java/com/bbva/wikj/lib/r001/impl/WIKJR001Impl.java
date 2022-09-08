package com.bbva.wikj.lib.r001.impl;

import com.bbva.wikj.dto.testapx.DataIn;
import com.bbva.wikj.dto.testapx.DataOutTest;
import com.bbva.wikj.dto.testapx.PaymentListOut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * The WIKJR001Impl class...
 */
public class WIKJR001Impl extends WIKJR001Abstract {

	private static final Logger LOGGER = LoggerFactory.getLogger(WIKJR001Impl.class);

	/**
	 * The execute method...
	 */
	@Override
	public DataOutTest execute(DataIn dataIn) {

		if(dataIn.getFrecuency()=="A"){
			dataIn.setNumberInstalments(convertirMeses(dataIn));
		}

		List<PaymentListOut> lstPaymentOut = new ArrayList<>();

		for(int i=0;i<dataIn.getNumberInstalments();i++){
			lstPaymentOut.add(responseInteres(dataIn));
		}

		DataOutTest dataOutTest = new DataOutTest();
		dataOutTest.setAmount(dataIn.getAmount()+metodoInteres(dataIn));
		dataOutTest.setInterestTotal(metodoInteres(dataIn));
		dataOutTest.setFrecuency(dataIn.getFrecuency());
		dataOutTest.setInstalments(lstPaymentOut);

		return dataOutTest;
	}


	public static int metodoInteres(DataIn dataIn){
		int interes=(dataIn.getAmount()*dataIn.getPercentageInterest())/100;
		return interes;
	}

	public static PaymentListOut responseInteres(DataIn dataIn){
		PaymentListOut paymentListOut = new PaymentListOut();
		int montly=dataIn.getAmount()/dataIn.getNumberInstalments();
		paymentListOut.setMonthlyAmount(montly);
		paymentListOut.setMonthlyInterest((montly*dataIn.getPercentageInterest())/100);
		paymentListOut.setTotalAmount((dataIn.getAmount()+metodoInteres(dataIn))/dataIn.getNumberInstalments());

		return paymentListOut;
	}

	public static int convertirMeses(DataIn dataIn){
		int meses= dataIn.getNumberInstalments()*12;
		return meses;
	}
}
