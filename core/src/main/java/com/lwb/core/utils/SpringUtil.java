package com.lwb.core.utils;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @author liuweibo
 * @date 2018/12/24
 */
@Component
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SpringUtil implements BeanFactoryPostProcessor {

    static BeanFactory beanFactory;

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        SpringUtil.beanFactory = configurableListableBeanFactory;
    }

    public static <T> T getBean(String name) {
        return (T) beanFactory.getBean(name);
    }

    public static <T> T getBean(String name, Class<T> clazz) {
        return beanFactory.getBean(name, clazz);
    }

    public static <T> T getBean(Class<T> clazz) {
        return beanFactory.getBean(clazz);
    }
}
