package com.techlab.crudable.test;

import com.techlab.crudable.AddressDb;
import com.techlab.crudable.CustomerDb;
import com.techlab.crudable.ICrudable;
import com.techlab.crudable.InvoiceDb;

public class CrudableTest {

	public static void main(String[] args) {

		ICrudable aobj = new AddressDb();
		doDbOperations(aobj);

		ICrudable cobj = new CustomerDb();
		doDbOperations(cobj);

		ICrudable iobj = new InvoiceDb();
		doDbOperations(iobj);

	}

	public static void doDbOperations(ICrudable obj) {
		System.out.println("\n----" + obj + "-----");
		obj.create();
		obj.read();
		obj.update();
		obj.delete();
	}

}
