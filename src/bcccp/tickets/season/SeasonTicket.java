package bcccp.tickets.season;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SeasonTicket implements ISeasonTicket {
	
	private List<IUsageRecord> usages;
	private IUsageRecord currentUsage = null;
	
	private String ticketId;
	private String carparkId;
	private long startValidPeriod;
	private long endValidPeriod;
	
	public SeasonTicket (String ticketId, 
			             String carparkId, 
			             long startValidPeriod,
			             long endValidPeriod) {
		
		this.ticketId = ticketId; //assign the value of ticketId to ticketId
		this. carparkId = carparkId; //assign the value of carparkId to carparkId
		this.startValidPeriod = startValidPeriod;//assign the value of startValidPeriod to startValidPeriod
		this.endValidPeriod = endValidPeriod//assign the value of  endValidPeriod to endValidPeriod
	}

	@Override
	public String getId() {
		//this method returns the id of season customer 
		return null;
	}

	@Override
	public String getCarparkId() {
				return carparkId; //this method returns the carparkId 
			}

	@Override
	public long getStartValidPeriod() {
    return startValidPeriod;
	}

	@Override
	public long getEndValidPeriod() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean inUse() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void recordUsage(IUsageRecord record) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IUsageRecord getCurrentUsageRecord() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void endUsage(long dateTime) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<IUsageRecord> getUsageRecords() {
		// TODO Auto-generated method stub
		return null;
	}


}
