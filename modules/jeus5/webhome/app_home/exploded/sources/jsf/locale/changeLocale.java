package jsf.locale;

import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/*
*	en 영어
*	fr 프랑스어
*	zh 중어
*	de 독어
*	ja 일어
*	ko 한국어
*/

public class changeLocale {

    private Map<String, Locale> locales = null;


    public changeLocale() {
        locales = new HashMap<String, Locale>(7);
		locales.put("German", Locale.GERMANY);
		locales.put("English", Locale.ENGLISH);
        locales.put("France", Locale.FRENCH);
		locales.put("Japan", Locale.JAPANESE);
		locales.put("Korea", Locale.KOREAN);
		locales.put("China", Locale.CHINESE);
    }

    public void chooseLocale(ActionEvent event) {
        String current = event.getComponent().getId();
        FacesContext context = FacesContext.getCurrentInstance();
        context.getViewRoot().setLocale(locales.get(current));
    }

    static Class loadClass(String name, Object fallbackClass) throws ClassNotFoundException {
        ClassLoader loader = getCurrentLoader(fallbackClass);
        return loader.loadClass(name);
    }

    static ClassLoader getCurrentLoader(Object fallbackClass) {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        if (loader == null) {
            loader = fallbackClass.getClass().getClassLoader();
        }
        return loader;
    }
}
