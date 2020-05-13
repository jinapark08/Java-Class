package javaapp0513;

public class COMPANY {


		private String companycode; 
		private String companyname;
		private String meterialcode;
		private String sample;
		private String phonenum;
		public String site;
		public COMPANY() {
			super();
			// TODO Auto-generated constructor stub
		}
		public COMPANY(String companycode, String companyname, String meterialcode, String sample, String phonenum,
				String site) {
			super();
			this.companycode = companycode;
			this.companyname = companyname;
			this.meterialcode = meterialcode;
			this.sample = sample;
			this.phonenum = phonenum;
			this.site = site;
		}
		public String getCompanycode() {
			return companycode;
		}
		public void setCompanycode(String companycode) {
			this.companycode = companycode;
		}
		public String getCompanyname() {
			return companyname;
		}
		public void setCompanyname(String companyname) {
			this.companyname = companyname;
		}
		public String getMeterialcode() {
			return meterialcode;
		}
		public void setMeterialcode(String meterialcode) {
			this.meterialcode = meterialcode;
		}
		public String getSample() {
			return sample;
		}
		public void setSample(String sample) {
			this.sample = sample;
		}
		public String getPhonenum() {
			return phonenum;
		}
		public void setPhonenum(String phonenum) {
			this.phonenum = phonenum;
		}
		public String getSite() {
			return site;
		}
		public void setSite(String site) {
			this.site = site;
		}
		@Override
		public String toString() {
			return "COMPANY [companycode=" + companycode + ", companyname=" + companyname + ", meterialcode="
					+ meterialcode + ", sample=" + sample + ", phonenum=" + phonenum + ", site=" + site + "]";
		}
		

	

}
