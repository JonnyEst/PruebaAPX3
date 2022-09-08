package com.bbva.wikj;

import com.bbva.elara.transaction.AbstractTransaction;
import com.bbva.wikj.dto.testapx.DataIn;
import com.bbva.wikj.dto.testapx.DataOutTest;

/**
 * In this class, the input and output data is defined automatically through the setters and getters.
 */
public abstract class AbstractWIKJT00101COTransaction extends AbstractTransaction {

	public AbstractWIKJT00101COTransaction(){
	}

	protected DataIn getData(){
		DataIn dataIn = new DataIn();
		dataIn.setAmount(1000000);
		dataIn.setFrecuency("M");
		dataIn.setPercentageInterest(10);
		dataIn.setNumberInstalments(4);

		return dataIn;
	}

	protected void setData(final DataOutTest field){
		this.addParameter("data", field);
	}


}
