package app.bada.flower.api.service;

import com.google.common.cache.LoadingCache;

public interface IpBlockedService {
    boolean isBlocked(String key, Integer count);
}
