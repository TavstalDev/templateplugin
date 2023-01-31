package com.tavstal.Helpers;

import java.util.logging.Logger;

public class LoggerHelper {
    
    private static final Logger _logger = Logger.getLogger("TemplateLogger");
    private static final String Name = "Template";

    public static void LogInfo(String text) {
        _logger.info(String.format("[%s] %s", Name, text));
    }

    public static void LogWarning(String text) {
        _logger.warning(String.format("[%s] %s", Name, text));
    }
}
