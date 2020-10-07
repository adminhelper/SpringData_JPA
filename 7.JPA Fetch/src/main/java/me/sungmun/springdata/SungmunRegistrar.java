package me.sungmun.springdata;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class SungmunRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions (AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry, BeanNameGenerator importBeanNameGenerator) {
        GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
        beanDefinition.setBeanClass(Sungmun.class);
        beanDefinition.getPropertyValues().add("name", "sungmunbyeon");

        registry.registerBeanDefinition("sungmun",beanDefinition);
    }
}
