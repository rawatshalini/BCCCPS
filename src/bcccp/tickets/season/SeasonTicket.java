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
		this.ticketId = ticketId;
		this.carparkId = carparkId;
		this.startValidPeriod = startValidPeriod;
		this.endValidPeriod = endValidPeriod;
	}

	@Override
	public String getId() {
		return ticketId;
	}

	@Override
	public String getCarparkId() {
		return carparkId;
	}

	@Override
	public long getStartValidPeriod() {
		return startValidPeriod;
	}

	@Override
	public long getEndValidPeriod() {
		return endValidPeriod;
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
		this.endValidPeriod = dateTime;
	}

	@Override
	public List<IUsageRecord> getUsageRecords() {
		List<IUsageRecord> usageRecords = new ArrayList<IUsageRecord>();
		for(IUsageRecord record : usages)
		{
			usageRecords.add(record);
		}
		return usageRecords;
	}


}
