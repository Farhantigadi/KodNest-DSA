package InnerClass.InnerStaticClass;

class ConfigurationManager {
    static class DatabaseConfig {
        private static String url;
        private static String username;
        private static String password;

        public static void setConfig(String url, String username, String password) {
            DatabaseConfig.url = url;
            DatabaseConfig.username = username;
            DatabaseConfig.password = password;
        }

        public static String getConnectionString() {
            return "URL: " + url + ", Username: " + username + ", Password: " + password;
        }
    }
}

public class Main2 {
    public static void main(String[] args) {
        ConfigurationManager.DatabaseConfig.setConfig("jdbc:mysql://localhost:3306/mydb", "admin", "password123");
        System.out.println("Initial Configuration:");
        System.out.println(ConfigurationManager.DatabaseConfig.getConnectionString());

        ConfigurationManager.DatabaseConfig.setConfig("jdbc:postgresql://localhost:5432/newdb", "user", "newpass456");
        System.out.println("\nUpdated Configuration:");
        System.out.println(ConfigurationManager.DatabaseConfig.getConnectionString());
    }
}