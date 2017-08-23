package bcccp.carpark.paystation;

import bcccp.carpark.ICarpark;
import bcccp.tickets.adhoc.IAdhocTicket;

public class PaystationController 
		implements IPaystationController {
	
	private IPaystationUI ui;	
	private ICarpark carpark;

	private IAdhocTicket  adhocTicket = null;
	private float charge;
	
	
	public PaystationController(ICarpark carpark, IPaystationUI ui) {
		this.carpark = carpark;
		this.ui = ui;
	}



	@Override
	public void ticketInserted(String barcode) {
		
		this.adhocTicket = carpark.getAdhocTicket(barcode);
		long entryDateTime = adhocTicket.getEntryDateTime();
		this.charge = carpark.calculateAddHocTicketCharge(entryDateTime);
		
	}



	@Override
	public void ticketPaid() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void ticketTaken() {
		// TODO Auto-generated method stub
		
	}

	
	
}
