package com.in28minutes.rest.webservices.restfulwebservices.filtering;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class FilteringController {
    @GetMapping("/filtering")
    public SomeBean retrieveSomeBean() {
        return new SomeBean("value1", "value2", "value2");
    }

    @GetMapping("/filtering-list")
    public List<SomeBean> retrieveListBeans() {
        return Arrays.asList(new SomeBean("value1", "value2", "value3"), new SomeBean("value13", "value23", "value33"));
    }
}
