package hometaskpudge;

import java.io.Serializable;
import java.util.Locale;
import java.util.ResourceBundle;

public class TypeOfTranslate implements Serializable {

    private final String mes = "MessageBundle";
    private final String defaultLanuage = "en";
    private final String defaultCountry = "EN";

    private transient ResourceBundle bundle;
    private transient Locale locale;
    private String language;
    private String country;

    public TypeOfTranslate() {     
    }

    public void setLanguage(String s) {
        language = s.toLowerCase();
        country = s.toUpperCase();

        locale = new Locale(language, country);
        bundle = ResourceBundle.getBundle(mes, locale);
    }

    public String getLanguage() {
        return language == null ? defaultLanuage : language;
    }

    public String getString(String key) {
        try {
            return bundle.getString(key);
        } catch (Exception ex) {
            return null;
        }
    }
}
