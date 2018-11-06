package utilities;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingUtility implements LoggingUtilityI{
	private String msgToLog; 
	private final Logger PMLogger = Logger.getLogger("Pantry Management");
	private final Level PMLevel = PMLogger.getLevel();
	public void logEvent(String from, String eventToLog) {
		msgToLog = "[Call from ] : " + from;
		msgToLog = " [Message] : " + eventToLog;
		PMLogger.log(PMLevel, msgToLog);
	}

}
