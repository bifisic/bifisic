package it.csi.sira.backend.metadata;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import it.csi.sira.backend.metadata.business.MetadataManager;
import it.csi.sira.backend.metadata.utils.Constants;
import it.csi.sira.backend.metadata.utils.LogFormatter;

public class Main {

  private static Logger logger = Logger.getLogger(Constants.LOGGER_NAME);

  public static void main(String[] args) {

	logger.info(LogFormatter.format("Main", "main", "BEGIN"));

	ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
	MetadataManager metadataManager = (MetadataManager) ctx.getBean("metadataManager");

	String fileName = "/tmp/metadata-batch-services-";
	if (args.length>0) {
		fileName = args[0];
	}
	
	try {

	  metadataManager.updateMetadata(fileName);

	  //metadataManager.moveOldMetadata();

	  metadataManager.updateMetadataCounters();

	  metadataManager.updateCategoriesCounters();

	} catch (Exception e) {
	  e.printStackTrace();
	  logger.info(LogFormatter.format("Main", "main", "ERROR"));
	  System.exit(1);
	}

	logger.info(LogFormatter.format("Main", "main", "END"));

	System.exit(0);
  }
}
