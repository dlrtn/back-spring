package dlrtn.back_spring.example.application.rate_limit;

import io.github.bucket4j.Bucket;

public interface RateLimiterService {
    Bucket resolveBucket(String apiKey);
}
