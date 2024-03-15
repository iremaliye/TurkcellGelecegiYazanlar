package com.turkcell;

import com.turkcell.Abstract.BaseCustomerManager;
import com.turkcell.Abstract.CustomerCheckService;
import com.turkcell.Business.CustumerCheckManager;
import com.turkcell.Business.NeroCustomerManager;
import com.turkcell.Business.StarbucksCustomerManager;
import com.turkcell.Entities.Customer;

import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BaseCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new CustumerCheckManager());
        BaseCustomerManager neroCustomerManager =new NeroCustomerManager();

        Customer customer = new Customer();
        customer.FirstName="İrem Aliye";
        customer.LastName = "Akman";
        customer.DateOfBirth = new Date(2001,8,26 );
        customer.NationalityId= "11111111111";
        System.out.println(customer);
        }
    }


