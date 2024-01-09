package Java8;

import java.util.Properties;
import java.util.function.Supplier;

public class ConfigurationManager {
    private Supplier<Properties> configurationSupplier = this::loadConfiguration;

    public static void main(String[] args) {
        ConfigurationManager configManager = new ConfigurationManager();
        Properties configuration = configManager.getConfiguration();

        // Use the loaded configuration
        System.out.println("Loaded Configuration: " + configuration);
    }

    public Properties getConfiguration() {
        return configurationSupplier.get();
    }

    private Properties loadConfiguration() {
        // Simulating loading configuration from a file or another source
        Properties properties = new Properties();
        properties.setProperty("key1", "value1");
        properties.setProperty("key2", "value2");
        // Add more properties as needed

        return properties;
    }
}
