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
		return barcode;//returns barcode
	}


	@Override
	public String getCarparkId() {
		return carparkId; // returns carparkId


	@Override
	public void enter(long dateTime) {
		// TODO Auto-generated method stub
		
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
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public float getCharge() {
		return charge; // returns charge
		}


	@Override
	public void exit(long dateTime) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public long getExitDateTime() {
		return exitDateTime; //returns exitDateTime
	}


	@Override
	public boolean hasExited() {
		// TODO Auto-generated method stub
		return false;
	}

	
	
}
