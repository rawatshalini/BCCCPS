package bcccp.carpark.exit;

import bcccp.carpark.Carpark;
import bcccp.carpark.ICarSensor;
import bcccp.carpark.ICarSensorResponder;
import bcccp.carpark.ICarpark;
import bcccp.carpark.IGate;
import bcccp.tickets.adhoc.IAdhocTicket;

public class ExitController 
		implements ICarSensorResponder,
		           IExitController {
	
	private IGate exitGate;
	private ICarSensor insideSensor;
	private ICarSensor outsideSensor; 
	private IExitUI ui;
	
	private ICarpark carpark;
	private IAdhocTicket  adhocTicket = null;
	private long exitTime;
	private String seasonTicketId = null;
	
	

	public ExitController(Carpark carpark, IGate exitGate, 
			ICarSensor is,
			ICarSensor os, 
			IExitUI ui) {
		this.carpark = carpark; // assign the value of carpark to carpark
		this.exitGate = exitGate; // assign the value of exitGate to exitGate
		this.insideSensor = is; // assign the value of is to insideSensor 
		this.outsideSensor = os; // assign the value of os to outsideSensor
		this.ui = ui;//assign the value of ui to ui
		}



	@Override
	public void ticketInserted(String ticketStr) {
		System.out.println("Insert Ticket"); // insert ticket method is displayed in on the control pillar
		
	}



	@Override
	public void ticketTaken() {
		System.out.println("Take Ticket"); // Take ticket message is displayed in on the control pillar
		
	}



	@Override
	public void carEventDetected(String detectorId, boolean detected) {
		numberOfCarsParked = numberOfCarsParked - 1; // decrement the number of vehicles by 1
		exitTime = System.currentTimeMillis();  // store the exit time of the customer
        java.util.Date date=new java.util.Date(millis);  

		
	}

	
	
}
