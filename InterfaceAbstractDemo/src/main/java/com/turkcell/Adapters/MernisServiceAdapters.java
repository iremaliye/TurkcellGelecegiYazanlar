package com.turkcell.Adapters;

import com.turkcell.Abstract.CustomerCheckService;
import com.turkcell.Entities.Customer;

public class MernisServiceAdapters implements CustomerCheckService {

    @Override
    public boolean CheckIfRealPerson(Customer customer) {
        return false;
    }
}
