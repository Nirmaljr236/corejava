package day2;

public class demo2 {

		private int eid;
		private String ename;
		private String ecity;
		
		public void setEid(int eid)
		{
			this.eid =eid;
		}
		public void setEname(String ename)
		{
			this.ename =ename;
		}
		public String getEcity() {
			return ecity;
		}
		public void setEcity(String ecity) {
			this.ecity = ecity;
		}
		public int getEid() {
			return eid;
		}
		public String getEname() {
			return ename;
		}
		@Override
		public String toString() {
			return "demo2 [eid=" + eid + ", ename=" + ename + ", ecity=" + ecity + "]";
		}
		
		

	}


