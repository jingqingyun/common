package com.jingqingyun.common.annotation;

import org.springframework.context.annotation.Profile;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static com.jingqingyun.common.Profiles.TEST;
import static com.jingqingyun.common.Profiles.BETA;
import static com.jingqingyun.common.Profiles.PROD;

/**
 * NonDebugProfile
 *
 * @author jingqingyun
 * @date 2021/1/25
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Profile({TEST, BETA, PROD})
public @interface NonDevProfile {
}
