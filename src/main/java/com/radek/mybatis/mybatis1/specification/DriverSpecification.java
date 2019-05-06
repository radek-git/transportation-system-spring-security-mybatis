package com.radek.mybatis.mybatis1.specification;


import com.radek.mybatis.mybatis1.entity.Driver;
import net.kaczmarzyk.spring.data.jpa.domain.Equal;
import net.kaczmarzyk.spring.data.jpa.web.annotation.And;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;
import org.springframework.data.jpa.domain.Specification;

@And({
        @Spec(path="pesel", spec = Equal.class),
        @Spec(path = "surname", spec=Equal.class)
})
public interface DriverSpecification extends Specification<Driver> {
}
