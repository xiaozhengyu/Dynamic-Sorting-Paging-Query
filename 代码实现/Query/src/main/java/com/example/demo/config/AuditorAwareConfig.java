package com.example.demo.config;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @author xzy
 * @date 2020-08-13 14:48
 * 说明：
 */
@Component("auditorAware")
public class AuditorAwareConfig implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
        String user = "xzy";
        return Optional.ofNullable(user);
    }
}
