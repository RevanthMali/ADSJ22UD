package generics;
public class BoxObject {
	     private Object data;
		public BoxObject() {};
		public BoxObject(Object data) {this.data=data;} 
		
		public void setData(Object data) {this.data= data;}
		public Object getData() {
			return data;
		}
		@Override
		public String toString() {		
		return "BoxObject [ Data ="+data+"type= "+data.getClass().getSimpleName()+"]";
		}
}
