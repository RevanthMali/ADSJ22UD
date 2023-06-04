package generics;
public class BoxOnePara <T>{
     private T data;
     public BoxOnePara() {}
	public BoxOnePara(T data) {
		super();
		this.data = data;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "BoxOnePara [data=" + data +"type = "+data.getClass().getSimpleName()+ "]";
	}; 
     
}
