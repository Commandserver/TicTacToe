import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GetPropertyValues {
    InputStream inputStream;

    public String getValue(String value) throws IOException {
        String result = null;
        try {
            Properties prop = new Properties();
            String propFileName = "config/config.properties";

            inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

            if (inputStream != null) {
                prop.load(inputStream);
            } else {
                throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
            }

            result = prop.getProperty(value);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            assert inputStream != null;
            inputStream.close();
        }
        return result;
    }
}