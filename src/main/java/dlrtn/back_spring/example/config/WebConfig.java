package dlrtn.back_spring.example.config;

import dlrtn.back_spring.example.common.interceptor.TokenBucketInterceptor;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@RequiredArgsConstructor
public class WebConfig implements WebMvcConfigurer {

    private final TokenBucketInterceptor tokenBucketInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(tokenBucketInterceptor)
                .addPathPatterns("/example/**");
    }
}
