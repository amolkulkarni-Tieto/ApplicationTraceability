package tieto.at.DomainEntities;

public class SllArea extends ATEntity{
	private int areaid;
	private String client;
	private String areaCluster;
	private String area;
	
	public int getAreaid() {
		return areaid;
	}
	public void setAreaid(int areaid) {
		this.areaid = areaid;
	}
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public String getAreaCluster() {
		return areaCluster;
	}
	public void setAreaCluster(String areaCluster) {
		this.areaCluster = areaCluster;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public SllArea() {
		// TODO Auto-generated constructor stub
	}
	
}
