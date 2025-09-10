package au.abc;

import java.util.Date;
import java.util.UUID;

public class AlertService {

	private AlertDAO alertDAO;

	public AlertService(AlertDAO alertDAO) {
		this.alertDAO = alertDAO;
	}

	public Date getAlertTime(UUID uuid) {
		return alertDAO.getAlert(uuid);
	}
	
	public UUID raiseAlert(Date date) {
		return alertDAO.addAlert(date);
	}
}
