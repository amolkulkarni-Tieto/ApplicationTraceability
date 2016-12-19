package tieto.at.DomainEntities;
import java.util.HashSet;
import java.util.Set;

public class SllApplication extends ATEntity{
	private String appid;
	private String businessAreaId; 
//	private int sllAppAreaId;   
	private String businessObjectId;
	private String name;
	private String priority;
	private String vendor;
	private String technologies;
	private String databases;
	private String enviornment;
	
	private int integrationscount;
	private int incidentcounts;
	private int problemcount;
	private int changescount;
	private int relasesperyear;
	private String description;
	private SllArea area;
	private Set<SllIntegration> integrations;
	private int applicationid;
	
	public int getApplicationid() {
		return applicationid;
	}




	public void setApplicationid(int applicationid) {
		this.applicationid = applicationid;
	}




	public SllApplication() {
		
		//this.integrations= new HashSet<SllIntegration>();
	}
	

	

	public String getAppid() {
		return appid;
	}

	public void setAppid(String appid) {
		this.appid = appid;
	}

	public String getBusinessAreaId() {
		return businessAreaId;
	}

	public void setBusinessAreaId(String businessAreaId) {
		this.businessAreaId = businessAreaId;
	}

	/*public int getSllAppAreaId() {
		return sllAppAreaId;
	}

	public void setSllAppAreaId(int sllAppAreaId) {
		this.sllAppAreaId = sllAppAreaId;
	}*/

	public String getBusinessObjectId() {
		return businessObjectId;
	}

	public void setBusinessObjectId(String businessObjectId) {
		this.businessObjectId = businessObjectId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public String getTechnologies() {
		return technologies;
	}

	public void setTechnologies(String technologies) {
		this.technologies = technologies;
	}

	public String getDatabases() {
		return databases;
	}

	public void setDatabases(String databases) {
		this.databases = databases;
	}

	public String getEnviornment() {
		return enviornment;
	}

	public void setEnviornment(String enviornment) {
		this.enviornment = enviornment;
	}

	public int getIntegrationscount() {
		return integrationscount;
	}

	public void setIntegrationscount(int integrationscount) {
		this.integrationscount = integrationscount;
	}

	public int getIncidentcounts() {
		return incidentcounts;
	}

	public void setIncidentcounts(int incidentcounts) {
		this.incidentcounts = incidentcounts;
	}

	public int getProblemcount() {
		return problemcount;
	}

	public void setProblemcount(int problemcount) {
		this.problemcount = problemcount;
	}

	public int getChangescount() {
		return changescount;
	}

	public void setChangescount(int changescount) {
		this.changescount = changescount;
	}

	public int getRelasesperyear() {
		return relasesperyear;
	}

	public void setRelasesperyear(int relasesperyear) {
		this.relasesperyear = relasesperyear;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public SllArea getArea() {
		return area;
	}

	public void setArea(SllArea area) {
		this.area = area;
	}

	public Set<SllIntegration> getIntegrations() {
		return integrations;
	}

	public void setIntegrations(Set<SllIntegration> integrations) {
		this.integrations = integrations;
	}


	
	 
	   
	 
	
}
