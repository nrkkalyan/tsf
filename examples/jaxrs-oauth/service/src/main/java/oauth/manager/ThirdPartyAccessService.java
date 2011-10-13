/**
 * Copyright (C) 2011 Talend Inc. - www.talend.com
 */
package oauth.manager;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import oauth.common.Calendar;
import oauth.service.UserAccounts;

@Path("/calendar")
public class ThirdPartyAccessService {

    private UserAccounts accounts;
	
	public void setAccounts(UserAccounts accounts) {
		this.accounts = accounts;
	}
	
	@GET
	public Calendar getUserCalendar(@QueryParam("user") String userName) {
		return accounts.getAccount(userName).getCalendar();
	}
	
}
