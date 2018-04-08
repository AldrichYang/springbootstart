package viewResolver;

import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.xml.MappingJackson2XmlView;

import java.util.Locale;

/**
 * Created by yh on 2018/4/8.
 */

public class XmlViewResolver implements ViewResolver {

    /**
     * Get the view to use.
     */
    @Override
    public View resolveViewName(String viewName, Locale locale) {
        MappingJackson2XmlView view = new MappingJackson2XmlView();
//        view.setModelKey("requestParams");
        return view;
    }
}
