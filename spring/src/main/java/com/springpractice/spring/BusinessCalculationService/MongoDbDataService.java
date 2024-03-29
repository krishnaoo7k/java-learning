package com.springpractice.spring.BusinessCalculationService;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier("MongoDbDataService")
public class MongoDbDataService implements DataService {
    public int[] retrieveData() {
        return new int[]{11, 22, 33, 44, 55};
    }
}
