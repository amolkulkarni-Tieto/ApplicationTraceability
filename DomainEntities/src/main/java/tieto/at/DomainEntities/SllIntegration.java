package tieto.at.DomainEntities;

public class SllIntegration extends ATEntity{
	private int id;
	private String appid;
	private String processid;
	private String inboundappid;
	private String outboundappid;
	private String integrationdescription;
	private String toolused;
	private String datafiles;
	private String appserverid;
	
	public SllIntegration() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getInboundappid() {
		return inboundappid;
	}
	public void setInboundappid(String inboundappid) {
		this.inboundappid = inboundappid;
	}
	
	public String getAppid() {
		return appid;
	}
	public void setAppid(String appid) {
		this.appid = appid;
	}
	public String getProcessid() {
		return processid;
	}
	public void setProcessid(String processid) {
		this.processid = processid;
	}
	public String getOutboundappid() {
		return outboundappid;
	}
	public void setOutboundappid(String outboundappid) {
		this.outboundappid = outboundappid;
	}
	public String getIntegrationdescription() {
		return integrationdescription;
	}
	public void setIntegrationdescription(String integrationdescription) {
		this.integrationdescription = integrationdescription;
	}
	public String getToolused() {
		return toolused;
	}
	public void setToolused(String toolused) {
		this.toolused = toolused;
	}
	public String getDatafiles() {
		return datafiles;
	}
	public void setDatafiles(String datafiles) {
		this.datafiles = datafiles;
	}
	public String getAppserverid() {
		return appserverid;
	}
	public void setAppserverid(String appserverid) {
		this.appserverid = appserverid;
	}

	
}
