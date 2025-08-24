package Collections;

public class Key {
 String key;
 Key(String key){
	 this.key=key;
	
 }
 @Override
 public int hashCode() {
	 int hash=(int)key.charAt(0);
	 System.out.println("HashCode for key : " + key + " = " + hash);
	 return hash;
 }
 
 @Override
 public boolean equals(Object obj) {
	 return key.equals(((Key)obj).key);
 }
}
