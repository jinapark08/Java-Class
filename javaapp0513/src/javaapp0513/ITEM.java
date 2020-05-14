package javaapp0513;

import java.sql.Date;

public class ITEM {


		private String code; 
		private String name;
		private String country;
		private String unit;
		private int price;
		private Date receivedate;
		public ITEM() {
			super();
			// TODO Auto-generated constructor stub
		}
		public ITEM(String code, String name, String country, String unit, int price, Date receivedate) {
			super();
			this.code = code;
			this.name = name;
			this.country = country;
			this.unit = unit;
			this.price = price;
			this.receivedate = receivedate;
		}
		public String recevedate() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public String getUnit() {
			return unit;
		}
		public void setUnit(String unit) {
			this.unit = unit;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public String getCode() {
			return code;
		}
		public Date getReceivedate() {
			return receivedate;
		}
		public void setReceivedate(Date receivedate) {
			this.receivedate = receivedate;
		}
		@Override
		public String toString() {
			return "ITEM [code=" + code + ", name=" + name + ", country=" + country + ", unit=" + unit + ", price="
					+ price + "]";
		}	


}
