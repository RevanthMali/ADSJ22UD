package generics;
public class Box <T> {
      private T data;
      public Box(T data) {
    	  this.data= data;
      } 
      public Box() {}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
      @Override
    public String toString() {
    	  return "Box [ Data ="+data+" type= "+data.getClass().getSimpleName()+"]";
    }
}
