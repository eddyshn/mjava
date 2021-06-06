package autoConfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;

// use-default-filters 属性的默认值为 true，即使用默认的 Filter 进行包扫描，
// 而默认的 Filter 对标有 @Service,@Controller, @Component和@Repository 的注解的类进行扫描


@Configuration
@ComponentScan(value = "autoConfig", useDefaultFilters = false,
includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Component.class)})
public class AutoConfig {

}