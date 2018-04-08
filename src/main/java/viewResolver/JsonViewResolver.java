package viewResolver;

import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import java.util.Locale;

/**
 * Created by yh on 2018/4/8.
 */

public class JsonViewResolver implements ViewResolver {
    @Override
    public View resolveViewName(String viewName, Locale locale) {
        MappingJackson2JsonView view = new MappingJackson2JsonView();
        view.setPrettyPrint(true);
        return view;
    }
}
