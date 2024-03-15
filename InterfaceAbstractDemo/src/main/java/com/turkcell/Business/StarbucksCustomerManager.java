package com.turkcell.Business;

import com.turkcell.Abstract.BaseCustomerManager;
import com.turkcell.Abstract.CustomerCheckService;
import com.turkcell.Abstract.CustomerService;
import com.turkcell.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

    CustomerCheckService customerCheckService;
    public StarbucksCustomerManager(CustomerCheckService customerCheckService){
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void save  (Customer customer)
    {
        if(customerCheckService.CheckIfRealPerson(customer))
        {
            super.save(customer);
        }throw new RuntimeException("Not a valid person");
    }

    private void CheckIfRealPerson(Customer customer) {

    }


}
