
# Import logging and set the configurations
import logging
# logging.basicConfig(level=logging.DEBUG)
logging.basicConfig(filename="logFile.txt", level=logging.DEBUG)

# Program code and any debug statements
print("This is a program output")
logging.debug("This is a debug output")

# Logging levels
logging.debug("Debug Message")
logging.info("Info Message")
logging.warning("Warning Message")
logging.error("Error Message")
logging.critical("Critical Message")

# To disable any logging critical and below
logging.disable(logging.CRITICAL)
logging.debug("This should not be visible")

# For logging to file, use "tail -f logFile.txt" to display the last 10 lines of the log file
# and show updates as they occur to the file
