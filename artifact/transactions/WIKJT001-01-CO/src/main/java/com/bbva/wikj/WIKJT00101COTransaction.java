package com.bbva.wikj;

import com.bbva.elara.domain.transaction.Severity;
import com.bbva.wikj.dto.testapx.DataOutTest;
import com.bbva.wikj.lib.r001.WIKJR001;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Transaction APX
 *
 */
public class WIKJT00101COTransaction extends AbstractWIKJT00101COTransaction {

	private static final Logger LOGGER = LoggerFactory.getLogger(WIKJT00101COTransaction.class);

	/**
	 * The execute method...
	 */
	@Override
	public void execute() {
		LOGGER.info("Starting execute WIKJT00101COTransaction {}", getData());
		WIKJR001 wikjr001 = (WIKJR001)getServiceLibrary(WIKJR001.class);
		// TODO

		DataOutTest dataOutTest = wikjr001.execute(getData());

		if(dataOutTest!=null){
			LOGGER.info("Result execute successful");
			setData(dataOutTest);

			this.setSeverity(Severity.OK);
		}else{
			LOGGER.info("Result execute fail");
			this.setSeverity(Severity.ENR);
		}

	}

}
