package com.turkcell.Business;

import com.turkcell.Abstract.BaseCustomerManager;
import com.turkcell.Abstract.CustomerCheckService;
import com.turkcell.Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {

    private CustomerCheckService customerCheckService;
    public NeroCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    public NeroCustomerManager() {

    }

    @Override
    public void save(Customer customer) {

            if(customerCheckService.CheckIfRealPerson(customer))
            {
                super.save(customer);
            }throw new RuntimeException("Not a valid person");

    }

    private void CheckIfRealPerson(Customer customer) {

    }


}
