package bcccp.tickets.adhoc;

import java.util.Date;

public class AdhocTicket implements IAdhocTicket {
	
	private String carparkId;
	private int ticketNo;
	private long entryDateTime;
	private long paidDateTime;
	private long exitDateTime;
	private float charge;
	private String barcode;

	
	
	public AdhocTicket(String carparkId, int ticketNo, String barcode) {
		this.carparkId = carparkId;
		this.ticketNo = ticketNo;
		this.barcode = barcode;
	}



	@Override
	public int getTicketNo() {
		return ticketNo; //returns ticketNo
	}


	@Override
	public String getBarcode() {
		return barcode;
	}


	@Override
	public String getCarparkId() {
		return carparkId;
	}


	@Override
	public void enter(long dateTime) {
		this.entryDateTime = dateTime;
	}


	@Override
	public long getEntryDateTime() {
		return entryDateTime;//returns entryDateTime
	}


	@Override
	public boolean isCurrent() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void pay(long dateTime, float charge) {
		this.paidDateTime = dateTime;
		this.charge = charge;
	}


	@Override
	public long getPaidDateTime() {
		return paidDateTime; //return paidDateTime
	}


	@Override
	public boolean isPaid() {
		if(this.paidDateTime == 0)
			return false;
		else
			return true;
	}


	@Override
	public float getCharge() {
		return charge; // returns charge
		}

	@Override
	public void exit(long dateTime) {
		this.exitDateTime = dateTime;
		
	}


	@Override
	public long getExitDateTime() {
		return exitDateTime; //returns exitDateTime
	}


	@Override
	public boolean hasExited() {
		if(this.exitDateTime == 0)
			return false;
		else
			return true;
	}

	
	
}
